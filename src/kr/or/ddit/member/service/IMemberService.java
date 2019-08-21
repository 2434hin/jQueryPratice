package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public interface IMemberService {

	public List<MemberVO> selectAll();

	// id중복검사
	public String getSelectedId(String id);

	// 우편변호 검색
	public List<ZipVO> getSelectedDong(String dong);

	// 저장하기(가입하기)
	public String insertMember(MemberVO vo);

	// 과제===========================================================
	// 시도 출력
	public List<ZipVO> getSido();

	// 구군 출력
	public List<ZipVO> getGugun(String sido);

	// 동 출력
	public List<ZipVO> getDong(Map<String, String> map);

	// 주소 출력
	public List<ZipVO> getZip(Map<String, String> map);
}
