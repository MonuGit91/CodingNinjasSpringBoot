package com.example.website.domain;


public class SupportUserMessage implements UserMessage {
	
	String Message;

	@Override
	public void setUserId(int userId) {
		this.Message="Hi welcome to support"+String.valueOf(userId);

	}

	public String getMessage() {
		return Message; 
	}

	public void setMessage(String message) {
		Message = message;
	}

}



