package model;

import java.io.Serializable;
import java.util.Date;

public class complain implements Comparable<complain>,Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int	id;
	private String 	complainantName;
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
	public complain() {
		super();
		this.id = 0;
		this.complainantName = null;
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
	public complain(int id, String complainantName, String victimName, String email, String mobileNumber,
			String collegeName, String yourAddress, int pincode, String state, Date registeredOn, String raggingDetails,
			byte[] photoProof) {
		super();
		this.id = id;
		this.complainantName = complainantName;
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
	public complain(String complainantName, String victimName, String email, String mobileNumber, String collegeName,
			String yourAddress, int pincode, String state, Date registeredOn, String raggingDetails,
			byte[] photoProof) {
		super();
		this.complainantName = complainantName;
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
		return complainantName;
	}
	public void setComplainantName(String complainantName) {
		this.complainantName = complainantName;
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
	public int compareTo(complain arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
