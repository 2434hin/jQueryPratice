package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.ProdVO;

/**
 * Mapper에 접근하기 위해서 SqlMapCilent 객체가 필요
 * 	- 직접 생성하지 않고 생성되어 있는 클래스에서  getter를 이용해서 가져온다.
 * 자신의 Dao객체를 다른 서비스에서 공유하여 사용할 수 있도록 생성
 * 자신의 객체를 return
 *
 */
public class ProdDaoImpl implements IProdDao {
	
	private SqlMapClient client;
	private static IProdDao dao;
	
	private ProdDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IProdDao getInstance() {
		if(dao == null) dao = new ProdDaoImpl();
		
		return dao;
	}

	@Override
	public List<ProdVO> selectProdNames(String lprod_gu) throws SQLException {
		
		return client.queryForList("prod.selectProdNames", lprod_gu);
	}

	@Override
	public ProdVO prodDetail(String prod_id) throws SQLException {
		
		return (ProdVO) client.queryForObject("prod.prodDetail", prod_id);
	}

}
