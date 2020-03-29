package com.gbsoft.nilo.rest;

import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.rest.dto.DtoBase;
import com.gbsoft.nilo.rest.mapper.Mapper;
import com.gbsoft.nilo.rest.mapper.MapperException;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.logging.Logger;

@RestController
public abstract class ControllerBase<IO extends DtoBase<? extends Serializable>, E extends EntityBase<? extends Serializable>> {

    private final Logger LOGGER;
    private final ServiceBase<E> service;
    private final Mapper<IO, E> mapper;

    @Autowired
    public ControllerBase(final ServiceBase<E> service, final Mapper<IO, E> mapper, final String clazz) {
        this.LOGGER = Logger.getLogger(clazz);
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public IO create(final IO in) throws RestException {
        LOGGER.entering(this.getClass().getName(), "create", in);
        try {
            return mapper.dto(service.create(mapper.entity(in)));
        } catch (MapperException e) {
            LOGGER.throwing(this.getClass().getName(), "create", e);
            throw new RestException(e);
        }
    }

    @GetMapping
    public IO read(final Identifiable<?> id) throws RestException {
        LOGGER.entering(this.getClass().getName(), "read", id);
        try {
            return mapper.dto(service.read(id).orElseThrow(() -> new RestException(String.format("Entity with id %s not found", id.getId()))));
        } catch (MapperException e) {
            LOGGER.throwing(this.getClass().getName(), "read", e);
            throw new RestException(e.getMessage());
        }
    }

    @PutMapping
    public IO update(final IO in) throws RestException {
        LOGGER.entering(this.getClass().getName(), "update", in);
        try {
            return mapper.dto(service.update(mapper.entity(in)));
        } catch (MapperException e) {
            LOGGER.throwing(this.getClass().getName(), "update", e);
            throw new RestException(e);
        }
    }

    @DeleteMapping
    public void delete(final IO in) throws RestException {
        LOGGER.entering(this.getClass().getName(), "read", in);
        try {
            service.delete(mapper.entity(in));
        } catch (MapperException e) {
            LOGGER.throwing(this.getClass().getName(), "delete", e);
            throw new RestException(e);
        }
    }
}
