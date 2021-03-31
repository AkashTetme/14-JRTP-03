package com.akash.controller;

import java.util.List;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.akash.entity.Contact;
import com.akash.service.Contact_Service;

@Controller
public class CreateContactController {
	
	private Contact_Service contact_service;
	
	public CreateContactController(Contact_Service contact_service) {
		this.contact_service = contact_service;
	}

	@GetMapping("/home")
	public String home(Model model) {
		Contact cobj = new Contact();
		model.addAttribute("contact", cobj);
		
		return "contact";
	}
	
	@PostMapping("/saveContact")
	public String saveContacthandler(Contact contact, Model model) {
		
		  boolean saveContact = contact_service.saveContact(contact);
		  
		  if (saveContact) { model.addAttribute("SuccMsg", "Contact Saved"); } else {
		  model.addAttribute("FailMsg", "Contact Failed"); }
		 
		
		return "contact";
	}
	
	@GetMapping("/allContacts")
	public String getContactsHandler(Model model) {
		
		List<Contact> contacts = contact_service.getContacts();
		
		model.addAttribute("contacts", contacts);
		
		return "All_Contacts";
	}

}
