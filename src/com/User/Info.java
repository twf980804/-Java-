package com.User;



import java.io.Serializable;

/**
 * ��װ�õ��û���Ϣ����������ע���û�
 * @author miaomiao
 * ��Ϊ������Ҫ��Tic������г־ã�����ʵ��java.io.Serializable
 */
public class Info implements Serializable{
	private static final long serialVersionUID = 1L;
	private String text1;
	private String text2;
	private String sex;
	private String text3;
	
	public String getText1() {
		return text1;
	}
	public void setName(String text1) {
		this.text1= text1;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getText3() {
		return text3;
	}
	public void setText3(String text3) {
		this.text3 = text3;
	}
	
	//�вι�����
	public Info(String text1,String text2,String sex,String text3){
		this.text1= text1;
		this.text2 = text2;
		this.sex = sex;
		this.text3 = text3;
	}
	
	
	public static String getText() {
		// TODO Auto-generated method stub
		return null;
	}
}
