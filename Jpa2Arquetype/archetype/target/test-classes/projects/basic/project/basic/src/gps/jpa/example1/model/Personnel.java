package gps.jpa.example1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Personnel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	String Name = null;
	@Override
	public String toString() {
		return "Personnel [id=" + id + ", Name=" + Name + ", Login=" + Login
				+ ", Password=" + Password + "]";
	}

	String Login = null;
	String Password = null;

	public int get_Id() {
		return id;
	}

	public void set_Id(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String Login) {
		this.Login = Login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
}
