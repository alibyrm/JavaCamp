package Entities;

public class Gamer {
	private int gamerId;
	private String firstName;
	private String lastName;
	private String tcNo;
	
	
	public Gamer() {
		
	}


	public Gamer(int gamerId, String firstName, String lastName, String tcNo) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
	}


	public int getGamerId() {
		return gamerId;
	}


	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTcNo() {
		return tcNo;
	}


	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

}
