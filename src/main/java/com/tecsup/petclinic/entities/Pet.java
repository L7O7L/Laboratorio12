package com.tecsup.petclinic.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author jgomezm
 *
 */
@Entity(name = "pets")
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@Column(name = "type_id")
	private int typeId;
	@Column(name = "owner_id")
	private int ownerId;
	
	public Pet() {
	}

	public Pet(long id, String name, int type_id, int owner_id) {
		super();
		this.id = id;
		this.name = name;
		this.typeId = type_id;
		this.ownerId = owner_id;
	}

	public Pet(String name, int type_id, int owner_id) {
		super();
		this.name = name;
		this.typeId = type_id;
		this.ownerId = owner_id;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int type_id) {
		this.typeId = type_id;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int owner_id) {
		this.ownerId = owner_id;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", typeId=" + typeId + ", ownerId=" + ownerId + ", birthDate="
				+ "]";
	}

}
