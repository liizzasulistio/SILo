package silo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User 
{
	private int UserID; //PRIMARY KEY
	private String UserName;
	private String UserType;
	private String UserEmail;
	private String UserPassword;

	public int getUserID() { return UserID; }
	public void setUserID(int UserID) { this.UserID = UserID; }
	
	public String getUserName() { return UserName; }
	public void setUserName(String UserName) { this.UserName = UserName; }
	
	public String getUserType() { return UserType; }
	public void setUserType(String UserType) { this.UserType = UserType; }
	
	public String getUserEmail() { return UserEmail; }
	public void setUserEmail(String UserEmail) { this.UserEmail = UserEmail; }
	
	public String getUserPassword() { return UserPassword; }
	public void setUserPassword(String UserPassword) { this.UserPassword = UserPassword; }
}
