package com.gbsoft.nilo.audit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gbsoft.nilo.audit.entity.Audit;
import com.gbsoft.nilo.audit.entity.AuditType;
import com.gbsoft.nilo.audit.mapper.AuditMapper;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.audit.AuditService;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Ignore
@WebMvcTest(AuditController.class)
public class AuditControllerTest /*extends ControllerBaseTest<AuditDto, Audit, Identifiable<String>>*/ {

    private final String uid = UUID.randomUUID().toString();
    @Autowired
    private MockMvc mvc;
    @MockBean
    private AuditService service;
    @MockBean
    private Logger LOGGER;
    @MockBean
    private AuditMapper mapper;

    //@Override
    protected Audit getEntity() {
        Audit test = new Audit();
        test.setUid(uid);
        test.setInstant(Instant.now());
        test.setEntity("entity");
        test.setType(AuditType.READ);
        test.setOriginator("originator");
        test.setOriginal("original");
        test.setModified("modified");
        return test;
    }

    //@Override
    protected Identifiable<String> getIdentifiable() {
        return () -> uid;
    }

    //@Override
    protected String getPath() {
        return "/audit";
    }

    @WithMockUser(value = "spring")
    @Test
    public void givenIdentifiable_whenReadEntity_thenReturnEntity() throws Exception {

        Audit entity = getEntity();

        given(service.read(getIdentifiable())).willReturn(Optional.of(entity));

        mvc.perform(get(getPath() + "/get")
                        //.contentType(MediaType.APPLICATION_JSON)
                        .content(mapToJson(getEntity())))
                //.accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    protected String mapToJson(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }
}
