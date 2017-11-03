package com.sample.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("memberService")
// @Service -> 자동으로 스캔
// memberService -> 빈 등록시 이름으로 작동
public class MemberServiceImpl {

	//@Autowired
	// 타입을 기준으로 타입이 같은 클래스를 주입
	@Resource(name="mysql")
	// name 지정하지 않을 경우 @AutoWired와 동일하게 작동
	// name 지정시 변수를 지정된 이름을 가진 bean과 매칭시킴
	private MemberDao memberDao;
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("객체 생성된 직후에..... 이 코드는 실행된다.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("객체 파괴 직전에 .... 이 코드는 실행된다.");
	}
	
	public void removeAllMembers() {
		memberDao.deleteAll();
	}
}
