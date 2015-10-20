package com.dihaiboyun.tserver.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.dihaiboyun.tserver.dao.IManagerDAO;
import com.dihaiboyun.tserver.managercenter.Manager;
import com.dihaiboyun.tserver.service.IManagerService;

/**
 * 管理员 业务接口 IManagerService 实现类
 * 
 * @author cg
 *
 * @date 2015-04-27
 */
public class ManagerServiceImpl implements IManagerService {

	@Resource
	private IManagerDAO managerDAO;

	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IManagerService#addSave(com.dihaitech.tserver.model.Manager)
	 */
	public int addSave(Manager manager) {
		return managerDAO.addSaveManager(manager);
	}
	
	
	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IManagerService#deleteByIds(java.lang.String)
	 */
	public int deleteByIds(String str) {
		return managerDAO.deleteByIds(str);
	}
	
	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IManagerService#editSave(com.dihaitech.tserver.model.Manager)
	 */
	public int editSave(Manager manager) {
		return managerDAO.editSaveManager(manager);
	}
	
	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.IManagerService#selectAll()
	 */
	public List<Manager> selectAll() {
		return managerDAO.selectAll();
	}
	
	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IManagerService#selectManagerById(com.dihaitech.tserver.model.Manager)
	 */
	public Manager selectManagerById(Manager manager) {
		return managerDAO.selectManagerById(manager);
	}


	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.service.IManagerService#selectManagerByEmailPassword(com.dihaitech.tserver.managercenter.Manager)
	 */
	@Override
	public Manager selectManagerByEmailPassword(Manager manager) {
		// TODO Auto-generated method stub
		return managerDAO.selectManagerByEmailPassword(manager);
	}
}
