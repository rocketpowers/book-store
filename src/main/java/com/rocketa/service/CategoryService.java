package com.rocketa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketa.domain.Category;
import com.rocketa.dtos.CategoryDto;
import com.rocketa.repository.CategoryRepository;
import com.rocketa.service.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public Category findById(Integer id) {
		Optional<Category> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"object not find!  id: " + id + ", Tipo: " + Category.class.getName()));

	}

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category create(Category obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Category update(Integer id, CategoryDto objDto) {

		Category obj = findById(id);
		obj.setName(objDto.getName());
		obj.setDescription(objDto.getDescricao());
		return repository.save(obj);
	}

	public void delete(Integer id) {
		
		findById(id);
		repository.deleteById(id);
		
		
	}

}
