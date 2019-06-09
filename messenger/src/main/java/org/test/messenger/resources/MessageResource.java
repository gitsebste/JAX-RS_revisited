package org.test.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.test.messenger.model.Message;
import org.test.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}
	
	@Path("/{messageId}")
	@GET
	public Message getMessage(@PathParam("messageId")Long messageId) {
		return messageService.getMessage(messageId);
	}
	
	@Path("/{messageId}")
	@PUT	
	public Message updateMessage(@PathParam("messageId")Long messageId,Message message) {
		message.setId(messageId);
		return messageService.updateMessage(message);
	}
	
	@Path("/{messageId}")
	@DELETE
	public Message deleteMessage(@PathParam("messageId")Long messageId ) {
		return messageService.removeMessage(messageId);
	}
	
	@POST
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}

}
