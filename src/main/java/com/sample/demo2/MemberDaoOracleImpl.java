package com.sample.demo2;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class MemberDaoOracleImpl implements MemberDao {

	public void deleteAll() {
		System.out.println("oracle에서 모든 정보 삭제...");
	}
}
