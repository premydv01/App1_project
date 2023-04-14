package com.coredi.beans;
//this class is just for testing 
public class MessageBoard {
	IMessageFormatter mFormatter;
	public void writeMessage(String message) {
		String cMessage=null;
		cMessage=mFormatter.formatMessage(message);
	}
	
	public void setmFormatter(IMessageFormatter mFormatter) {
		this.mFormatter = mFormatter;
	}

}
