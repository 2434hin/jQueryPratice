package kr.or.ddit.prod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.ProdVO;

@WebServlet("/ProdServlet")
public class ProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// option에 들어갈 prod의 id와 name가져오기
		// lprod_gu값을 가져온다.

		String lpgu = request.getParameter("lprod_gu");

		IProdService service = ProdServiceImpl.getInstance();

		List<ProdVO> list = service.selectProdNames(lpgu);

		// 데이터가 있는 경우 p101, p102
		// 데이터가 없는 경우 p402
		request.setAttribute("list", list);


		//RequestDispatcher disp = request.getRequestDispatcher("0812/prodNames.jsp");

		RequestDispatcher disp = request.getRequestDispatcher("0812/prod.jsp");

		disp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// prod의 option value에서 값을 가져온다.
		String prod_id = request.getParameter("prod_id");

		IProdService service = ProdServiceImpl.getInstance();

		ProdVO vo = service.prodDetail(prod_id);

		request.setAttribute("vo", vo);

		RequestDispatcher disp = request.getRequestDispatcher("0812/prodDetail.jsp");

		disp.forward(request, response);


	}

}
