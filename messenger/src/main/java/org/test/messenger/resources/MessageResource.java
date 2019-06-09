package org.test.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.test.messenger.model.Message;
import org.test.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}
	
	@Path("/{messageId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId")Long messageId) {
		System.out.println("Looking for a message  with id: "+messageId);
		return messageService.getMessage(messageId);
	}

}
