package spring5_basic_study.di;

import java.util.Map;

public class SelectService {
	private MemberDao memberDao;

	public SelectService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
//	public Map<String, Member> selectAll(){
//		return memberDao.selectAll();
//	}
}
