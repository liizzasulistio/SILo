package silo.dao;

//import library
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import silo.model.Item;

public class ItemDAO 
{
	//set up connection to database
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public ItemDAO(String jdbcURL, String jdbcUsername, String jdbcPassword)
	{
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	
	//check connection to database
	protected void connect() throws SQLException
	{
		if(jdbcConnection == null || jdbcConnection.isClosed())
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e)
			{
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null || !jdbcConnection.isClosed()) 
		{
			jdbcConnection.close();
		}
	}
	
	public Item insertItem(Item item) throws SQLException
	{
		Item o = null;
		String sql = "INSERT INTO items(ItemBarcode, ItemTitle, ItemDescription, ItemManufacturer, ItemURL, ItemStock) VALUES (?, ?, ?, ?, ?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		statement.setString(1, item.getItemBarcode());
		statement.setString(2, item.getItemTitle());
		statement.setString(3, item.getItemDescription());
		statement.setString(4, item.getItemManufacturer());;
		statement.setString(5, item.getItemURL());; //next: find a way to make the URL set automatically based on title
		statement.setInt(6, item.getItemStock());
		
		statement.executeUpdate();
		ResultSet res = statement.getGeneratedKeys();
		
		if(res.next())
		{
			o = item;
			o.setItemID(res.getInt(1));
		}
		
		statement.close();
		disconnect();
		
		return o;
	}
	
	
	
	
	
	
	
	
	
}
