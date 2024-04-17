package vo;

public class MemberVO {
	private int memberNumber;
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberPhone; 
	private String memberGender; // char형으로 해...?
	private String memberRegisterDate;
	
	public MemberVO() {;}
	
	public MemberVO(int memberNumber, String memberId, String memberPw, String memberName, String memberPhone,
			String memberGender, String memberRegisterDate) {
		this.memberNumber = memberNumber;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberGender = memberGender;
		this.memberRegisterDate = memberRegisterDate;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberRegisterDate() {
		return memberRegisterDate;
	}

	public void setMemberRegisterDate(String memberRegisterDate) {
		this.memberRegisterDate = memberRegisterDate;
	}

	@Override
	public String toString() {
		return "MemberVo [memberNumber=" + memberNumber + ", memberId=" + memberId + ", memberPw=" + memberPw
				+ ", memberName=" + memberName + ", memberPhone=" + memberPhone + ", memberGender=" + memberGender
				+ ", memberRegisterDate=" + memberRegisterDate + "]";
	}
}
