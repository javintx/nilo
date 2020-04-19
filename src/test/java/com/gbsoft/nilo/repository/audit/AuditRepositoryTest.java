package com.gbsoft.nilo.repository.audit;

import com.gbsoft.nilo.repository.RepositoryBaseTest;
import com.gbsoft.nilo.repository.audit.entity.Audit;
import com.gbsoft.nilo.repository.audit.entity.AuditType;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.junit.Ignore;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Ignore
public class AuditRepositoryTest extends RepositoryBaseTest<Audit, Identifiable<String>> {
    private final String uid = UUID.randomUUID().toString();

    @Override
    protected Audit getEntity() {
        Audit test = new Audit();
        //test.setUid(uid);
        test.setInstant(Instant.now());
        test.setEntity("entity");
        test.setType(AuditType.READ);
        test.setOriginator("originator");
        test.setOriginal("original");
        test.setModified("modified");
        return test;
    }

    @Override
    protected Identifiable<String> getIdentifiable() {
        return new Audit();
    }

}
