package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class MemberSelect
 */
@WebServlet("/MemberSelect")
public class MemberSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public MemberSelect() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 클라이언트 요청 시 전송되는 데이터를 받아온다.
		// DB를 이용하는 CRUD 처리를 한다.
		// 처리 결과를 클라이언트로 응답한다.
		// 응답타입은 json object 배열로 한다.
		
		IMemberService service = MemberServiceImpl.getInstance();
		
		List<MemberVO> list = service.selectAll();
		
		// crud의 결과값 list를 view페이지로 보낸다
		// 보내는 방법 : redirect, forward
		// 결과값 list를 request에 저장한다!
		
		request.setAttribute("list", list);
		
		RequestDispatcher disp = request.getRequestDispatcher("0809/memberList.jsp");
		disp.forward(request, response);
	}

}
