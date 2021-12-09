package com.gbsoft.nilo.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gbsoft.nilo.dto.DtoBase;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;
import java.util.logging.Logger;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Ignore
@WebMvcTest(ControllerBase.class)
public abstract class ControllerBaseTest<IO extends DtoBase<?>, E extends EntityBase<?>, I extends Identifiable<?>> {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ServiceBase<E, I> service;

    @MockBean
    private Logger LOGGER;

    @MockBean
    private MapperBase<IO, E> mapper;

    @WithMockUser(value = "spring")
    @Test
    public void givenIdentifiable_whenReadEntity_thenReturnEntity() throws Exception {

        E entity = getEntity();

        given(service.read(getIdentifiable())).willReturn(Optional.of(entity));

        mvc.perform(get(getPath() + "/get")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(getIdentifiable()))
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is("alex.getName()")));
    }

    protected String mapToJson(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }

    protected abstract E getEntity();

    protected abstract I getIdentifiable();

    protected abstract String getPath();
}
