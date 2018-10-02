package com.iter.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Retrieve
 */
@WebServlet("/Retrieve")
public class Retrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Retrieve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Retrieve Servlet");
		String empNo = (String) request.getParameter("empNo");
		String empName = (String) request.getParameter("empName");
		String empCity = (String) request.getParameter("empCity");;
		System.out.println(empNo);
		System.out.println(empName);
		System.out.println(empCity);
		
		Employee emp = new Employee();
		emp.setEmpNo(empNo);
		emp.setEmpName(empName);
		emp.setEmpCity(empCity);
		request.setAttribute("emp", emp);
		RequestDispatcher rd = request.getRequestDispatcher("views/jsp/retrieve.jsp");
		rd.forward(request, response);
	}

}
