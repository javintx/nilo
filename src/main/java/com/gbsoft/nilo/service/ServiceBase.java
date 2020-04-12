package com.gbsoft.nilo.service;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.entity.EntityBase;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.audit.events.CreateAuditEvent;
import com.gbsoft.nilo.service.audit.events.DeleteAuditEvent;
import com.gbsoft.nilo.service.audit.events.ReadAuditEvent;
import com.gbsoft.nilo.service.audit.events.UpdateAuditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.logging.Logger;

public abstract class ServiceBase<E extends EntityBase<?>, I extends Identifiable<?>> {

    @Autowired
    private Logger LOGGER;
    @Autowired
    private RepositoryBase<E, I> repository;
    @Autowired
    private AuditService auditService;

    public Page<E> all(Pageable pageable) {
        LOGGER.entering(this.getClass().getName(), "all");
        auditService.audit(new ReadAuditEvent(null));
        return repository.findAll(pageable);
    }

    public E create(final E in) {
        LOGGER.entering(this.getClass().getName(), "create", in);
        auditService.audit(new CreateAuditEvent(in, null));
        return repository.save(in);
    }

    public Optional<E> read(final I id) {
        LOGGER.entering(this.getClass().getName(), "read", id);
        auditService.audit(new ReadAuditEvent(null));
        return repository.findById(id);
    }

    public E update(final E in) {
        LOGGER.entering(this.getClass().getName(), "update", in);
        // TODO: Add update logic
        auditService.audit(new UpdateAuditEvent(repository.getOne((I) in), in, null));
        return repository.save(in);
    }

    public void delete(final E in) {
        LOGGER.entering(this.getClass().getName(), "delete", in);
        auditService.audit(new DeleteAuditEvent(in, null));
        repository.delete(in);
    }

    protected Logger getLogger() {
        return LOGGER;
    }

    protected RepositoryBase<E, I> getRepository() {
        return repository;
    }
}
