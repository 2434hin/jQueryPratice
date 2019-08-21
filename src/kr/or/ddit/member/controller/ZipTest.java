package kr.or.ddit.member.controller;

import java.util.List;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.ZipVO;

public class ZipTest {

	public static void main(String[] args) {
		IMemberService service = MemberServiceImpl.getInstance();

	      //메소드 호출 - 결과값 받기 - List
	      List<ZipVO> list = service.getSido();

	      if (list == null)
	    	  System.out.println(11);

	      System.out.println(list.get(0).getSido());

	}

}
