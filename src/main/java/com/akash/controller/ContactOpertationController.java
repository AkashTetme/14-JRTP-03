package com.akash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akash.entity.Contact;
import com.akash.service.Contact_Service;

@Controller
public class ContactOpertationController {
	
	private Contact_Service contact_service;
	
	public ContactOpertationController(Contact_Service contact_service) {
		this.contact_service = contact_service;
	}
	
	@GetMapping("/edit")
	public String updateContactHandler(@RequestParam("cid") Integer id, Model model) {
		Contact upContact = contact_service.getContact(id);
		model.addAttribute("contact", upContact);
		return "contact" ;
	}
	
	@GetMapping("/delete")
	public String deleteContactHandler(@RequestParam("cid") Integer id, Model model) {
		boolean deleteContact = contact_service.deleteContact(id);
		
		if(deleteContact) {
			model.addAttribute("SuccMsg", "Contact Deleted");
		}else {
			model.addAttribute("SuccMsg", "Delete Failed");
		}
		return "redirect:allContacts";
	}
	
}
