package com.gbsoft.nilo.rest;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.dto.DtoBase;
import com.gbsoft.nilo.rest.mapper.MapperBase;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public abstract class ControllerBase<IO extends DtoBase<?>, E extends EntityBase<?>> {

    private final Logger LOGGER;
    private final ServiceBase<E> service;
    private final MapperBase<IO, E> mapper;

    @Autowired
    public ControllerBase(final ServiceBase<E> service, final MapperBase<IO, E> mapper, final String clazz) {
        this.LOGGER = Logger.getLogger(clazz);
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public IO create(final IO in) throws RestException {
        LOGGER.entering(this.getClass().getName(), "create", in);
        return mapper.dto(service.create(mapper.entity(in)));
    }

    @GetMapping
    public IO read(final Identifiable<?> id) throws RestException {
        LOGGER.entering(this.getClass().getName(), "read", id);
        try {
            return mapper.dto(service.read(id));
        } catch (ServiceException e) {
            LOGGER.throwing(this.getClass().getName(), "read", e);
            throw new RestException(e.getMessage());
        }
    }

    @PutMapping
    public IO update(final IO in) throws RestException {
        LOGGER.entering(this.getClass().getName(), "update", in);
        return mapper.dto(service.update(mapper.entity(in)));
    }

    @DeleteMapping
    public void delete(final IO in) throws RestException {
        LOGGER.entering(this.getClass().getName(), "read", in);
        service.delete(mapper.entity(in));
    }
}