package com.design.pattern.Learning.dependency.inversion.principle.fix;

import com.design.pattern.Learning.dependency.inversion.principle.issue.FormatException;
import com.design.pattern.Learning.dependency.inversion.principle.issue.Formatter;
import com.design.pattern.Learning.dependency.inversion.principle.issue.Message;

public class TextFormatter implements Formatter {

	@Override
	public String format(Message message) throws FormatException {
		return message.getTimeStamp() + ":"+message.getMsg();
	}

}
