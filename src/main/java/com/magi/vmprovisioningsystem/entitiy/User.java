package com.magi.vmprovisioningsystem.entitiy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String emailId;
    private String mobileNumber;
    private String password;
    private boolean role;

    public User(Long id, String username, String emailId, String mobileNumber, String password, boolean role) {
        this.id = id;
        this.username = username;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.role = role;
    }
}
