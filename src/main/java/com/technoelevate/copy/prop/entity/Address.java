package com.technoelevate.copy.prop.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_DEFAULT)
@Table( name = "address_info")
@Entity
public class Address implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	private String addressType;
	private String country;
	private String state;
	private String city;
	private String pinCode;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
//	@JsonManagedReference
//	@JsonBackReference
	private User user;
//	@Override
//	public String toString() {
//		return "Address [addressId=" + addressId + ", addressType=" + addressType + ", country=" + country + ", state="
//				+ state + ", city=" + city + ", pinCode=" + pinCode + "]";
//	}
//	
}
