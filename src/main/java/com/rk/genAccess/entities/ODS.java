package com.rk.genAccess.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.rk.genAccess.dto.UserDTO;

@Document(collection = "orderService")
public class ODS implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String location;
	private String task;
	private Date validUntil;
	
	private Permission permission;	
	private UserDTO user;
	
	public ODS() {
	}

	public ODS(String id, String location, String task, Date validUntil, Permission permission, UserDTO user) {
		super();
		this.id = id;
		this.location = location;
		this.task = task;
		this.validUntil = validUntil;
		this.permission = permission;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Date getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ODS other = (ODS) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
