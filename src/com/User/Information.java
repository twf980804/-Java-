package com.User;

import java.io.Serializable;

/**
 * ��װ�õ��û���Ϣ����������ע���û�
 * ��Ϊ������Ҫ��Information������г־ã�����ʵ��java.io.Serializable
 */
public class Information implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String doctor1;
	private String time1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoctor() {
		return doctor1;
	}
	public void setAdres(String doctor1) {
		this.doctor1 = doctor1;
	}
	public String getTime() {
		return time1;
	}
	public void setTime(String time1) {
		this.time1 = time1;
	}
	
	//�вι�����
	public Information(String name,String doctor1,String time1){
		this.name = name;
		this.doctor1 = doctor1;
		this.time1 = time1;
	}
	public static String getText() {
		// TODO Auto-generated method stub
		return null;
	}
}