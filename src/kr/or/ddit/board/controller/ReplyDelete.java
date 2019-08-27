package kr.or.ddit.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;

@WebServlet("/ReplyDelete")
public class ReplyDelete extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int renum = Integer.parseInt(request.getParameter("renum"));

		// service
		IBoardService service = BoardServiceImpl.getInstance();

		// method 호출
		int res = service.deleteReply(renum);

		// jsp로 이동
		request.setAttribute("res", res);

		request.getRequestDispatcher("accordion/delete.jsp").forward(request, response);

	}

}
