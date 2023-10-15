package com.onlinevoting.html.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="voter_details")
public class VoterDetails {
	
	//primary key
	/*
	 * @Id
	 * 
	 * @GeneratedValue
	 * 
	 * @Column(name = "SN") private int sn;
	 */
		
		@Id
		@Column(name = "voter_id")
		private String voterid;
		
		@Column(name="voter_name")
		private String votername;
	
		
		@Column(name = "phone")
		private String phonenumber;
		
		@Column(name="birth_date")
		private String dob;
		
		@Column(name = "adhar_number")
		private String adhar;
		
		@Column(name = "city")
		private String city;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "age")
		private String age;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "maritual_status")
		private String status;
		
		@Column(name="gender")
		private String Gender;
		
		
		public String getVotername() {
			return votername;
		}

		public void setVotername(String votername) {
			this.votername = votername;
		}

		public String getVoterid() {
			return voterid;
		}

		public void setVoterid(String voterid) {
			this.voterid = voterid;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getAdhar() {
			return adhar;
		}

		public void setAdhar(String adhar) {
			this.adhar = adhar;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
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

		public String getGender() {
			return Gender;
		}

		public void setGender(String gender) {
			Gender = gender;
		}

}
