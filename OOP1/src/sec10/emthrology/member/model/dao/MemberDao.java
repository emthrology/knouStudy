package sec10.emthrology.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import sec10.emthrology.member.common.JDBCTemplate;
import sec10.emthrology.member.model.vo.Member;

public class MemberDao {
	public ArrayList<Member> printAll(Connection conn) {
		ArrayList<Member> list = null;
//		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select * from member";
		
		try {
			//driver등록
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			//dbms연결
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","khjava","1234");
			//statement생성
			stmt = conn.createStatement();
			//SQL전송 및 결과 받기
			rset = stmt.executeQuery(query);
			list = new ArrayList<Member>();
			
			while(rset.next()) {
				Member m = new Member();
				m.setMemberId	(rset.getString	("member_id"));
				m.setMemberPwd	(rset.getString	("member_pwd"));
				m.setMemberName	(rset.getString	("member_name"));
				m.setGender		(rset.getString	("gender"));
				m.setAge		(rset.getInt	("age"));
				m.setEmail		(rset.getString	("email"));
				m.setPhone		(rset.getString	("phone"));
				m.setAddress	(rset.getString	("address"));
				m.setHobby		(rset.getString	("hobby"));
				m.setEnrollDate	(rset.getDate	("enroll_date"));
				list.add(m);
			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return list;
	}
	
	public Member printById(Connection conn, String id) {
		Member m = null;
//		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rset = null;
		String query = "select * from member where member_id = ?";
		
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "khjava", "1234");
			
			pstmt = conn.prepareStatement(query);//PreparedStatement는 'query'가 여기에 들어간다
			pstmt.setString(1, id);//위의 물음표 부분
			rset = pstmt.executeQuery();
			if(rset.next()) {
				m = new Member();
				m.setMemberId	(rset.getString	("member_id"));
				m.setMemberPwd	(rset.getString	("member_pwd"));
				m.setMemberName	(rset.getString	("member_name"));
				m.setGender		(rset.getString	("gender"));
				m.setAge		(rset.getInt	("age"));
				m.setEmail		(rset.getString	("email"));
				m.setPhone		(rset.getString	("phone"));
				m.setAddress	(rset.getString	("address"));
				m.setHobby		(rset.getString	("hobby"));
				m.setEnrollDate	(rset.getDate	("ENROLL_DATE"));
			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);//자식이라 노상관
		}
		return m;
	}
	
	public ArrayList<Member> printByName (Connection conn, String name) {
		ArrayList<Member> list = null;
//		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from member where member_name like ?";
		
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "khjava", "1234");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+name+"%");
			rset = pstmt.executeQuery();
			list = new ArrayList<Member>();
			
			while(rset.next()) {
				Member m = new Member();
				m.setMemberId	(rset.getString	("member_id"));
				m.setMemberPwd	(rset.getString	("member_pwd"));
				m.setMemberName	(rset.getString	("member_name"));
				m.setGender		(rset.getString	("gender"));
				m.setAge		(rset.getInt	("age"));
				m.setEmail		(rset.getString	("email"));
				m.setPhone		(rset.getString	("phone"));
				m.setAddress	(rset.getString	("address"));
				m.setHobby		(rset.getString	("hobby"));
				m.setEnrollDate	(rset.getDate	("ENROLL_DATE"));
				list.add(m);
			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);//자식이라 노상관
		}
		
		return list;
		
	}
	//주석처리한건 다 서비스에서 처리하거나 해서 필요없어진 것들
	public int insertInfo(Connection conn, Member m) {
//		Connection conn = null; 
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into member values (?,?,?,?,?,?,?,?,?,sysdate)";

		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "khjava", "1234");
			pstmt = conn.prepareStatement(query);
			pstmt.setString	(1, m.getMemberId());
			pstmt.setString	(2, m.getMemberPwd());
			pstmt.setString	(3, m.getMemberName());
			pstmt.setString	(4, m.getGender());
			pstmt.setInt	(5, m.getAge());
			pstmt.setString	(6, m.getEmail());
			pstmt.setString	(7, m.getPhone());
			pstmt.setString	(8, m.getAddress());
			pstmt.setString	(9, m.getHobby());

			result = pstmt.executeUpdate();
//			if(result>0) {
//				conn.commit();
//			}else {
//				conn.rollback();
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);//자식이라 노상관
		}
		
		return result;
		
	}
	
	public int updateInfo(Connection conn,Member m) {
//		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "update member set "
				+ "member_pwd = ?,"
				+ "email = ?,"
				+ "phone = ?,"
				+ "address = ?,"
				+ "hobby = ? "
				+ "where member_id = ?";

		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "khjava", "1234");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberPwd());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getPhone());
			pstmt.setString(4, m.getAddress());
			pstmt.setString(5, m.getHobby());
			pstmt.setString(6, m.getMemberId());
			result = pstmt.executeUpdate();
//			if(result>0) {
//				conn.commit();
//			}else {
//				conn.rollback();
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);//자식이라 노상관
		}
		
		return result;

	}

	public int deleteInfo(Connection conn,String id) {
//		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "delete from member where member_id = ?";

		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "khjava", "1234");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
//			if (result > 0) {
//				conn.commit();
//			} else {
//				conn.rollback();
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);//자식이라 노상관
		}
		return result;
	}
}
