package com.admin;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class Doctor {
		public Doctor() {
			super();
			init();
		}
		public void init(){
			final JFrame f = new JFrame("��������������Ϣϵͳ");
			JPanel imagePanel;
		    ImageIcon background;
			f.setLayout(null);
			f.setBounds(200,90,950,600);
			JLabel l = new JLabel("��ӭ������������������Ϣ���ģ�ҽ������");
			l.setBounds(230,20,500,150);
	        l.setFont(new Font("BOLD", Font.BOLD, 25));
			l.setOpaque(false);//��ΪJLabel��Ĭ��͸���ģ�ֻ����ȡ����͸���ȡ��ſ�����ʾ��ɫ���������ؼ�Ҳһ����
	        f.add(l);
	        
	      //����ͼƬ
			background = new ImageIcon("denglu.png");// ����ͼƬ
			JLabel label = new JLabel(background);// �ѱ���ͼƬ��ʾ��һ����ǩ����
			// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
			label.setBounds(0, 0, background.getIconWidth(),
					background.getIconHeight());
			// �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��
			imagePanel = (JPanel) f.getContentPane();
			imagePanel.setOpaque(false);
			// ���ݴ���Ĭ�ϵĲ��ֹ�����ΪBorderLayout
			
			f.getLayeredPane().setLayout(null);
			// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
			f.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(background.getIconWidth(), background.getIconHeight());
			f.setResizable(false);
	        

	        JButton btn1 = new JButton("�鿴ԤԼ״̬");
	        f.add(btn1);
	        btn1.setBounds(50,180,150,50);
			btn1.setContentAreaFilled(false); //��ť͸��
	        btn1.addMouseListener(new MouseAdapter() {
	        	@Override
	        		public void mouseClicked(MouseEvent e) {
	        			// TODO Auto-generated method stub
//	        		this.setVisible(false);
	        		new View();
	        	}
	        		});
	        JButton btn2 = new JButton("���߸��˵���");
	        f.add(btn2);
	        btn2.setBounds(50,270,150,50);
			btn2.setContentAreaFilled(false); //��ť͸��
	        btn2.addMouseListener(new MouseAdapter() {
	        	@Override
	        		public void mouseClicked(MouseEvent e) {
	        			// TODO Auto-generated method stub
//	        		this.setVisible(false);
	        		new DangAnView();
	        	}
	        		});
	        JButton btn3 = new JButton("ҩƷ�۳���Ϣ");
	        f.add(btn3);
	        btn3.setBounds(50,360,150,50);
			btn3.setContentAreaFilled(false); //��ť͸��
	        btn3.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		// TODO Auto-generated method stub
//	        		this.setVisible(false);
	        		new ypinformation();
	        	}
	        });
	        JButton btn4 = new JButton("ҽ������");
	        f.add(btn4);
	        btn4.setBounds(50,450,150,50);
			btn4.setContentAreaFilled(false); //��ť͸��
	        btn4.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		// TODO Auto-generated method stub
//	        		this.setVisible(false);
	        		new WindowServer();
	        	}
	        });
	        JButton btn6 = new JButton("�˳�");
	        f.add(btn6);
			btn6.setContentAreaFilled(false); //��ť͸��
	        btn6.setForeground(Color.red);
	        btn6.setBounds(800,480,80,50);
	        
	        btn6.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		// TODO Auto-generated method stub
	        		System.exit(0);	    
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
		new Doctor();
	}

}
