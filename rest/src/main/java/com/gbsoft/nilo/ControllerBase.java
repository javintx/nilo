package com.gbsoft.nilo;

import com.gbsoft.nilo.dto.DtoBase;
import com.gbsoft.nilo.mapper.MapperBase;
import com.gbsoft.nilo.mapper.MapperException;
import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.logging.Logger;

public abstract class ControllerBase<IO extends DtoBase<?>, E extends EntityBase<?>, I extends Identifiable<?>> {

    @Autowired
    private Logger LOGGER;
    @Autowired
    private ServiceBase<E, I> service;
    @Autowired
    private MapperBase<IO, E> mapper;

    @GetMapping("/")
    public Page<IO> all(Pageable pageable) throws RestException {
        LOGGER.entering(this.getClass().getName(), "all", pageable);
        // TODO: Pending to transform pageable from E to IO
        /*Page<E> es = service.all(pageable);
        List<IO> ios = es.get().collect(e -> mapper.dto(e));
        return new PageImpl<IO>(ios);*/
        return null;
    }

    @PostMapping("/add")
    public IO create(final IO in) throws RestException {
        LOGGER.entering(this.getClass().getName(), "create", in);
        try {
            return mapper.dto(service.create(mapper.entity(in)));
        } catch (MapperException e) {
            LOGGER.throwing(this.getClass().getName(), "create", e);
            throw new RestException(e);
        }
    }

    @GetMapping("/get")
    public IO read(final I id) throws RestException {
        LOGGER.entering(this.getClass().getName(), "read", id);
        try {
            return mapper.dto(service.read(id).orElseThrow(() -> new RestException(String.format("Entity with id %s not found", id.getId()))));
        } catch (MapperException e) {
            LOGGER.throwing(this.getClass().getName(), "read", e);
            throw new RestException(e.getMessage());
        }
    }

    @PutMapping("/update")
    public IO update(final IO in) throws RestException {
        LOGGER.entering(this.getClass().getName(), "update", in);
        try {
            return mapper.dto(service.update(mapper.entity(in)));
        } catch (MapperException e) {
            LOGGER.throwing(this.getClass().getName(), "update", e);
            throw new RestException(e);
        }
    }

    @DeleteMapping("/delete")
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
