package com.fametro.usermanagement.enums;

public enum UserRole {
    ADMIN(1L),
    USER(2L);

    private Long role;

    UserRole(Long role){
        this.role = role;
    }

    public Long getRole(){
        return role;
    }
}