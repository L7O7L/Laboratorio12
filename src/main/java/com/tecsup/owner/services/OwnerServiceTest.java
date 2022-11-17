package com.tecsup.owner.services;

import java.util.List;

import com.tecsup.ownerservices.entities.Owner;
import com.tecsup.ownerservices.expection.OwnerNotFoundException;

public interface OwnerServiceTest {

	/**
	 * 
	 * @param owner
	 * @return
	 */
	Owner create(Owner owner);

	/**
	 * 
	 * @param owner
	 * @return
	 */
	Owner update(Owner owner);

	/**
	 * 
	 * @param id
	 * @throws OwnerNotFoundException
	 */
	void delete(Long id) throws OwnerNotFoundException;

	/**
	 * 
	 * @param id
	 * @return
	 */
	Owner findById(long id) throws OwnerNotFoundException;

	/**
	 * 
	 * @param first_name
	 * @return
	 */
	List<Owner> findByFirst_Name(String first_name);

	/**
	 * 
	 * @param last_name
	 * @return
	 */
	List<Owner> findByLast_Name(String last_name);

	/**
	 * 
	 * @param address
	 * @return
	 */
	List<Owner> findByAddress(String address);
	
	/**
	 * 
	 * @param city
	 * @return
	 */
	List<Owner> findByCity(String city);
	
	/**
	 * 
	 * @param telephone
	 * @return
	 */
	List<Owner> findByTelephone(String telephone);

	/**
	 * 
	 * @return
	 */
	Iterable<Owner> findAll();

}
