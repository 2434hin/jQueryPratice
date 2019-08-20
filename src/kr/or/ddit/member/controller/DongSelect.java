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
import kr.or.ddit.member.vo.ZipVO;

@WebServlet("/DongSelect")
public class DongSelect extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      request.setCharacterEncoding("UTF-8");

      //입력한 dong을 전달 받는다.

      String inputDong = request.getParameter("dong");

      //service 객체 얻기
      IMemberService service = MemberServiceImpl.getInstance();

      //메소드 호출 - 결과값 받기 - List
      List<ZipVO> list = service.getSelectedDong(inputDong);

      //결과값을 request에 저장
      request.setAttribute("list", list);

      //jsp(ZipSerarch.jsp) 로 이동 - json데이터 생성
      RequestDispatcher disp = request.getRequestDispatcher("member/ZipSerarch.jsp");
      disp.forward(request, response);

   }

}