package com.design.pattern.Learning.builder.pattern.second;

import java.time.LocalDate;

import com.design.pattern.Learning.builder.pattern.second.UserDTO.UserDTOBuilder;


public class Main {
	
	public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = UserDTO.getBuilder();
		UserDTO dto = director(user,builder);
		System.out.println(dto);
	}
	
	public static UserDTO director(User user, UserDTOBuilder builder) {
		return builder.withFirstName(user.getFirstName())
				      .withLastName(user.getLastName())
				      .withBirthday(user.getBirthday())
				      .withAddress(user.getAddress())
				      .build();
	}
	
	public static User createUser() {
		User user = new User();
		user.setFirstName("Swapnil");
		user.setLastName("Redekar");
		user.setBirthday(LocalDate.of(1990, 5, 28));
		Address address = new Address();
		address.setHouseNumber("1B");
		address.setStreet("Eltonvien");
		address.setCity("Oslo");
		address.setZipCode("1134");
		address.setState("Oslo");
		user.setAddress(address);
		return user;
	}

}
