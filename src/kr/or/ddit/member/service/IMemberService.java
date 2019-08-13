package kr.or.ddit.member.service;

import java.util.List;

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
}
