package com.dihaitech.tserver.service.impl;

import java.util.List;
import javax.annotation.Resource;
import com.dihaitech.tserver.dao.IMemberDAO;
import com.dihaitech.tserver.managercenter.Member;
import com.dihaitech.tserver.service.IMemberService;

/**
 * 会员 业务接口 IMemberService 实现类
 * 
 * @author cg
 *
 * @date 2015-04-27
 */
public class MemberServiceImpl implements IMemberService {

	@Resource
	private IMemberDAO memberDAO;

	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IMemberService#addSave(com.dihaitech.tserver.model.Member)
	 */
	public int addSave(Member member) {
		return memberDAO.addSaveMember(member);
	}
	
	
	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IMemberService#deleteByIds(java.lang.String)
	 */
	public int deleteByIds(String str) {
		return memberDAO.deleteByIds(str);
	}
	
	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IMemberService#editSave(com.dihaitech.tserver.model.Member)
	 */
	public int editSave(Member member) {
		return memberDAO.editSaveMember(member);
	}
	
	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.IMemberService#selectAll()
	 */
	public List<Member> selectAll() {
		return memberDAO.selectAll();
	}
	
	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IMemberService#selectMemberById(com.dihaitech.tserver.model.Member)
	 */
	public Member selectMemberById(Member member) {
		return memberDAO.selectMemberById(member);
	}


	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IMemberService#selectMemberByUsernamePasswd(com.dihaitech.tserver.managercenter.Member)
	 */
	@Override
	public Member selectMemberByUsernamePasswd(Member member) {
		// TODO Auto-generated method stub
		return memberDAO.selectMemberByUsernamePasswd(member);
	}
}
