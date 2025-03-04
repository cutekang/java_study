package vo;

import java.util.Objects;

public class MemberVo {
	private Long id;
	private String memberId;
	private String memberPassword;
	private String memberName;
	private String memberAddress;
	private String memberRecommenderId;
	
	public MemberVo() {
		// TODO Auto-generated constructor stub
	}

	public MemberVo(Long id, String memberId, String memberPassword, String memberName, String memberAddress,
			String memberRecommenderId) {
		this.id = id;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.memberRecommenderId = memberRecommenderId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberRecommenderId() {
		return memberRecommenderId;
	}

	public void setMemberRecommenderId(String memberRecommenderId) {
		this.memberRecommenderId = memberRecommenderId;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", memberId=" + memberId + ", memberPassword=" + memberPassword + ", memberName="
				+ memberName + ", memberAddress=" + memberAddress + ", memberRecommenderId=" + memberRecommenderId
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVo other = (MemberVo) obj;
		return Objects.equals(id, other.id);
	}

	
}
