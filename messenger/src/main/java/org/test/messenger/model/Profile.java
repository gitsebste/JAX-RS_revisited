package org.test.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long id;
	private String profileName;
	private String lastName;
	private String firstName;
	private Date created;
	
	
	public Profile() {
		super();
		this.created = new Date();
	}

	public Profile(String profileName, String firstName,String lastName) {
		super();
		this.profileName = profileName;
		this.lastName = lastName;
		this.firstName = firstName;
		this.created = new Date();
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	
	

}
