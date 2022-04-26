package com.guest.client;

import java.time.LocalDateTime;

import com.guest.entities.GuestBook;
import com.guest.service.GuestServiceImpl;
import com.guest.service.IGuestService;

public class Client {

	public static void main(String[] args) {
	
		
		IGuestService service = new GuestServiceImpl();
		GuestBook gbook = new GuestBook();
		
		 //Create Operation
		gbook.setId(1);
		gbook.setName("sajid");
		gbook.setType("Normal");
		gbook.setDatetime(LocalDateTime.now());
	
		gbook.setAdmin("Access");
		gbook.setCustomer("customer");
		
		service.addGuest(gbook);
		
		
		
		// Retrieve Operation
		gbook = service.findGuestById(1);
		System.out.print("ID:"+gbook.getId());
		System.out.println(" Name:"+gbook.getName());
		System.out.println(" Type:"+gbook.getType());
		System.out.println(" date:"+gbook.getDatetime());
		System.out.println(" admin:"+gbook.getAdmin());
		System.out.println(" customer:"+gbook.getCustomer());
		
		
		
		// Update Operation
		gbook = service.findGuestById(1);
		gbook.setName("Usman");
		service.updateGuest(gbook);
		
		
		// delete Operation
		gbook = service.findGuestById(1);
		service.deleteGuest(gbook);
		
		

		
		
	
		

	}

}
