package org.test.messenger.db;

import java.util.HashMap;
import java.util.Map;

import org.test.messenger.model.Message;
import org.test.messenger.model.Profile;

public class DatabaseClass {
	
	private static Long id = 1L;
	
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<String, Profile> profiles = new HashMap<String, Profile>();
	
	public static Map<Long, Message> getAllMessages() {
		return messages;
	}
	public static Map<String, Profile> getAllProfiles() {
		return profiles;
		
	}
	public static Long getId() {
		return id++;
	}

}