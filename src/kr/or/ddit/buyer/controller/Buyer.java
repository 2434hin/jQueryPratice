package kr.or.ddit.buyer.controller;


import java.util.List;
import java.util.Map;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;

public class Buyer {

	public static void main(String[] args) {
		IBuyerService service = BuyerServiceImpl.getInstance();
		List<Map> list = service.buyerName();
		
		
		for(Map map : list) {
			System.out.println(map.get("BUYER_ID"));
			System.out.println(map.get("BUYER_NAME"));
			System.out.println(map.get("BUYER_LGU"));
		}
	}

}
