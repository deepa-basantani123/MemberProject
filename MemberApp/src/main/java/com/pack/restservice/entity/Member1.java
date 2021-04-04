package com.pack.restservice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
//@Table(name="Member1")
public class Member1{
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//pi631`1 @NotNull(message="MemberID cannot be null")
	//@OneToMany(cascade=CascadeType.ALL, mappedBy="Member1")
	//private List<Plan>plans;
	private Integer MemberID;
	private Integer SubscriptionID;
	private String FirstName;
	private String LastName;
	private String Gender;
	private String Date;
	private String RelationShip;
	private String PreferredModeOfCommunication;
	public String getPreferredModeOfCommunication() {
		return PreferredModeOfCommunication;
	}

	public void setPreferredModeOfCommunication(String preferredModeOfCommunication) {
		PreferredModeOfCommunication = preferredModeOfCommunication;
	}

	public String getRelationShip() {
		return RelationShip;
	}

	public void setRelationShip(String relationShip) {
		RelationShip = relationShip;
	}
	private long Contact;
	
	private String Address;
	private String Email;
   public Integer getSubscriptionID() {
		return SubscriptionID;
	}

	public void setSubscriptionID(Integer subscriptionID) {
		SubscriptionID = subscriptionID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getMemberID() {
		return MemberID;
	}

	public void setMemberID(Integer memberID) {
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
        return "User{" + "MemberID='" + MemberID +"SubscriptionID='"+SubscriptionID+ '\'' +'\''+ "FirstName='" + FirstName+ '\'' + " Lastname='" + LastName + '\''
                +  "Gender='" + Gender +'\''+ "Date='" + Date +  '\''+ "PreferredModeOfCommunication= '"+ PreferredModeOfCommunication +'\'' + "Contact='" + Contact + ", Date='" + Date+ ",RelationShip='"+RelationShip+" Address='" + Address+ "Email='"+Email+'}';
        }
    }
