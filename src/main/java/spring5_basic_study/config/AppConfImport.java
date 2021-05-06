package spring5_basic_study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConf1.class, AppConf2.class})	//배열을 사용하여 두 개 이상의 설정클래스도 지정가능
public class AppConfImport {
	
//	@Bean
//	public MemberDao memberDao (){
//		return new MemberDao();
//	}
//	
//	@Bean
//	public MemberPrinter memberPrinter() {
//		return new MemberPrinter();
//	}
}
