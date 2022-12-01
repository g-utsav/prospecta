package com.prospecta.serviceLayer;

import java.util.List;

import com.prospecta.entity.Book;

public interface BookService {

	public List<Book> getTitle(String title);
	
	public List<Book> getDescription(String description);
	
	public List<Book> getAuth(String auth);
	
	public List<Book> getCategory(String category);
	
}
