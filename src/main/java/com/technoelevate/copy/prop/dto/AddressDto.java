package com.technoelevate.copy.prop.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_DEFAULT)
public class AddressDto implements Serializable{
	private Long addressId;
	private String addressType;
	private String country;
	private String state;
	private String city;
	private String pinCode;
	private UserDto user;
}
