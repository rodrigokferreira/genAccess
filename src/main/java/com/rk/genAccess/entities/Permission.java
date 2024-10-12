package com.rk.genAccess.entities;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.rk.genAccess.dto.UserDTO;

@Document(collection = "permission")
public class Permission implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String permissionName;
	
	private ODS ods;
	private UserDTO user;
	
	public Permission() {
	}

	public Permission(String id, String permissionName, ODS ods, UserDTO user) {
		super();
		this.id = id;
		this.permissionName = permissionName;
		this.ods = ods;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
	public ODS getOds() {
		return ods;
	}

	public void setOds(ODS ods) {
		this.ods = ods;
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
		Permission other = (Permission) obj;
		return Objects.equals(id, other.id);
	}

	
	
}
