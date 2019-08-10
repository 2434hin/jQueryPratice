package kr.or.ddit.buyer.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import kr.or.ddit.buyer.dao.BuyerDaoImpl;
import kr.or.ddit.buyer.dao.IBuyerDao;
import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.member.vo.MemberVO;

public class BuyerServiceImpl implements IBuyerService {

	private IBuyerDao dao;
	private static IBuyerService service;
	
	private BuyerServiceImpl() {
		dao = BuyerDaoImpl.getInstance();
		
	}
	
	public static IBuyerService getInstance() {
		if(service == null) {
			service = new BuyerServiceImpl();
		}
		
		return service;
	}
	
	@Override
	public List<Map> buyerName() {
		List<Map> list = null;
		
		try {
			list = dao.buyerName();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
