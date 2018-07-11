package model;

import javax.persistence.*;

@Entity
@Table(name="user_role")
public class UserRole {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	@Column(nullable=false)
private String roleType;
	public UserRole(String roleType, String status) {
		super();
		this.roleType = roleType;
		this.status = status;
	}
	@Column(nullable=false)
private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserRole(int id, String roleType, String status) {
		super();
		this.id = id;
		this.roleType = roleType;
		this.status = status;
	}
	public UserRole() {
		super();
	}
	
}
