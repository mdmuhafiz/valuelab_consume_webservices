package com.valuelabcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.valuelabcheckin.dto.Contact;
import com.valuelabcheckin.integration.ValuelabServices;

@Controller
public class ValueLabCheckInController {
	@Autowired
	private ValuelabServices valuelabServices;
	
	@RequestMapping("/viewValueLabCheckInPage")
	public String viewValueLabCheckInPage() {
		
		return "checkinapp";
	}
	@RequestMapping("/verifyValueLabCheckIn")
	public String verifyValueLabCheckIn(@RequestParam("id") long id,ModelMap model) {
		Contact contact = valuelabServices.showContactDetails(id);
		model.addAttribute("contact", contact);
		return "showContactDetails";
	}

}
