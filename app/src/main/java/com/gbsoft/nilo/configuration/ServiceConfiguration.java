package com.gbsoft.nilo.configuration;

import com.gbsoft.nilo.domain.application.alert.Alert;
import com.gbsoft.nilo.domain.application.language.Language;
import com.gbsoft.nilo.domain.consumer.Kid;
import com.gbsoft.nilo.domain.consumer.Tutor;
import com.gbsoft.nilo.domain.entity.EntityBase;
import com.gbsoft.nilo.domain.entity.Identifiable;
import com.gbsoft.nilo.domain.playschool.Center;
import com.gbsoft.nilo.domain.playschool.Classroom;
import com.gbsoft.nilo.domain.playschool.ClassroomCategory;
import com.gbsoft.nilo.domain.playschool.Manager;
import com.gbsoft.nilo.domain.playschool.Teacher;
import com.gbsoft.nilo.service.ServiceBase;
import com.gbsoft.nilo.service.application.alert.AlertService;
import com.gbsoft.nilo.service.application.language.LanguageService;
import com.gbsoft.nilo.service.audit.AuditService;
import com.gbsoft.nilo.service.consumer.KidService;
import com.gbsoft.nilo.service.consumer.TutorService;
import com.gbsoft.nilo.service.playschool.CenterService;
import com.gbsoft.nilo.service.playschool.ClassroomCategoryService;
import com.gbsoft.nilo.service.playschool.ClassroomService;
import com.gbsoft.nilo.service.playschool.ManagerService;
import com.gbsoft.nilo.service.playschool.TeacherService;
import com.gbsoft.nilo.service.port.out.ReadRepositoryBase;
import com.gbsoft.nilo.service.port.out.WriteRepositoryBase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    public <E extends EntityBase<?>, I extends Identifiable<?>> ReadRepositoryBase<E, I> readRepositoryBase() {
        return null;
    }

    @Bean
    public <E extends EntityBase<?>, I extends Identifiable<?>> WriteRepositoryBase<E, I> writeRepositoryBase() {
        return null;
    }

    @Bean
    public AuditService auditService() {
        return new AuditService(readRepositoryBase(), writeRepositoryBase());
    }

    @Bean
    public ServiceBase<ClassroomCategory, Identifiable<String>> classroomCategoryService() {
        return new ClassroomCategoryService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }

    @Bean
    public ServiceBase<Classroom, Identifiable<String>> classroomService() {
        return new ClassroomService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }

    @Bean
    public ServiceBase<Center, Identifiable<String>> centerService() {
        return new CenterService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }

    @Bean
    public ServiceBase<Teacher, Identifiable<String>> teacherService() {
        return new TeacherService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }

    @Bean
    public ServiceBase<Manager, Identifiable<String>> managerService() {
        return new ManagerService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }

    @Bean
    public ServiceBase<Alert, Identifiable<String>> alertService() {
        return new AlertService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }

    @Bean
    public ServiceBase<Language, Identifiable<String>> languageService() {
        return new LanguageService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }

    @Bean
    public ServiceBase<Tutor, Identifiable<String>> tutorService() {
        return new TutorService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }

    @Bean
    public ServiceBase<Kid, Identifiable<String>> kidService() {
        return new KidService(readRepositoryBase(), writeRepositoryBase(), auditService());
    }
}
