package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "Subject")
@NamedQuery(name = "Subject.findAll", query = "SELECT r FROM Subject r")
public class Subject {
	
	@Id
	@Column(name = "idsubject")
	private int idsubject;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "credits")
	private String credits;
	
	public Subject () {}
	
	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}	
	
}
