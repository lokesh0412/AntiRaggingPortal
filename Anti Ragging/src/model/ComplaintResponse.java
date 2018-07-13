package model;

public class ComplaintResponse {
	private int id;
	private int complaintid;
	private String status;
	private String message;
	public ComplaintResponse() {
		super();
	}
	public ComplaintResponse(int complaintid, String status, String message) {
		super();
		this.complaintid = complaintid;
		this.status = status;
		this.message = message;
	}
	public ComplaintResponse(int id, int complaintid, String status, String message) {
		super();
		this.id = id;
		this.complaintid = complaintid;
		this.status = status;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getComplaintid() {
		return complaintid;
	}
	public void setComplaintid(int complaintid) {
		this.complaintid = complaintid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
