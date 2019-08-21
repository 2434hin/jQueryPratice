package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public interface IMemberDao {

	public List<MemberVO> selectAll() throws SQLException;

	// id중복검사
	public String getSelectedId(String id) throws SQLException;

	// 우편변호 검색
	public List<ZipVO> getSelectedDong(String dong) throws SQLException;

	// 저장하기(가입하기)
	public String insertMember(MemberVO vo) throws SQLException;

	// 과제 =============================================================================
	// 시도 출력
	public List<ZipVO> getSido() throws SQLException;

	// 구군 출력
	public List<ZipVO> getGugun(String sido) throws SQLException;

	// 동 출력
	public List<ZipVO> getDong(Map<String, String> map) throws SQLException;

	// 주소 출력
	public List<ZipVO> getZip(Map<String, String> map) throws SQLException;
}
