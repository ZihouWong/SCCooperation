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
	 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����
	 *  JDK version used:JDK1.8 
	 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
	 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
	 * Version:1.0
	 */
	/**ʵ����һ��service��ı����������䷽��*/
	private UserManage<Object> userManage;
	
	/*�û��˺�*/
	private String userid;


	/*�û���*/
	private String username;
	
	/*����*/
	private String password;
	
	/*���֤��*/
	private String userIdCar;
	
	/*�ֻ���*/
	private String usertel;
	
	/*������ҵ*/
	private String market;
	
	/*ʡ��*/
	private String province;
	
	/*����*/
	private String city;
	
	/*��ַ*/
	private String address;
	
	/*���ı�������ʶ������ͨ�û�������ҵ�û�*/
    private String register;

	/**
	 * ������ҳ����������Ϣ���������ݿ�
	 * 
	 * @return ����'success'��'error'�ַ���
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception ��ʱû��
	 */
	@SuppressWarnings("unchecked")
	public String execute() throws NoSuchAlgorithmException, UnsupportedEncodingException
	{    
		//md5�������룬�ٽ��м�������
		MessageDigest md5=MessageDigest.getInstance("MD5"); 
        BASE64Encoder base64en = new BASE64Encoder(); 
        password=base64en.encode(md5.digest(password.getBytes("utf-8")));
        System.out.println("..................................");
        System.out.println(password);
		System.out.println(register);
		
		//if���Ϊ�ж��ǹ�˾ע�ỹ���û�ע�ᣬȻ��ת����Ӧ�����������ݿ�
		    if(register.equals("p"))
		    {
		    	System.out.println("������");
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
