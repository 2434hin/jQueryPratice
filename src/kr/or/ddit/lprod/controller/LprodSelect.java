package kr.or.ddit.lprod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodServiceImpl;
import kr.or.ddit.lprod.vo.LprodVO;


@WebServlet("/LprodSelect")
public class LprodSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LprodSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ILprodService service = LprodServiceImpl.getInstance();
		
		List<LprodVO> list = service.selectAll();
		
		request.setAttribute("list", list);
		
		RequestDispatcher disp = request.getRequestDispatcher("0809/lprodList.jsp");
		disp.forward(request, response);
	}

}
