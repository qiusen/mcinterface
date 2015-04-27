namespace go tserver.managercenter
namespace java com.dihaitech.tserver.managercenter

//管理员，使用string处理时间类型
struct Manager{
	1:i32 id,
	2:string email,
	3:string password,
	4:string nickname,
	5:string ename,
	6:string logo,
	7:i32 status,
	8:i32 departmentId,
	9:i32 positionId,
	10:i32 roleId,
	11:string creator,
	12:string createtime,
	13:string logintime,
	14:string loginip,
}

//管理员详细信息
struct ManagerInfo{
	1:i32 id,
	2:string email,
	3:string tel,
	4:string mobile,
	5:i32 sex,
	6:string address,
	7:string qq,
	8:string updatetime,
}

struct Department{
	1:i32 id,
	2:string name,
	3:string code,
	4:i32 type,
	5:string leaderEmail,
	6:i32 superId,
	7:string creator,
	8:string createtime,
	9:string updator,
	10:string updatetime,
	
}

struct Member{
	1:i32 id,
	2:string username,
	3:string passwd,
	4:string name,
	5:string logoUrl,
	6:i32 status,
	7:string regtime,
	8:string logintime,
	
}

// 服务
service ManagerCenterService {

  // 发起远程调用
 
  //查询
  list<Manager> funCallManager(1:i64 callTime, 2:string funCode, 3:map<string, string> paramMap),
  
  list<ManagerInfo> funCallManagerInfo(1:i64 callTime, 2:string funCode, 3:map<string, string> paramMap),
  
  list<Department> funCallDepartment(1:i64 callTime, 2:string funCode, 3:map<string, string> paramMap),
  
  list<Member> funCallMember(1:i64 callTime, 2:string funCode, 3:map<string, string> paramMap),

}