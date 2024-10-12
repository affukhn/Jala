package com.mySqlWork;

import jakarta.persistence.*;

@Entity
public class AlternateAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;

    @Column(name = "Name")
    private String name;

    @Column(name="City")
    private  String City;

    public AlternateAddress( String name, String city) {
        this.name = name;
        City = city;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
