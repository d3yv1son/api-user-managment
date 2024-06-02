package com.fametro.usermanagement.entity;

import javax.persistence.*;

@Entity
@Table(name="UserHistoric")

public class UserHistoric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id_user;

    private String type;
    private String description;

    public UserHistoric(String type, String description){
        this.type = type;
        this.description = description;
    }

    public Long getId_user() {
        return id_user;
    }
    public void setId_user(Long id_user){
        this.id_user = id_user;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
