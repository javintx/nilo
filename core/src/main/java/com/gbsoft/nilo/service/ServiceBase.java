package com.gbsoft.nilo.service;

import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.events.CreateAuditEvent;
import com.gbsoft.nilo.domain.events.DeleteAuditEvent;
import com.gbsoft.nilo.domain.events.ReadAuditEvent;
import com.gbsoft.nilo.domain.events.UpdateAuditEvent;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public abstract class ServiceBase<E extends EntityBase<?>, I extends Identifiable<?>> {

    private final Logger LOGGER;
    private final ReadRepositoryBase<E, I> readRepository;
    private final WriteRepositoryBase<E, I> writeRepository;
    private final AuditService auditService;

    protected ServiceBase(final String logger, final ReadRepositoryBase<E, I> readRepository, final WriteRepositoryBase<E, I> writeRepository, final AuditService auditService) {
        this.LOGGER = Logger.getLogger(logger);
        this.readRepository = readRepository;
        this.writeRepository = writeRepository;
        this.auditService = auditService;
    }

    public List<E> all(/*Pageable pageable*/) {
        LOGGER.entering(this.getClass().getName(), "all");
        auditService.audit(new ReadAuditEvent(null));
        return readRepository.findAll();
    }

    public E create(final E in) {
        LOGGER.entering(this.getClass().getName(), "create", in);
        auditService.audit(new CreateAuditEvent(in, null));
        return writeRepository.save(in);
    }

    public Optional<E> read(final I id) {
        LOGGER.entering(this.getClass().getName(), "read", id);
        auditService.audit(new ReadAuditEvent(null));
        return readRepository.findById(id);
    }

    public E update(final E in) {
        LOGGER.entering(this.getClass().getName(), "update", in);
        // TODO: Add update logic
        auditService.audit(new UpdateAuditEvent(readRepository.getOne((I) in.getId()), in, null));
        return writeRepository.save(in);
    }

    public void delete(final E in) {
        LOGGER.entering(this.getClass().getName(), "delete", in);
        auditService.audit(new DeleteAuditEvent(in, null));
        writeRepository.delete(in);
    }

    protected Logger getLogger() {
        return LOGGER;
    }

    protected ReadRepositoryBase<E, I> getReadRepository() {
        return readRepository;
    }

    protected WriteRepositoryBase<E, I> getWriteRepository() {
        return writeRepository;
    }
}
