package models;

import java.util.Date;
import java.util.List;
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
    
    @Required
    public String password;
    
    public int phoneNumber;

//	public User(String lastName, String firstName, Date birthDate, String email, String password, int phoneNumber) {
//		super();
//		this.lastName = lastName;
//		this.firstName = firstName;
//		this.birthDate = birthDate;
//		this.email = email;
//		this.password = password;
//		this.phoneNumber = phoneNumber;
//	} 
//	
	public static Model.Finder<String,User> find = new Model.Finder(String.class, User.class);
	
    /**
     * Retrieve all users.
     */
    public static List<User> findAll() {
        return find.all();
    }

    /**
     * Retrieve a User from email.
     */
    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
    
	/**
     * Authenticate a User.
     */
    public static User authenticate(String email, String password) {
        return find.where()
            .eq("email", email)
            .eq("password", password)
            .findUnique();
    }
}