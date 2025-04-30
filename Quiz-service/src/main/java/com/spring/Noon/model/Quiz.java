package com.spring.Noon.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String title;
	
	@ElementCollection
	private List<Integer> questionIds;

}
