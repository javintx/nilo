package com.gbsoft.nilo.repository.application.user;

import com.gbsoft.nilo.repository.RepositoryBase;
import com.gbsoft.nilo.repository.application.user.entity.User;
import com.gbsoft.nilo.repository.entity.Identifiable;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserRepository<U extends User, I extends Identifiable<?>> extends RepositoryBase<U, I> {
}
