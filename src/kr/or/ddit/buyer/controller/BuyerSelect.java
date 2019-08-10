package kr.or.ddit.buyer.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;

@WebServlet("/BuyerSelect")
public class BuyerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IBuyerService service = BuyerServiceImpl.getInstance();

		List<Map> list = service.buyerName();
		
		request.setAttribute("list", list);
		
		RequestDispatcher disp = request.getRequestDispatcher("0810/homework/buyerList.jsp");
		disp.forward(request, response);
	}
}
