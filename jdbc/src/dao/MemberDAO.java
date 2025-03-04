package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import vo.MemberVo;

public class MemberDAO {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
//	로그인 시 공용 저장소 (세션)
	public static Long session;
	
//	회원 가입
	public void join(MemberVo memberVO) {
		connection = DBConnector.getConnect();
		String query = "INSERT INTO TBL_MEMBER"
				+ "(ID, MEMBER_ID, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_ADDRESS)"
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ? ,?)";
		
		try {
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberId());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setString(4, memberVO.getMemberAddress());
			
			preparedStatement.executeUpdate();
//			preparedStatement.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("join(MemberVO) query문 오류");
			e.printStackTrace();
		} finally {
//			열었던 순서의 반대로 닫기
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("SQL 쿼리 실행 이후 오류 발생");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		
	}
	
//	아이디 중복 검사
	public boolean checkId(String memberId) {
		boolean check = false;
		connection = DBConnector.getConnect();
		
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberId);
			
			resultSet = preparedStatement.executeQuery();
			
//			행부터
			resultSet.next();
			
//			있는지 없는지 검사
			resultSet.getLong(1);
			
		} catch (SQLException e) {
			check = true;
			System.out.println("checkId query문 오류");
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				 System.out.println("checkId query문 실행 후 오류");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		
		return check;
	}
	
//	로그인
	public boolean login(String memberId, String memberPassword) {
		boolean loginFail = false;
		connection = DBConnector.getConnect();
		
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_ID = ? AND MEMBER_PASSWORD = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberId);
			preparedStatement.setString(2, memberPassword);
			
			resultSet = preparedStatement.executeQuery();
			
//			행부터
			resultSet.next();
			
//			있는지 없는지 검사
			session = resultSet.getLong(1);
			
		} catch (SQLException e) {
			loginFail = true;
			System.out.println("login query문 오류");
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				 System.out.println("login query문 실행 후 오류");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		
		return loginFail;
	}
	
	
//	로그아웃
	public void logOut() {
		session = null;
	}
	
//	정보 수정
	public void update(MemberVo memberVO) {
		connection = DBConnector.getConnect();
		
		String query = "UPDATE TBL_MEMBER SET MEMBER_ID = ?, MEMBER_PASSWORD = ?, MEMBER_NAME = ?, MEMBER_ADDRESS = ? WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberId());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setString(4, memberVO.getMemberAddress());
			preparedStatement.setLong(5, session);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("정보수정 query문 오류");
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				 System.out.println("정보수정 query문 실행 후 오류");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
	}
	
//	비밀번호 변경
	public void updatePassword(MemberVo memberVO) {
		connection = DBConnector.getConnect();
		
		String query = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberPassword());
			preparedStatement.setLong(2, session);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("정보수정 query문 오류");
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				 System.out.println("정보수정 query문 실행 후 오류");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
	}
	
//	회원 탈퇴
	public void outMember() {
		connection = DBConnector.getConnect();
		
		String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("정보수정 query문 오류");
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				 System.out.println("정보수정 query문 실행 후 오류");
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
	}
}
