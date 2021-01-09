package silo.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Importing Model and DAO from files
import silo.model.User;
import silo.model.Item;
import silo.model.OrderDetail;
import silo.model.PurchaseOrder;
import silo.model.Invoice;
import silo.model.Customer;
import silo.model.DeliveryNote;
import silo.model.Package;
import silo.dao.ItemDAO;

public class Servlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	private ItemDAO itemDAO;
	
	@Override
	public void init()
	{
		String jdbcURL = getServletContext().getInitParameter("jdbc:mysql://localhost:3306/jsp?serverTimezone=GMT");
		String jdbcUsername = getServletContext().getInitParameter("root");
		String jdbcPassword = getServletContext().getInitParameter("");
		
		itemDAO = new ItemDAO(jdbcURL, jdbcUsername, jdbcPassword);
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String path = request.getServletPath();
		try
		{
			switch(path)
			{
				case "/":
					index(request, response);
					break;
				case "/items":
					itemList(request, response);
			}
		}
		catch(SQLException e)
		{
			throw new ServletException(e);
		}
	}
	
	@Override
	public void doPost()
	
	
	
	
	
}
