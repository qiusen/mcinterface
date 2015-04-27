package com.dihaitech.tserver.dao;

import java.util.List;

import com.dihaitech.tserver.managercenter.Manager;


/**
 * 管理员 DAO 接口
 * 
 * @author cg
 * 
 * @since 2015-04-27
 */
public interface IManagerDAO {

	/**
	 * 添加管理员
	 * 
	 * @param manager
	 * @return
	 */
	public int addSaveManager(Manager manager);

	/**
	 * 根据ID获取指定的管理员信息
	 * 
	 * @param manager
	 * @return
	 */
	public Manager selectManagerById(Manager manager);

	/**
	 * 修改管理员
	 * 
	 * @param manager
	 * @return
	 */
	public int editSaveManager(Manager manager);

	/**
	 * 根据ID删除指定的管理员
	 * 
	 * @param str
	 * @return
	 */
	public int deleteByIds(String str);

	/**
	 * 查询所有管理员
	 * 
	 * @return
	 */
	public List<Manager> selectAll();

	/**
	 * 根据邮箱和密码查询
	 * @param manager
	 * @return
	 */
	public Manager selectManagerByEmailPassword(Manager manager);
}
