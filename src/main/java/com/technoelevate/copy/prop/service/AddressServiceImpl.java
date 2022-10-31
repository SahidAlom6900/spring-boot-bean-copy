package com.technoelevate.copy.prop.service;

import org.springframework.stereotype.Service;

import com.technoelevate.copy.prop.dto.AddressDto;
import com.technoelevate.copy.prop.entity.Address;
import com.technoelevate.copy.prop.repository.AddressRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
	
	private final AddressRepository addressRepository;

	@Override
	public AddressDto getAddress(Long addressId) {
		Address orElseThrow = addressRepository.findById(addressId).orElseThrow();
		return null;
	}

}
