package view;

import dao.MemberDAO;
import vo.MemberVo;

public class View {

	public static void main(String[] args) {
		MemberVo memberVo = new MemberVo();
		MemberDAO memberDAO = new MemberDAO();
//		
//		회원가입
//		if(memberDAO.checkId("wlsud94")) {
//			System.out.println("사용 가능한 아이디");
//			
//			memberVo.setMemberId("wlsud94");
//			memberVo.setMemberPassword("1234");
//			memberVo.setMemberName("양진영");
//			memberVo.setMemberAddress("경기도 수원시");
//			
//			memberDAO.join(memberVo);
//			
//		}else {
//			System.out.println("중복된 아이디");
//		}
		
//		로그인
		if(memberDAO.login("wlsud94", "5678")) {
			System.out.println("로그인 실패. \n아이디 혹은 비밀번호를 확인해주세요.");
		}else {
			System.out.println("로그인 성공\n양진영님 환영합니다.");
		}
		
//		정보수정
//		MemberVo newMemberVO = new MemberVo();
//		newMemberVO.setMemberId("rkddl94");
//		newMemberVO.setMemberPassword("4321");
//		newMemberVO.setMemberName("강이");
//		newMemberVO.setMemberAddress("경기도 화성시");
//		
//		memberDAO.update(newMemberVO);
		
//		비밀번호 변경
		MemberVo newMemberVO = new MemberVo();
		newMemberVO.setMemberPassword("5678");
		
		memberDAO.updatePassword(newMemberVO);
		
//		회원 탈퇴
		memberDAO.outMember();
	}
}
