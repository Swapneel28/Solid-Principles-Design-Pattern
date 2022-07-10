package com.design.pattern.Learning.dependency.inversion.principle.issue;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	public void writeMessage(Message msg, String fileName) throws IOException {
		Formatter formatter = new JSONFormatter();//creates formatter
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //creates print writer
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
		} catch (FormatException e) {
			e.printStackTrace();
		}
	}
	//This method has dependency of formatter and writer object. We need to decouple these object from the method.  
}
