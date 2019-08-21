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


@WebServlet("/ZipSelect")
public class ZipSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	      //service 객체 얻기
	      IMemberService service = MemberServiceImpl.getInstance();

	      //메소드 호출 - 결과값 받기 - List
	      List<ZipVO> list = service.getSido();

	      //결과값을 request에 저장
	      request.setAttribute("list", list);

	      //jsp(ZipSerarch.jsp) 로 이동 - json데이터 생성
	      RequestDispatcher disp = request.getRequestDispatcher("member/ZipSidoSerarch.jsp");
	      disp.forward(request, response);
	}

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	      request.setCharacterEncoding("UTF-8");

			Map<String, String> map = new HashMap<String, String>();
			map.put("sido", request.getParameter("sido"));
			map.put("gugun", request.getParameter("gugun"));
			map.put("dong", request.getParameter("dong"));

	      //service 객체 얻기
	      IMemberService service = MemberServiceImpl.getInstance();

	      //메소드 호출 - 결과값 받기 - List
	      List<ZipVO> list = service.getZip(map);

	      //결과값을 request에 저장
	      request.setAttribute("list", list);

	      //jsp(ZipSerarch.jsp) 로 이동 - json데이터 생성
	      RequestDispatcher disp = request.getRequestDispatcher("member/ZipSerarch.jsp");
	      disp.forward(request, response);

	   }

}
