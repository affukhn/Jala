package com.mySqlWork;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Students")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

//    cascadetype.persist use to save data in address tables don't  use add.save() method;
    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name="address_id")
    private Address address_id;





//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name="address_id")
//    private Address address_id;

    @Column(name="Name")
    private String Name;

    @Column(name="mobile")
    private int mobile;




    public Student() {
    }

    public Student(String name, int mobile) {
        Name = name;
        this.mobile=mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public Address getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Address address_id) {
        this.address_id = address_id;
    }
}
