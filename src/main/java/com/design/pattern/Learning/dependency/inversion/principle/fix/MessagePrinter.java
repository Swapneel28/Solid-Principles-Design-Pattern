package com.design.pattern.Learning.dependency.inversion.principle.fix;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
	
	public void writeMessage(Message msg,Formatter formatter,PrintWriter writer) throws IOException{
		writer.println(formatter.format(msg)); //formats and writes message
		writer.flush();
	}
    // Formatter and writer object is given as method parameter. Hence these two objects are decoupled. These two object creation is 
	// responsibility of client class.
}
