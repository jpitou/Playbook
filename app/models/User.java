package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import play.data.validation.Constraints.*;
import play.db.ebean.Model;

@Entity
@Table(name="User")
public class User extends Model {
    
    @Required
    @MinLength(4)
    public String lastName;
    
    @Required
    @MinLength(4)
    public String firstName;
    
    @Required
    public Date birthDate;
    
    @Required
    @Email
    public String email;
    
    public int phoneNumber;

	public User(String lastName, String firstName, Date birthDate, String email, int phoneNumber) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.email = email;
		this.phoneNumber = phoneNumber;
	} 
}