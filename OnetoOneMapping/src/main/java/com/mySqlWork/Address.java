package com.mySqlWork;

import jakarta.persistence.*;

@Entity
@Table(name="Addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    private  String houseAddress;

    private String City;

    private String state;



    @OneToOne(mappedBy = "address_id",fetch = FetchType.LAZY)
    private Student student;

    public Address() {
    }

    public Address(String houseAddress, String city, String state) {
        this.houseAddress = houseAddress;
        City = city;
        this.state = state;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", houseAddress='" + houseAddress + '\'' +
                ", City='" + City + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
