package com.battles.got.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Place {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true, nullable = false)
    private String Location;
    private String Region;

    protected Place() {
    }

    public Place(String location, String region) {
        Location = location;
        Region = region;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }
}
