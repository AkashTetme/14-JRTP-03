package com.akash.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.entity.Contact;

@Repository
public interface Contact_Repository extends JpaRepository<Contact, Integer>{

}
