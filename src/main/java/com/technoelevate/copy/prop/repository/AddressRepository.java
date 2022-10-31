package com.technoelevate.copy.prop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoelevate.copy.prop.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
