package com.guest.service;

import com.guest.entities.GuestBook;
import com.guestbook.repository.GuestRepositoryImpl;

public class GuestServiceImpl implements IGuestService{
	
	
	private GuestRepositoryImpl dao;
	
	public GuestServiceImpl()
	{
		dao = new GuestRepositoryImpl();
	}

	@Override
	public GuestBook addGuest(GuestBook guestbook) {
		
		dao.beginTransaction();
		dao.addGuest(guestbook);
		
		dao.commitTransaction();
		return guestbook;
	}

	@Override
	public GuestBook updateGuest(GuestBook guestbook) {
		dao.beginTransaction();
		dao.updateGuest(guestbook);
		dao.commitTransaction();
		return guestbook;
	}

	@Override
	public GuestBook deleteGuest(GuestBook guestbook) {
		dao.beginTransaction();
		dao.deleteGuest(guestbook);
		dao.commitTransaction();
		return guestbook;
	}

	@Override
	public GuestBook findGuestById(int id) {
		//no need of transaction, as it's an read operation
				GuestBook guestbook = dao.getGuestById(id);
				return guestbook;
	}
	
	

	

}
