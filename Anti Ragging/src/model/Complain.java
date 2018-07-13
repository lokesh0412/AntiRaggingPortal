package model;

import java.io.Serializable;
import java.util.Date;

public class Complain implements Comparable<Complain>,Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int	id;
	private String 	ComplainantName;
	private String victimName;
	private String	email;
	private String	mobileNumber;
	private String	collegeName;
	private String 	yourAddress;
	private int	pincode;
	private String 	state;
	private Date registeredOn;
	private String raggingDetails;
    private byte[]	photoProof;
	public Complain() {
		super();
		this.id = 0;
		this.ComplainantName = null;
		this.victimName = null;
		this.email = null;
		this.mobileNumber = null;
		this.collegeName = null;
		this.yourAddress = null;
		this.pincode = 0;
		this.state = null;
		this.registeredOn = null;
		this.raggingDetails = null;
		this.photoProof = null;
	}
	public Complain(int id, String ComplainantName, String victimName, String email, String mobileNumber,
			String collegeName, String yourAddress, int pincode, String state, Date registeredOn, String raggingDetails,
			byte[] photoProof) {
		super();
		this.id = id;
		this.ComplainantName = ComplainantName;
		this.victimName = victimName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.collegeName = collegeName;
		this.yourAddress = yourAddress;
		this.pincode = pincode;
		this.state = state;
		this.registeredOn = registeredOn;
		this.raggingDetails = raggingDetails;
		this.photoProof = photoProof;
	}
	public Complain(String ComplainantName, String victimName, String email, String mobileNumber, String collegeName,
			String yourAddress, int pincode, String state, Date registeredOn, String raggingDetails,
			byte[] photoProof) {
		super();
		this.ComplainantName = ComplainantName;
		this.victimName = victimName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.collegeName = collegeName;
		this.yourAddress = yourAddress;
		this.pincode = pincode;
		this.state = state;
		this.registeredOn = registeredOn;
		this.raggingDetails = raggingDetails;
		this.photoProof = photoProof;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComplainantName() {
		return ComplainantName;
	}
	public void setComplainantName(String ComplainantName) {
		this.ComplainantName = ComplainantName;
	}
	public String getVictimName() {
		return victimName;
	}
	public void setVictimName(String victimName) {
		this.victimName = victimName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getYourAddress() {
		return yourAddress;
	}
	public void setYourAddress(String yourAddress) {
		this.yourAddress = yourAddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getRegisteredOn() {
		return registeredOn;
	}
	public void setRegisteredOn(Date registeredOn) {
		this.registeredOn = registeredOn;
	}
	public String getRaggingDetails() {
		return raggingDetails;
	}
	public void setRaggingDetails(String raggingDetails) {
		this.raggingDetails = raggingDetails;
	}
	public byte[] getPhotoProof() {
		return photoProof;
	}
	public void setPhotoProof(byte[] photoProof) {
		this.photoProof = photoProof;
	}
	@Override
	public int compareTo(Complain arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
