package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.lprod.vo.LprodVO;

public class LprodDaoImpl implements ILprodDao {

	private SqlMapClient client;
	private static ILprodDao dao;
	
	private LprodDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static ILprodDao getInstance() {
		
		if(dao == null) {
			dao = new LprodDaoImpl();
		}
		
		return dao;
	}

	@Override
	public List<LprodVO> selectAll() throws SQLException {
		return client.queryForList("lprod.selectAll");
	}

}
