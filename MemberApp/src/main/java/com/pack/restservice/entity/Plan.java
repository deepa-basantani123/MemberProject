
	package com.pack.restservice.entity;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Plan{
		@Id
		private int SubscriptionID;
		private String PlanName;
		private String PlanEligibility;
		private String Relationship;
		
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

		public String getRelationship() {
			return Relationship;
		}

		public void setRelationship(String relationship) {
			Relationship = relationship;
		}

		
	    @Override
	    public String toString() {
	        return "User{" + "SubscriptionID='" + SubscriptionID + '\'' + ", PlanName='" + PlanName+ '\'' + ", PlanEligibility='" + PlanEligibility + '\''
	                + ", Relationship='"+'}';
	        }
	    }



