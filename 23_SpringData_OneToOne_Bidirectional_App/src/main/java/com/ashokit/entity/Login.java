package com.ashokit.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ashokit_logins")
public class Login {
	
	@Id
	@Column(name = "login_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer loginId;
	
	@Column(name = "login_name",nullable = false)
	private String username;
	
	@Column(name = "login_pwd",nullable = false)
	private String password;
	
	@Column(name = "login_status",nullable = false)
	private String status;
	
	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date CreatedDate;
	
	//Has-a property(student) student_student_id  >>>>> student_id  (owning side)
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="student_id")
	private Student student;

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", username=" + username + ", password=" + password + ", status=" + status
				+ ", CreatedDate=" + CreatedDate + "]";
	}
}
