package spring5_basic_study.di;

public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	private MemberSelectAllService selSvc;

	public Assembler() {
		memberDao = new MemberDao();
//		selSvc = new MemberSelectAllService(memberDao);
		regSvc = new MemberRegisterService(memberDao);
		pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}

	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}
	
	public MemberSelectAllService getMemberList() {
		return selSvc;
	}

}
