package cap.accountservice.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="User")
public class User
{
	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private String ssn;
	@NotNull
	@Size(min=2)
	@Column(name="username")
	private String username;
	@Column(name="password")
	@NotNull
	@Size(min=6)
	private String password;
	@NotNull
	@Column(name="firstName")
	private String firstName;
	@NotNull
	@Column(name="lastName")
	private String lastName;
	@NotNull
	@Column(name="dob")
	private String dob;
	@NotNull
	@Column(name="email")
	private String email;
	@NotNull
	@Column(name="phone")
	private String phone;
	@NotNull
	@Column(name="homeAddress")
	private String homeAddress;
	@NotNull
	@Column(name="mailingAddress")
	private String mailingAddress;
	@Column(name="balanceC")
	private double balanceC;
	@Column(name="balanceS")
	private double balanceS;
	@Column(name="balanceCD")
	private double balanceCD;
	
	public User() {}

	public String getSsn() 
	{
		return ssn;
	}

	public void setSsn(String ssn) 
	{
		this.ssn = ssn;
	}
	
	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getDob() 
	{
		return dob;
	}

	public void setDob(String dob)
	{
		this.dob = dob;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getHomeAddress() 
	{
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) 
	{
		this.homeAddress = homeAddress;
	}

	public String getMailingAddress() 
	{
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) 
	{
		this.mailingAddress = mailingAddress;
	}

	public double getBalanceC() 
	{
		return balanceC;
	}

	public void setBalanceC(double balanceC) 
	{
		this.balanceC = balanceC;
	}

	public double getBalanceS() {
		return balanceS;
	}

	public void setBalanceS(double balanceS)
	{
		this.balanceS = balanceS;
	}

	public double getBalanceCD() 
	{
		return balanceCD;
	}

	public void setBalanceCD(double balanceCD)
	{
		this.balanceCD = balanceCD;
	}
	
	
	
}


