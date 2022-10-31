package com.technoelevate.copy.prop.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.copy.prop.convert.BeanCopy;
import com.technoelevate.copy.prop.dto.AddressDto;
import com.technoelevate.copy.prop.entity.Address;

@RestController
@RequestMapping("api/v1")
public class AddressController {

	public void saveAddress(@RequestBody AddressDto addressDto) {
		Address address = BeanCopy.objectProperties(addressDto, Address.class);
		System.out.println(address);
	}
}
