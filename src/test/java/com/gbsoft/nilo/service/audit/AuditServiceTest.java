package com.gbsoft.nilo.service.audit;

import com.gbsoft.nilo.repository.audit.entity.Audit;
import com.gbsoft.nilo.repository.audit.entity.AuditType;
import com.gbsoft.nilo.repository.entity.Identifiable;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.ServiceBaseTest;
import org.junit.Ignore;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.util.UUID;

@Ignore
public class AuditServiceTest extends ServiceBaseTest<Audit, Identifiable<String>> {

    private final String uid = UUID.randomUUID().toString();

    @Override
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

    @Override
    protected Identifiable<String> getIdentifiable() {
        return () -> uid;
    }

    @TestConfiguration
    static class Context {

        @Bean
        public ServiceBase<Audit, Identifiable<String>> service() {
            return new AuditService();
        }
    }
}
