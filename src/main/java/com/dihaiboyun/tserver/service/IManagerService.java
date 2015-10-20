package com.dihaiboyun.tserver.service;

import java.util.List;

import com.dihaiboyun.tserver.managercenter.Manager;



/**
 * 管理员 业务接口
 * 
 * @author cg
 *
 * @date 2015-04-27
 */
public interface IManagerService {
	
	/**
	 * 查询所有 管理员
	 * @return
	 */
	public List<Manager> selectAll();
	
	/**
	 * 根据 ID 查找 管理员 
	 * @param manager
	 * @return
	 */
	public Manager selectManagerById(Manager manager);
	
	/**
	 * 添加 管理员 
	 * @param manager
	 * @return
	 */
	public int addSave(Manager manager);
	
	/**
	 * 修改 管理员 
	 * @param manager
	 * @return
	 */
	public int editSave(Manager manager);
	
	/**
	 * 根据 ID 删除 管理员 
	 * @param str
	 * @return
	 */
	public int deleteByIds(String str);

	/**
	 * 根据邮箱和密码查询
	 * @param manager
	 * @return
	 */
	public Manager selectManagerByEmailPassword(Manager manager);
}
