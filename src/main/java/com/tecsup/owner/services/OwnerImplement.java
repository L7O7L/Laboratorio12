package com.tecsup.owner.services;

import java.util.List;  
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tecsup.ownerservices.entities.Owner;
import com.tecsup.ownerservices.expection.OwnerNotFoundException;
import com.tecsup.owner.repositories.OwnerRepository;

public class OwnerImplement implements OwnerServiceTest{

	private static final Logger logger = LoggerFactory.getLogger(OwnerImplement.class);

	@Autowired
	OwnerRepository ownerRepository;

	/**
	 * 
	 * @param owner
	 * @return
	 */
	
	@Override
	public Owner create(Owner owner) {
		return ownerRepository.save(owner);
	}

	@Override
	public Owner update(Owner owner) {
		return ownerRepository.save(owner);
	}

	
	/**
	 * 
	 * @param id
	 * @throws OwnerNotFoundException
	 */
	@Override
	public void delete(Long id) throws OwnerNotFoundException {
		
		Owner owner = findById(id);
		ownerRepository.delete(owner);
		
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Owner findById(long id) throws OwnerNotFoundException {
		
		Optional<Owner> owner = ownerRepository.findById(id);

		if ( !owner.isPresent())
			throw new OwnerNotFoundException("Record not found...!");
			
		return owner.get();
		
	}

	/**
	 * 
	 * @param first_name
	 * @return
	 */
	@Override
	public List<Owner> findByFirst_Name(String first_name) {
		
		List<Owner> owners = ownerRepository.findByFirst_Name(first_name);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
		
	}

	/**
	 * 
	 * @param last_name
	 * @return
	 */
	@Override
	public List<Owner> findByLast_Name(String last_name) {
		List<Owner> owners = ownerRepository.findByLast_Name(last_name);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @param address
	 * @return
	 */
	@Override
	public List<Owner> findByAddress(String address) {
		List<Owner> owners = ownerRepository.findByAddress(address);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @param city
	 * @return
	 */
	@Override
	public List<Owner> findByCity(String city) {
		List<Owner> owners = ownerRepository.findByCity(city);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @param telephone
	 * @return
	 */
	@Override
	public List<Owner> findByTelephone(String telephone) {
		List<Owner> owners = ownerRepository.findByTelephone(telephone);

		owners.stream().forEach(owner -> logger.info("" + owner));

		return owners;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public Iterable<Owner> findAll() {
		
		return ownerRepository.findAll();
	}

	
	
}