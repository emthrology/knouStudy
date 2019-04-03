package sec10.emthrology.member.service;

import java.sql.Connection;
import java.util.ArrayList;

import sec10.emthrology.member.common.JDBCTemplate;
import sec10.emthrology.member.model.dao.MemberDao;
import sec10.emthrology.member.model.vo.Member;

//singleton pattern 적용된 객체 사용방법
public class MemberService {
	//static final field 사용예
	//공용으로 쓸꺼니까 상수로 남겨둔다 -->템플릿 쓰면서 쓸데없게 생겼다...
//	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
//	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	static final String USER = "khjava";
//	static final String PASS = "1234";
	
	public ArrayList<Member> printAll() {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Member> list = new MemberDao().printAll(conn);
		JDBCTemplate.close(conn);
		return list;
	}

	public Member printById(String id) {
		Connection conn = JDBCTemplate.getConnection();
		Member m = new MemberDao().printById(conn, id);
		JDBCTemplate.close(conn);
		return m;
	}
	
	public ArrayList<Member> printByName(String name) {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Member> list = new MemberDao().printByName(conn, name);
		JDBCTemplate.close(conn);
		return list;
	}
	
	public int insertInfo(Member m) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().insertInfo(conn, m);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}
	
	public int updateInfo(Member m) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().updateInfo(conn,m);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}
	
	public int deleteInfo(String id) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().deleteInfo(conn,id);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}
	
}
