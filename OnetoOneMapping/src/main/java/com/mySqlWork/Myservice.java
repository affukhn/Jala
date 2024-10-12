package com.mySqlWork;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Myservice {

    @Autowired
    private StudentRespo stu;

    @Autowired
    private AddressRespo adu;

    @Transactional
    public void save()
    {
        Student s= new Student("Arfath",987649683);
        Address a= new Address("24 street","Bangalore","karnataka");
        AlternateAddress at =new AlternateAddress("Money Bank","Bangalore");
        s.setAddress_id(a);

        stu.save(s);

    }
    @Transactional
    public void fetch()
    {
        Student p =stu.findById(1).get();
        System.out.println(p);
        System.out.println(p.getAddress_id().getCity());

    }

    @Transactional
    public void getStudentFromAddress()
    {
        Address adr=adu.findById(1).get();
        System.out.println(adr);
//        Student student=adr.getStudent();
//        System.out.println(student);

    }
}
