package com.tecsup.petclinic.dto;

import java.util.Date; 

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 
 * @author jgomezm
 *
 */
public class PetDTO {

	private long id;
	
	private String name;
	
	private int typeId;

	private int ownerId;

	public PetDTO(String name, int typeId, int ownerId) {
		super();
		this.name = name;
		this.typeId = typeId;
		this.ownerId = ownerId;
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
		return "Pet [id=" + id + ", name=" + name + ", typeId=" + typeId + ", ownerId=" + ownerId + ", birth_date="
				+"]";
	}

}
