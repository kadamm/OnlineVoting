package com.onlinevoting.html.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_data")
public class User {
	
	//primary key
	@Id
	@GeneratedValue
	@Column(name = "SN")
	private int sn;
	
	@Column(name="firstname")
	private String fname;
	
	@Column(name="birth_date")
	private String dob;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name = "adhar_number")
	private String adhar;
	
	@Column(name = "voter_id")
	private String voterid;
	
	@Column(name = "address")
	private String address;
	
	
	@Column(name = "maritual_status")
	private String mstatus;
	
	@Column(name = "phone")
	private String phonenumber;
	


	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMstatus() {
		return mstatus;
	}
	public void setMstatus(String mstatus) {
		this.mstatus = mstatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVoterid() {
		return voterid;
	}
	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/*
	 * @Override public String toString() { return "User [fname=" + fname +
	 * ", lname=" + lname + ", email=" + email + ", passwd=" + passwd + ", dob=" +
	 * dob + ", gender=" + gender + "]"; }
	 */
	
	

}
