package com.technoelevate.copy.prop.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_DEFAULT)
public class TestDto implements Serializable {
	private Long userId;
	private String userName;
	private String userMailId;
	private Long userContact;
	private List<String> languages;
	private List<AddressDto> addressDtos;
}
