package com.valuelabcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.valuelabcheckin.dto.Contact;

@Component
public class ValuelabServicesImpl implements ValuelabServices {

	@Override
	public Contact showContactDetails(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Contact contact = restTemplate.getForObject("http://localhost:8080/valuelab/contact/"+id, Contact.class);
		return contact;
	}

}
