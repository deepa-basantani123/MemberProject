package com.pack.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member1{
	@Id
	private int MemberID;
	private String FirstName;
	private String LastName;
	private String Gender;
	private long Contact;
	private String Date;
	private String Address;
    public int getMemberID() {
		return MemberID;
	}

	public void setMemberID(int memberID) {
		MemberID = memberID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public long getContact() {
		return Contact;
	}

	public void setContact(long contact) {
		Contact = contact;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	
               }
    @Override
    public String toString() {
        return "User{" + "MemberID='" + MemberID + '\'' + ", FirstName='" + FirstName+ '\'' + ", Lastname='" + LastName + '\''
                + ", Gender='" + Gender + '\'' + ", Contact='" + Contact + ", Date='" + Date+ ", Address='" + Address+'}';
        }
    }
