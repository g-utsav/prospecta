package com.prospecta.dataAccessLayer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prospecta.entity.Book;

@Repository
public interface DAL extends JpaRepository<Book, Integer>{

	public List<Book> findByTitle(String title);
	
	public List<Book> findByDescription(String description);
	
	public List<Book> findByCategory(String category);
	
	public List<Book> findByAuth(String auth);
	
}
