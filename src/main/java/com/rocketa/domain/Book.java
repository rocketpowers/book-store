package com.rocketa.domain;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String author_name;
	private String text;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

}
