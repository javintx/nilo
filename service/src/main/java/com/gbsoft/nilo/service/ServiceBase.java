package com.gbsoft.nilo.service;

import com.gbsoft.nilo.repository.NiloRepository;
import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.logging.Logger;

@Service
public abstract class ServiceBase<E extends EntityBase<? extends Serializable>> {

    private final Logger LOGGER;
    private final NiloRepository<E> repository;

    @Autowired
    public ServiceBase(final NiloRepository<E> repository, final String clazz) {
        this.LOGGER = Logger.getLogger(clazz);
        this.repository = repository;
    }

    public E create(final E in) {
        LOGGER.entering(this.getClass().getName(), "create", in);
        return repository.save(in);
    }

    public E read(final Identifiable<? extends Serializable> id) throws ServiceException {
        LOGGER.entering(this.getClass().getName(), "read", id);
        return repository.findById(id).orElseThrow(() -> new ServiceException(String.format("Entity with id %s not found", id.getId())));
    }

    public E update(final E in) {
        LOGGER.entering(this.getClass().getName(), "update", in);
        return repository.save(in);
    }

    public void delete(final E in) {
        LOGGER.entering(this.getClass().getName(), "delete", in);
        repository.delete(in);
    }
}
