package com.stock.portlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.stock.tradeDetails.dao.TradeDao;

/**
 * Servlet implementation class TradeDetailsWebInitializer
 */
@WebServlet("/TradeDetailsWebInitializer")
public class TradeDetailsWebInitializer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TradeDetailsWebInitializer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ObjectMapper mapper = new ObjectMapper();
		TradeDao tradeDao = new TradeDao();	

		tradeDao.getTradeDetails();
		System.out.println("In web initializer");

		response.setContentType("application/json");
		response.getWriter().write(mapper.writeValueAsString(tradeDao.getTradeDetails()));	
		System.out.println(response);

		}catch(Exception e) {
			System.out.println("Error in doGet Method");
			
		}
		/*
	
	PrintWriter output =response.getWriter();
	System.out.println("True");
	output.print("True Data");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
