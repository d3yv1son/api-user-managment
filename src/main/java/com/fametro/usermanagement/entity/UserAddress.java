package com.fametro.usermanagement.entity;

import javax.persistence.*;

@Entity
@Table(name="UserAddress") //tabela no banco

public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_address;

    private String road;
    private int number;
    private String complement;

    public UserAddress(String road, int number, String complement) {
        this.road = road;
        this.number = number;
        this.complement = complement;
    }

    public Long getId_address() {
        return id_address;
    }
    public void setId_address(Long id_address) {
        this.id_address;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
