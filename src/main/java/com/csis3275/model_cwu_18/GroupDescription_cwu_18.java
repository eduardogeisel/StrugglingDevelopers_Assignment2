package com.csis3275.model_cwu_18;

public class GroupDescription_cwu_18 {
	private String teamName;
	private String groupDescription;
	
	GroupMember_cwu_18 member1 = new GroupMember_cwu_18();
	GroupMember_epe_07 member2 = new GroupMember_epe_07();
	GroupMember_mjo_56 member3 = new GroupMember_mjo_56();

	public String getGroupDescription() {
		
		return "This is a wonderful group which includes 4 students.<br>"
				+ member1.getName() + " (Travis)" + ", " + member2.getName() + ", " + member3.getName() + " and Soheila. <br>"
				+ "We teamed up to work on the Software engineering project.<br>"
				+ "Our project is about Room Booking system. <br>";
	}


	public String getTeamName() {
		return "Struggling Developers";
	}


}
