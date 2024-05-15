package com.example.ashokit.customeexceptionrepository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ashokit.customeexception.CustomeExcpetion;

@Repository
public interface CustomeRepository extends JpaRepository<CustomeExcpetion, Serializable> {

}
