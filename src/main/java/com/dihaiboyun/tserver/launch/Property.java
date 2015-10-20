package com.dihaiboyun.tserver.launch;

/**
 * 系统公用属性类，属性对应product.properties中系统部分的属性
 * 
 * @author qiusen
 * 
 */
public class Property {
	/**
	 * thrift 端口
	 */
	public static int THRIFT_PORT;
	
	/**
	 * 客户端连接超时时间
	 */
	public static int THRIFT_CLIENT_TIMEOUT;

	public int getTHRIFT_PORT() {
		return THRIFT_PORT;
	}

	public void setTHRIFT_PORT(int tHRIFT_PORT) {
		THRIFT_PORT = tHRIFT_PORT;
	}

	public int getTHRIFT_CLIENT_TIMEOUT() {
		return THRIFT_CLIENT_TIMEOUT;
	}

	public void setTHRIFT_CLIENT_TIMEOUT(int tHRIFT_CLIENT_TIMEOUT) {
		THRIFT_CLIENT_TIMEOUT = tHRIFT_CLIENT_TIMEOUT;
	} 
	
}
