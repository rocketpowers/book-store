package com.rocketa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rocketa.domain.Book;
import com.rocketa.domain.Category;
import com.rocketa.repository.BookRepository;
import com.rocketa.repository.CategoryRepository;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 Category cat1 = new Category(null, "Informatica", "ti books");
		 
		 Book b1 = new Book(null,"clean code", "robert marchas", "sem texto",cat1);
		
		 
		 cat1.getBooks().addAll(Arrays.asList(b1));
		 
		 this.categoryRepository.saveAll(Arrays.asList(cat1));
		 this.bookRepository.saveAll(Arrays.asList(b1));
		 
	}

}
