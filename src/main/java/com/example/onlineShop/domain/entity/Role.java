package com.example.onlineShop.domain.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Table(name = "role")
@Entity
public class Role {

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Role() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;


    @Column(name = "role_name")
    private String roleName;


}
