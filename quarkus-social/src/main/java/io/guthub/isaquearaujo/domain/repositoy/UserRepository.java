package io.guthub.isaquearaujo.domain.repositoy;

import io.guthub.isaquearaujo.quarkussocial.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository <User>{
}
