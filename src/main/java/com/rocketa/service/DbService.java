package com.rocketa.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketa.domain.Book;
import com.rocketa.domain.Category;
import com.rocketa.repository.BookRepository;
import com.rocketa.repository.CategoryRepository;

@Service
public class DbService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private BookRepository bookRepository;

	public void instanciaBaseDeDados() {
		
		Category cat1 = new Category(null, "Informatica", "ti-books");
		Category cat2 = new Category(null, "cakes", "cook book");
		Category cat3 = new Category(null, "fix refrigerators", "education");

		Book b1 = new Book(null, "clean code", "robert marchas", "holy cheat", cat1);
		Book b2 = new Book(null, "make delicius cake", "bin laden", "holly jolme", cat2);
		Book b3 = new Book(null, "all about refrigerators", "magaiver", "del gato", cat3);

		cat1.getBooks().addAll(Arrays.asList(b1));
		cat2.getBooks().addAll(Arrays.asList(b2));
		cat3.getBooks().addAll(Arrays.asList(b3));

		this.categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.bookRepository.saveAll(Arrays.asList(b1, b2, b3));

	}

}
