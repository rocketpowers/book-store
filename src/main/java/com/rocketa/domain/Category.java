package com.rocketa.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

	private Integer id;
	private String name;
	private String description;
	
	private List<Book> books = new ArrayList<>();

}
	
