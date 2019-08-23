package kr.or.ddit.board.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.ReplyVO;

public interface IBoardDao {

	public List<BoardVO> selectAll() throws SQLException;

	public int insertBoard(BoardVO vo) throws SQLException;

	public int deleteBoard(int seq) throws SQLException;

	public int insertReply(ReplyVO vo) throws SQLException;

	public List<ReplyVO> listReply(int seq) throws SQLException;
}
