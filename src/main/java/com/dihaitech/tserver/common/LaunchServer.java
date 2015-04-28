package com.dihaitech.tserver.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TBinaryProtocol.Factory;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dihaitech.tserver.managercenter.Department;
import com.dihaitech.tserver.managercenter.Manager;
import com.dihaitech.tserver.managercenter.ManagerCenterService;
import com.dihaitech.tserver.managercenter.ManagerInfo;
import com.dihaitech.tserver.managercenter.Member;
import com.dihaitech.tserver.service.IManagerService;
import com.dihaitech.tserver.service.IMemberService;
import com.dihaitech.tserver.util.TypeUtil;

/**
 * 启动
 * @author qiusen
 *
 */
public class LaunchServer implements ManagerCenterService.Iface{

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	IMemberService memberService = (IMemberService) context.getBean("memberService");
	IManagerService managerService = (IManagerService) context.getBean("managerService");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(19090, Property.THRIFT_CLIENT_TIMEOUT);

			ManagerCenterService.Processor<ManagerCenterService.Iface> processor = new ManagerCenterService.Processor<ManagerCenterService.Iface>(
					new LaunchServer());

			Factory protFactory = new TBinaryProtocol.Factory(true, true);

			TNonblockingServer.Args as = new TNonblockingServer.Args(
					serverTransport);
			as.processor(processor);
			as.protocolFactory(protFactory);
			TServer server = new TNonblockingServer(as);
			System.out.println("Start server on port " + Property.THRIFT_PORT + " ...");
			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.managercenter.ManagerCenterService.Iface#funCallDepartment(long, java.lang.String, java.util.Map)
	 */
	@Override
	public List<Department> funCallDepartment(long arg0, String arg1,
			Map<String, String> arg2) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.managercenter.ManagerCenterService.Iface#funCallManager(long, java.lang.String, java.util.Map)
	 */
	@Override
	public List<Manager> funCallManager(long arg0, String arg1,
			Map<String, String> arg2) throws TException {
		// TODO Auto-generated method stub
		List<Manager> managerList = null;
		if(arg1.equalsIgnoreCase("selectAll")){
			managerList = managerService.selectAll();
		}
		
		if(arg1.equalsIgnoreCase("selectManagerByEmailPassword")){
			String email = arg2.get("email");
			String password = arg2.get("password");
			System.out.println(email + " " + password);
			Manager manager = new Manager();
			manager.setEmail(email);
			manager.setPassword(password);
			
			Manager managerVO = managerService.selectManagerByEmailPassword(manager);
			managerList = new ArrayList<Manager>();
			managerList.add(managerVO);
		}
		
		return managerList;
	}

	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.managercenter.ManagerCenterService.Iface#funCallManagerInfo(long, java.lang.String, java.util.Map)
	 */
	@Override
	public List<ManagerInfo> funCallManagerInfo(long arg0, String arg1,
			Map<String, String> arg2) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.dihaitech.tserver.managercenter.ManagerCenterService.Iface#funCallMember(long, java.lang.String, java.util.Map)
	 */
	@Override
	public List<Member> funCallMember(long arg0, String arg1,
			Map<String, String> arg2) throws TException {
		// TODO Auto-generated method stub
		
		List<Member> memberList = null;
		if(arg1.equalsIgnoreCase("selectAll")){
			memberList = memberService.selectAll();
		}
		
		if(arg1.equalsIgnoreCase("selectMemberById")){
			String idStr = arg2.get("id");
			int id = TypeUtil.stringToInt(idStr);
			Member member = new Member();
			member.setId(id);
			Member memberVO = memberService.selectMemberById(member);
			memberList = new ArrayList<Member>();
			memberList.add(memberVO);
		}
		
		if(arg1.equalsIgnoreCase("selectMemberByUsernamePasswd")){
			String username = arg2.get("username");
			String passwd = arg2.get("passwd");
			
			Member member = new Member();
			member.setUsername(username);
			member.setPasswd(passwd);
			
			Member memberVO = memberService.selectMemberByUsernamePasswd(member);
			memberList = new ArrayList<Member>();
			memberList.add(memberVO);
		}
		
		return memberList;
	}
	
}
