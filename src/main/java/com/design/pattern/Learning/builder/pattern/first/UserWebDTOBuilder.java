package com.design.pattern.Learning.builder.pattern.first;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO userWebDTO;
	
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.toString();
		return this;
	}

	@Override
	public UserDTO build() {
		userWebDTO = new UserWebDTO(firstName+" "+lastName, address, age);
		return userWebDTO;
	}

	@Override
	public UserDTO getUserDTO() {
		return userWebDTO;
	}

}
