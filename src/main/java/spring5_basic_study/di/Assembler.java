package spring5_basic_study.di;

public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regService;
	private ChangePasswordService pwdService;
	private SelectService selService;
	
	public Assembler() {
		memberDao = new MemberDao();
		regService = new MemberRegisterService(memberDao);
		pwdService = new ChangePasswordService(memberDao);
		selService = new SelectService(memberDao);
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getRegService() {
		return regService;
	}

	public ChangePasswordService getPwdService() {
		return pwdService;
	}

	public SelectService getSelService() {
		return selService;
	}
	
}
