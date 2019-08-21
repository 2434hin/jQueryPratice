package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

/**
 * Mapper에 접근하기 위해서 SqlMapCilent 객체가 필요
 * 	- 직접 생성하지 않고 생성되어 있는 클래스에서  getter를 이용해서 가져온다.
 * 자신의 Dao객체를 다른 서비스에서 공유하여 사용할 수 있도록 생성
 * 자신의 객체를 return
 *
 */
public class MemberDaoImpl implements IMemberDao {

	private SqlMapClient client;
	private static IMemberDao dao;

	private MemberDaoImpl() {
		client = SqlMapClientFactory.getSqlMapClient();
	}

	public static IMemberDao getInstance() {
		if(dao == null) dao = new MemberDaoImpl();
		return dao;
	}

	@Override
	public List<MemberVO> selectAll() throws SQLException {
		return client.queryForList("member.selectAll");
	}

	@Override
	public String getSelectedId(String id) throws SQLException {
		return (String) client.queryForObject("member.getSelectedId", id);
	}

	@Override
	public List<ZipVO> getSelectedDong(String dong) throws SQLException {
		return client.queryForList("member.getSelectedDong", dong);
	}

	@Override
	public String insertMember(MemberVO vo) throws SQLException {
		return (String) client.insert("member.insertMember", vo);
	}

	// 시도 출력
	@Override
	public List<ZipVO> getSido() throws SQLException {
		return client.queryForList("member.getSido");
	}

	// 구군 출력
	@Override
	public List<ZipVO> getGugun(String sido) throws SQLException {
		return client.queryForList("member.getGugun", sido);
	}

	// 동 출력
	@Override
	public List<ZipVO> getDong(Map<String, String> map) throws SQLException {
		return client.queryForList("member.getDong", map);
	}

	// 주소 출력
	@Override
	public List<ZipVO> getZip(Map<String, String> map) throws SQLException {
		return client.queryForList("member.getZip", map);
	}

}

