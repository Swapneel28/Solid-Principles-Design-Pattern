package com.design.pattern.Learning.dependency.inversion.principle.fix;

import com.design.pattern.Learning.dependency.inversion.principle.fix.FormatException;
import com.design.pattern.Learning.dependency.inversion.principle.fix.Formatter;
import com.design.pattern.Learning.dependency.inversion.principle.fix.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JSONFormatter implements Formatter {

	@Override
	public String format(Message msg) throws FormatException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		try {
			return mapper.writeValueAsString(msg);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new FormatException(e);
		}
	}

	

}
