package com.User;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

	public class Near {
		public Near() {
			super();
			init();
		}
		public void init(){
			final Frame f = new Frame("�����ܱ߷���");
			f.setLayout(null);
			f.setBounds(200,90,950,600);
			f.setBackground(Color.cyan);
			Label l = new Label("�������������������");
			l.setBounds(300,70,600,100);
	        l.setFont(new Font("BOLD", Font.BOLD, 30));
	        
			Label a = new Label("���ƺ��·����վ��"
					+ "�绰��0931-3645686"+"    ��ַ��xxxxx");
			a.setBounds(230,250,550,50);
	        a.setFont(new Font("BOLD", Font.BOLD, 20));
	        
	        
			Label b = new Label("�������xxx������"
					+ "�绰��6666-9999999"+"    ��ַ��xxxxx");
			b.setBounds(230,350,550,50);
	        b.setFont(new Font("BOLD", Font.BOLD, 20));
	        
	        
	        
	        
			Label c = new Label("�������xxҽԺ��"
					+ "�绰��6666-99988888"+"    ��ַ��xxxxx");
			c.setBounds(230,450,550,50);
	        c.setFont(new Font("BOLD", Font.BOLD, 20));
	        
	        
	        f.add(l);
	        f.add(a);
	        f.add(b);
	        f.add(c);
	        Button btn = new Button("����");
	        f.add(btn);
	        btn.setBounds(800,480,80,50);
	        
	        btn.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		// TODO Auto-generated method stub
	        		f.setVisible(false);
	        
            }
	        });
	        f.addWindowListener(new WindowAdapter() {
	        	
	        	@Override
	        	public void windowClosing(WindowEvent e) {
	        		// TODO Auto-generated method stub
	        		//System.exit(0);	
					f.setVisible(false);
	        	}
	        	
	        });
	        f.setVisible(true);
		}
	public static void main(String args[]){
		new Near();
	}

}
