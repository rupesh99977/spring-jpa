package com.battles.got.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class King {
    @Id
    @GeneratedValue
    private Long id;
//    @Column(unique = true, nullable = false)
    private String name;
    private String house;

    protected King() {
    }

    public King(String name, String house) {
        this.name = name;
        this.house = house;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
