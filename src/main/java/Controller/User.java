package Controller;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userID;
	@Column(unique = true)
    private String username;
	@Column(unique = true)
	private String mail;

	private int privilege;


	public int getId() {
		return userID;
	}

	public void setId(int id) {
		this.userID = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getPrivilege() {
		return privilege;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", mail='" + mail + '\'' +
				", privilege=" + privilege +
				'}';
	}

}

