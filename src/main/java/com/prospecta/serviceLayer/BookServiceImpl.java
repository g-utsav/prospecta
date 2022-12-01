package com.prospecta.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prospecta.dataAccessLayer.DAL;
import com.prospecta.entity.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private DAL dal;

	@Override
	public List<Book> getTitle(String title) {
		if(title.equals(""))return null;
		
		return dal.findByTitle(title);
	}

	@Override
	public List<Book> getDescription(String description) {
		if(description.equals(""))return null;
		
		return dal.findByDescription(description);
	}

	@Override
	public List<Book> getAuth(String auth) {
		if(auth.equals(""))return null;
		
		return dal.findByAuth(auth);
	}

	@Override
	public List<Book> getCategory(String category) {
		if(category.equals(""))return null;
		
		return dal.findByCategory(category);
	}
	
	
}
