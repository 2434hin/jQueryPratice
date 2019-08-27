package kr.or.ddit.board.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.board.dao.BoardDaoImpl;
import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.ReplyVO;

public class BoardServiceImpl implements IBoardService {

	private IBoardDao dao;
	private static IBoardService service;

	private BoardServiceImpl() {
		dao = BoardDaoImpl.getInstance();

	}

	public static IBoardService getInstance() {
		if(service == null) {
			service = new BoardServiceImpl();
		}

		return service;
	}


	@Override
	public List<BoardVO> selectAll() {
		List<BoardVO> list = null;

		try {
			list = dao.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int insertBoard(BoardVO vo) {
		int seq = 0;

		try {
			seq = dao.insertBoard(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return seq;
	}

	@Override
	public int deleteBoard(int seq) {
		int seq1 = 0;

		try {
			seq1 = dao.deleteBoard(seq);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return seq1;
	}

	@Override
	public int insertReply(ReplyVO vo) {
		int seq = 0;

		try {
			seq = dao.insertReply(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return seq;
	}

	@Override
	public List<ReplyVO> listReply(int seq) {
		List<ReplyVO> list = null;

		try {
			list = dao.listReply(seq);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// 댓글 삭제
	@Override
	public int deleteReply(int renum) {
		int seq = 0;

		try {
			seq = dao.deleteReply(renum);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return seq;
	}

	// 댓글 수정
	@Override
	public int modifyReply(Map<String, Object> map) {
		int seq = 0;

		try {
			seq = dao.modifyReply(map);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return seq;
	}

}
