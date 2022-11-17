package com.tecsup.owner.repositories;

import java.util.List; 

import org.springframework.data.repository.CrudRepository;

import com.tecsup.ownerservices.entities.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
	
	List<Owner> findByFirst_Name(String first_name);

	List<Owner> findByLast_Name(String last_name);

	List<Owner> findByAddress(String address);
	
	List<Owner> findByCity(String city);
	
	List<Owner> findByTelephone(String telephone);

}
