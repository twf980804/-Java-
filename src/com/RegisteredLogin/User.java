package com.RegisteredLogin;
import java.io.Serializable;
/**
 * ��װ�õ��û���Ϣ����������ע���û�
 * @author 
 * ��Ϊ������Ҫ��User������г־ã�����ʵ��java.io.Serializable
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String pwd;
	private String id;
	private String add;

	public User() {
		//�޲ι�����
	}
	//�вι�����
	public User(String name,String pwd,String id,String add){
		this.name = name;
		this.pwd = pwd;
		this.id = id;
		this.add = add;

	}


	public String getT1() {
		return name;
	}
	public void setT1(String name) {
		this.name = name;
	}
	public String getT2() {
		return pwd;
	}
	public void setT2(String pwd) {
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}

	

}