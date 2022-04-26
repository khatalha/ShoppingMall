package com.guestbook.repository;

import com.guest.entities.GuestBook;

public interface IGuestRepository {
	
	
	public abstract GuestBook addGuest(GuestBook guestbook);
	
	public abstract GuestBook updateGuest(GuestBook guestbook);
	
	public abstract GuestBook deleteGuest(GuestBook guestbook);
	
	public abstract GuestBook getGuestById(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();

}
