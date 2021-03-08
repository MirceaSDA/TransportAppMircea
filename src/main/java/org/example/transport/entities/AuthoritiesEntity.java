package org.example.transport.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authorities")
public class AuthoritiesEntity implements Serializable {

    @Id
    @Column(length = 20)
    private String username;

    @OneToOne
    @JoinColumn(name = "username")
    private Users users;

    @Column(name = "authority")
    private String authority;

    public AuthoritiesEntity() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
