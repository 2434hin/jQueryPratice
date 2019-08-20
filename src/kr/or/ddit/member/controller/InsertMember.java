package kr.or.ddit.member.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class InsertMember
 */
@WebServlet("/InsertMember")
public class InsertMember extends HttpServlet {
   private static final long serialVersionUID = 1L;

    public InsertMember() {
        super();

    }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");

      MemberVO vo = new MemberVO();

      try {
         BeanUtils.populate(vo, request.getParameterMap());
      } catch (IllegalAccessException e) {
         e.printStackTrace();
      } catch (InvocationTargetException e) {
         e.printStackTrace();
      }
//
//      //입력한 모든값을 가져온다.
//      String id = request.getParameter("id");
//      String name = request.getParameter("name");
//      String mail = request.getParameter("mail");
//      String pwd = request.getParameter("pwd");
//      String bir = request.getParameter("bir");
//      String tel = request.getParameter("tel");
//      String zip = request.getParameter("zip");
//      String add1 = request.getParameter("add1");
//      String add2 = request.getParameter("add2");
//
//      //MemberVo에 저장
//      MemberVO vo = new MemberVO();
//      vo.setMem_id(id);
//      vo.setMem_name(name);
//      vo.setMem_pass(pwd);
//      vo.setMem_mail(mail);
//      vo.setMem_hp(tel);
//      vo.setMem_bir(bir);
//      vo.setMem_zip(zip);
//      vo.setMem_add1(add1);
//      vo.setMem_add2(add2);

      //service객체얻기
      IMemberService service = MemberServiceImpl.getInstance();

      //메소드호출 - 파라미터 : vo , 결과 : String -mem_id
      //저장 성공시에 저장된 아이디를 반환 , 실패시 null을 반환
      String mid = service.insertMember(vo);

      //결과를 request에 저장
      request.setAttribute("mid", mid);


      //jsp(insert.jsp)로 이동
      RequestDispatcher disp =
            request.getRequestDispatcher("member/insert.jsp");

      disp.forward(request, response);




   }

}