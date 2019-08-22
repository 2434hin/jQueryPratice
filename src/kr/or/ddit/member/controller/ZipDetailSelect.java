package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.ZipVO;

@WebServlet("/ZipDetailSelect")
public class ZipDetailSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String sido = request.getParameter("sido");
		System.out.println(sido);

		IMemberService service = MemberServiceImpl.getInstance();

		List<ZipVO> list = service.getGugun(sido);

		request.setAttribute("list", list);

		RequestDispatcher disp = request.getRequestDispatcher("member/ZipGugunSerarch.jsp");

		disp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		Map<String, String> map = new HashMap<String, String>();
		map.put("sido", request.getParameter("sido"));
		map.put("gugun", request.getParameter("gugun"));

		IMemberService service = MemberServiceImpl.getInstance();

		List<ZipVO> list = service.getDong(map);

		request.setAttribute("list", list);

		RequestDispatcher disp = request.getRequestDispatcher("member/ZipDongSerarch.jsp");

		disp.forward(request, response);
	}

}
