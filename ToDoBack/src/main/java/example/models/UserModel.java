package example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS_TABLE")
public class UserModel {
	@Id
	@Column(name = "User_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name = "User_Name",nullable = false, unique = true)
	private String userName;
	
	@Column(name = "User_Pass",nullable = false)
	private String userPass;

	public UserModel(String userName, String userPass) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		System.out.println("In 2 arg");
	}

	public UserModel() {
		super();
		System.out.println("In no arg");
	}

	public UserModel(int userId, String userName, String userPass) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		System.out.println("In all arg");
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + "]";
	}
	
	
}
