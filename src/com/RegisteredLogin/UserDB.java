package com.RegisteredLogin;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.RegisteredLogin.User;
//����ά�����е�ע���û�����Ϣ
public class UserDB {
	public static HashMap<String, User> users = 
			new  HashMap<String,User>();
	/**
	 * �˷������������ݽ��г־û�
	 * @param Data ��Ҫ���־û�������
	 * @param fileName �־û�����λ��
	 */
	 public void saveData(Object Data,String fileName){
    	 ObjectOutputStream y1 = null;
		try {
			y1 = new ObjectOutputStream(new FileOutputStream("users",true));
			y1.writeObject(Data);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(y1!=null)y1.close();
			}catch(Exception e){
				
			}
		}
		
     }
     /**
      * �˷���������ȡԭ���־û�������
      *fileName����Ҫ�������ȡ�־û�������
      *���ػ�ȡ���ĳ־û�����
      */
     public Object getData(String fileName){
    	 //�����ļ�����
    	 File f = new File(fileName);
    	 //�ж�����ļ������ڣ���ôֱ�ӷ���null
    	 if(!f.exists()){
    		 return null;
    	 }
    	 ObjectInputStream y2 = null;
    	 Object data = null;
    	 try{
    		 y2 = new ObjectInputStream(new FileInputStream(f));
    		 data = y2.readObject();
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }finally{
    		 try{if(y2!=null) y2.close();
    	 }catch(Exception e){
    	     }
    	 }
         return data;
     }
    
}