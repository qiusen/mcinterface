package com.dihaitech.tserver.service;

import java.util.List;


import com.dihaitech.tserver.managercenter.Member;

/**
 * 会员 业务接口
 * 
 * @author cg
 *
 * @date 2015-04-27
 */
public interface IMemberService {
	
	/**
	 * 查询所有 会员
	 * @return
	 */
	public List<Member> selectAll();
	
	/**
	 * 根据 ID 查找 会员 
	 * @param member
	 * @return
	 */
	public Member selectMemberById(Member member);
	
	/**
	 * 添加 会员 
	 * @param member
	 * @return
	 */
	public int addSave(Member member);
	
	/**
	 * 修改 会员 
	 * @param member
	 * @return
	 */
	public int editSave(Member member);
	
	/**
	 * 根据 ID 删除 会员 
	 * @param str
	 * @return
	 */
	public int deleteByIds(String str);
}
