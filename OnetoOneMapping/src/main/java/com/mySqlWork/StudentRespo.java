package com.mySqlWork;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.function.Supplier;

public  interface StudentRespo extends JpaRepository<Student,Integer>{


}
