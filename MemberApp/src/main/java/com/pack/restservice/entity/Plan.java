package com.pack.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

	@Entity
	//@Table(name="Plan")
	public class Plan{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		//@NotNull(message="SubscriptionID cannot be null")
		//@ManyToOne(fetch=FetchType.LAZY)
		//@JoinColumn(name="SubscriptionID", nullable=false)
		//private Member1 members;
		private int SubscriptionID;		
		private String PlanName;
		private String PlanEligibility;
		//private String Relationship;
		private int PolicyNumber;
		public int getPolicyNumber() {
			return PolicyNumber;
		}

		public void setPolicyNumber(int policyNumber) {
			PolicyNumber = policyNumber;
		}

		public String getProduct() {
			return Product;
		}

		public void setProduct(String product) {
			Product = product;
		}

		public String getProductType() {
			return ProductType;
		}

		public void setProductType(String productType) {
			ProductType = productType;
		}

		public String getPlanType() {
			return PlanType;
		}

		public void setPlanType(String planType) {
			PlanType = planType;
		}

		public String getCoverageLevel() {
			return CoverageLevel;
		}

		public void setCoverageLevel(String coverageLevel) {
			CoverageLevel = coverageLevel;
		}

		public String getStartDate() {
			return StartDate;
		}

		public void setStartDate(String startDate) {
			StartDate = startDate;
		}

		public String getTerminationDate() {
			return TerminationDate;
		}

		public void setTerminationDate(String terminationDate) {
			TerminationDate = terminationDate;
		}


		private String Product;
		private String ProductType;
		private String PlanType;
		private String CoverageLevel;
		private String StartDate;
		private String TerminationDate;
		
		public int getSubscriptionID() {
			return SubscriptionID;
		}

		public void setSubscriptionID(int subscriptionID) {
			SubscriptionID = subscriptionID;
		}

		public String getPlanName() {
			return PlanName;
		}

		public void setPlanName(String planName) {
			PlanName = planName;
		}

		public String getPlanEligibility() {
			return PlanEligibility;
		}

		public void setPlanEligibility(String planEligibility) {
			PlanEligibility = planEligibility;
		}

		/*public String getRelationship() {
			return Relationship;
		}

		public void setRelationship(String relationship) {
			Relationship = relationship;
		}*/

		
	    @Override
	    public String toString() {
	        return "User{" +"SubscriptionID='" + SubscriptionID +'\'' + ", PlanName='" + PlanName + '\'' + ", PlanEligibility='" + PlanEligibility + '\''
	                 + ", PolicyNumber='" + PolicyNumber + '\'' + ", Product='" + Product + '\'' + ", ProductType='" + ProductType + '\''+ ", PlanType='" + PlanType +'\'' + ",CverageLevel='" + CoverageLevel + '\'' + ",StartDate='"+ StartDate +'\'' + ",TermainationDate='" + TerminationDate +'}';
	        }
	    }



