package com.guestbook.repository;

import javax.persistence.EntityManager;

import com.guest.entities.GuestBook;

public class GuestRepositoryImpl implements  IGuestRepository{
	
	
	private EntityManager entityManager;
	
	public GuestRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	

	@Override
	public GuestBook addGuest(GuestBook guestbook) {
		entityManager.persist(guestbook);
		return guestbook;
	}

	@Override
	public GuestBook updateGuest(GuestBook guestbook) {
		entityManager.merge(guestbook);
		return guestbook;
	}

	@Override
	public GuestBook deleteGuest(GuestBook guestbook) {
		entityManager.remove(guestbook);
		return guestbook;
	}

	@Override
	public GuestBook getGuestById(int id) {
		GuestBook guestbook = entityManager.find(GuestBook.class, id);
		return guestbook;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
