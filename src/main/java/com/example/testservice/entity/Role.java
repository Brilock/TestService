package com.example.testservice.entity;

import org.hibernate.annotations.Table;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(appliesTo = "t_role")
public class Role implements GrantedAuthority {
    @Id
    private Long id;
    private String name;
    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {

    }

    public Role(Long id) {

    }

    @Override
    public String getAuthority() {
        return null;
    }
}
