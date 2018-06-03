package org.sccooperation.action;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.domain.People;
import org.sccooperation.service.UserManage;

import sun.misc.BASE64Encoder;

public class InsertUserAction {
	/**
	 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理
	 *  JDK version used:JDK1.8 
	 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
	 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
	 * Version:1.0
	 */
	/**实例化一个service层的变量，调用其方法*/
	private UserManage<Object> userManage;
	
	/*用户账号*/
	private String userid;


	/*用户名*/
	private String username;
	
	/*密码*/
	private String password;
	
	/*身份证号*/
	private String userIdCar;
	
	/*手机号*/
	private String usertel;
	
	/*从事行业*/
	private String market;
	
	/*省份*/
	private String province;
	
	/*城市*/
	private String city;
	
	/*地址*/
	private String address;
	
	/*旗帜变量用于识别是普通用户还是企业用户*/
    private String register;

	/**
	 * 根据网页传过来的信息，存入数据库
	 * 
	 * @return 返回'success'或'error'字符串
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception 暂时没做
	 */
	@SuppressWarnings("unchecked")
	public String execute() throws NoSuchAlgorithmException, UnsupportedEncodingException
	{    
		//md5加密密码，再进行加密密码
		MessageDigest md5=MessageDigest.getInstance("MD5"); 
        BASE64Encoder base64en = new BASE64Encoder(); 
        password=base64en.encode(md5.digest(password.getBytes("utf-8")));
        System.out.println("..................................");
        System.out.println(password);
		System.out.println(register);
		
		//if语句为判断是公司注册还是用户注册，然后转入相应操作存入数据库
		    if(register.equals("p"))
		    {
		    	System.out.println("进来了");
			People people = new People();
			people.setAccount(String.valueOf(userid));
			people.setIdnumber(userIdCar);
			people.setPassword(password);
			people.setPnumber(usertel);
			people.setUsername(username);
			people.setName("");
			people.setCv(null);
			people.setId(0);
			people.setNotesum(0);
		    
			
			userManage.insertUser(people);
		    }
		    else if(register.equals("c"))
		    {
		    	System.out.println("enter");
		    	Enterprise enterprise = new Enterprise();
		    	enterprise.setAccount(String.valueOf(userid));
		    	enterprise.setPassword(password);
		    	enterprise.setEname(username);
		    	enterprise.setPlace(province+""+city+""+address);
		    	enterprise.setVocation(market);
		    	enterprise.setContact(usertel);
		    	
		    	userManage.insertUser(enterprise);
		    }
			
			return "success";

	}
	
	
	public UserManage getUserManage() {
		return userManage;
	}

	public void setUserManage(UserManage userManage) {
		this.userManage = userManage;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserIdCar() {
		return userIdCar;
	}

	public void setUserIdCar(String userIdCar) {
		this.userIdCar = userIdCar;
	}

	public String getUsertel() {
		return usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getRegister() {
		return register;
	}


	public void setRegister(String register) {
		this.register = register;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}



}
