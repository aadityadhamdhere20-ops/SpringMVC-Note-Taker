package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "notes")
public class Note {
	@Id
	private int id;
	private String title;
	@Column(length = 1500)
	private String content;
	private Date addedDate;
	
	public Note(String title, String content, Date addedDate) {
		super();
		this.id = new Random().nextInt(100000);
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}

}
