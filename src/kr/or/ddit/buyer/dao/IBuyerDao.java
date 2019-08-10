package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IBuyerDao {

	public List<Map> buyerName() throws SQLException;
}
