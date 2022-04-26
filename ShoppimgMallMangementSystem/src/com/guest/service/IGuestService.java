package com.guest.service;

import com.guest.entities.GuestBook;

public interface IGuestService {
	
	
	
	public abstract GuestBook addGuest(GuestBook guestbook);
	
	public abstract GuestBook updateGuest(GuestBook guestbook);
	
	public abstract GuestBook deleteGuest(GuestBook guestbook);
	
	public abstract GuestBook findGuestById(int id);

}
