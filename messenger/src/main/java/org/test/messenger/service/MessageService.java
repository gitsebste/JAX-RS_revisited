package org.test.messenger.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.test.messenger.db.DatabaseClass;
import org.test.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getAllMessages();
	
	public MessageService() {
		addMessage(new Message(1L,"Hello World!","koushik"));
		addMessage(new Message(2L,"Hello Jersey!","koushik"));
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(Long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		return messages.put(message.getId(),message);
	}
	
	public Message updateMessage(Message message){
		return messages.put(message.getId(),message);
	}
	
	public Message removeMessage(Long id){
		return messages.remove(id);
	}

}
