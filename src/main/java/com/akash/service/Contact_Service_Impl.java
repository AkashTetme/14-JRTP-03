package com.akash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.akash.entity.Contact;
import com.akash.repsitory.Contact_Repository;

@Service
public class Contact_Service_Impl implements Contact_Service{
	
	private Contact_Repository contact_repo;

	public Contact_Service_Impl(Contact_Repository contact_repo) {
		this.contact_repo = contact_repo;
	}

	@Override
	public boolean saveContact(Contact contact) {
		return contact_repo.save(contact)!=null;
	}

	@Override
	public Contact getContact(Integer id) {
		try {
			Optional<Contact> findById = contact_repo.findById(id);
			if(findById.isPresent()) {
				return findById.get();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteContact(Integer id) {
		boolean isDeleted = false;
		try {
			contact_repo.deleteById(id);
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public List<Contact> getContacts() {
		return contact_repo.findAll();
	}

}
