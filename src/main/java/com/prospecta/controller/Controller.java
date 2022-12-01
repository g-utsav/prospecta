package com.prospecta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prospecta.entity.Book;
import com.prospecta.serviceLayer.BookService;

@RestController
@RequestMapping("/entries")
public class Controller {

	@Autowired
	private BookService bServ;
	
	@GetMapping("/")
	public List<Book> respnseTitle(@RequestParam("title") String title) {
		return bServ.getTitle(title);
	}
	
	@GetMapping("/")
	public List<Book> respnseDescription(@RequestParam("description") String description) {
		return bServ.getDescription(description);
	}
	
	@GetMapping("/")
	public List<Book> respnseAuth(@RequestParam("auth") String auth) {
		return bServ.getAuth(auth);
	}
	
	@GetMapping("/")
	public Boolean respnseHttps(@RequestParam("https") String https) {
		return true;
	}
	
	@GetMapping("/")
	public String respnseCors(@RequestParam("cors") String cors) {
		return "";
	}
	
	@GetMapping("/")
	public List<Book> respnseCategory(@RequestParam("category") String category) {
		return bServ.getCategory(category);
	}
	
	
}
