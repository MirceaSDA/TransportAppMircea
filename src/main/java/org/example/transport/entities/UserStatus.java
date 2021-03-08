package org.example.transport.entities;

import javax.persistence.*;

@Entity
@Table(name = "userStatus")
public class UserStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userStatusId")
    private Integer userStatusId;

    @Column(name = "userStatusDescription")
    private String userStatusDescription;

    public UserStatus() {

    }

    public Integer getUserStatusId() {
        return userStatusId;
    }

    public void setUserStatusId(Integer userStatusId) {
        this.userStatusId = userStatusId;
    }

    public String getUserStatusDescription() {
        return userStatusDescription;
    }

    public void setUserStatusDescription(String userStatusDescription) {
        this.userStatusDescription = userStatusDescription;
    }
}
