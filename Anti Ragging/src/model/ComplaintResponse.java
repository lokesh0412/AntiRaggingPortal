package model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="complaint_response")
public class ComplaintResponse implements Comparable<ComplaintResponse>,Serializable {
	private static final long serialVersionUID = 7262946887988995414L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(nullable=false)
	private String status;
	@Column(nullable=false)
	private String Action;
	@OneToOne
	private Complain complain;
	public ComplaintResponse() {
		super();
	}
	public ComplaintResponse(String status, String Action) {
		super();
		this.status = status;
		this.Action = Action;
	}
	public ComplaintResponse(int id, String status, String Action) {
		super();
		this.id = id;
		this.status = status;
		this.Action = Action;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String Action) {
		this.Action = Action;
	}
	public Complain getComplain() {
		return complain;
	}
	@Override
	public String toString() {
		return "ComplaintResponse [id=" + id + ", status=" + status + ", Action=" + Action 
				+ "]";
	}
	public void setComplain(Complain complain) {
		this.complain = complain;
	}
	@Override
	public int compareTo(ComplaintResponse arg0) {
		return this.getId()-arg0.getId();
	}
	

}
