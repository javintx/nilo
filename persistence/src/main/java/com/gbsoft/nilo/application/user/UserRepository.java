package com.gbsoft.nilo.application.user;

import com.gbsoft.nilo.RepositoryBase;
import com.gbsoft.nilo.domain.application.user.User;
import com.gbsoft.nilo.domain.entity.Identifiable;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserRepository<U extends User, I extends Identifiable<?>> extends RepositoryBase<U, I> {
}
