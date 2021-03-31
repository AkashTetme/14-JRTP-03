package com.akash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akash.entity.Contact;

@Service
public interface Contact_Service {

	boolean saveContact(Contact contact);
	
	Contact getContact(Integer id);
	
	boolean deleteContact(Integer id);
	
	List<Contact> getContacts();
}
