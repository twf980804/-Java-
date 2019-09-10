package com.User;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.admin.View;



public class Order {
	public Order() {
		super();
		OrderGUI();
	}

	  //��ʼ������
			Font d = new Font("����", Font.BOLD, 22);
			Font f = new Font("����", Font.BOLD, 15);
			// ��ʼ������
	JFrame orderGUI = new JFrame("ԤԼƽ̨");

	private JPanel imagePanel;
	private ImageIcon background;
	JLabel reservation = new JLabel("ԤԼƽ̨");
	JLabel patient = new JLabel("��   �ߣ�");
	JLabel doctor = new JLabel("ԤԼҽ����");
	JLabel time = new JLabel("ԤԼʱ�䣺");
	TextField userField =new TextField();
	JComboBox box1 = new JComboBox(new String[]{"-��ѡ��-","��ҽ��","��ҽ��","��ҽ��"} );
	JComboBox box2 = new JComboBox(new String[]{"-��ѡ��-","��ҽ��","��ҽ��","��ҽ��"} );
	JButton bt1 = new JButton("ԤԼ");
	JButton bt2 = new JButton("ȡ��");
	JButton bt4 = new JButton("�˳�ϵͳ");
public void OrderGUI() {
	//����ͼƬ
	background = new ImageIcon("denglu.png");// ����ͼƬ
	JLabel label = new JLabel(background);// �ѱ���ͼƬ��ʾ��һ����ǩ����
	// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
	label.setBounds(0, 0, background.getIconWidth(),
			background.getIconHeight());
	// �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��
	imagePanel = (JPanel) orderGUI.getContentPane();
	imagePanel.setOpaque(false);
	// ���ݴ���Ĭ�ϵĲ��ֹ�����ΪBorderLayout
	imagePanel.setLayout(new FlowLayout());
	
	orderGUI.getLayeredPane().setLayout(null);
	// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
	orderGUI.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
	orderGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	orderGUI.setSize(background.getIconWidth(), background.getIconHeight());
	orderGUI.setResizable(false);
	
	
	// ���ö���
			orderGUI.setBounds(200, 90, 950, 600);
			//�����˳�
			orderGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			//ȡ����ܸ�ʽ
			orderGUI.setLayout(null);
			//����λ�á���С������
			reservation.setBounds(380, 60, 400, 40);
			Font font1=new Font("Monospaced",Font.BOLD,38);//���������ʽ�ʹ�С
			reservation.setForeground(Color.BLACK);//����ǰ��ɫ
			reservation.setFont(font1);
			patient.setBounds(300,150,160,30);
			Font font2=new Font("Monospaced",Font.BOLD,30);//���������ʽ�ʹ�С
			patient.setForeground(Color.BLACK);//����ǰ��ɫ
			patient.setFont(font2);
			doctor.setBounds(300, 220, 160, 30);
			doctor.setFont(font2);
			time.setBounds(300, 290, 160, 30);
			time.setFont(font2);
			userField.setBounds(460, 150, 150, 30);
			Font font3=new Font("Monospaced",Font.BOLD,19);//���������ʽ�ʹ�С
			reservation.setForeground(Color.BLACK);//����ǰ��ɫ
			userField.setFont(font3);
			userField.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
					
					// TODO �Զ����ɵķ������
					String text = userField.getText();
					//���ı������û��������Ϣ�ĳ���<=0��ʱ����ʾ�û�����
					if(text.trim().length()<=0){
						userField.setText("�����뻼������");
					}
					
				}
				//�������ʧȥ����ʱ����
				@Override
				public void focusGained(FocusEvent e) {
					// TODO �Զ����ɵķ������
					String text = userField.getText();
					//�жϵ�ǰ������е������Ƿ��ԭʼ����(�������û���)һ�£�
					//���һ�£������û�δ�����룬����Ϣ����""
					if("�����뻼������".equals(text)){
						userField.setText("");
					}
				}
			});
			box1.setBounds(460, 220, 150, 30);
			box1.setFont(font3);
			box2.setBounds(460, 290, 150, 30);
			box2.setFont(font3);
			bt1.setBounds(350, 380, 80, 35);
			bt1.setFont(new Font("Monospaced", Font.BOLD, 22)); 
		    bt1.setContentAreaFilled(false); //��ť͸��
		    //bt1.setBorderPainted(false); //ȥ����ť�߿�
			bt1.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					//IO��������д���ļ�
					//����һ��File��ʵ�����󣬴���һ��ticket���ļ�
					File file = new File("ReservationInformation.txt");
					//IO�쳣
					try {
						String text = userField.getText();
						String doctor1 = (String) box1.getSelectedItem();
						String time1 = (String) box2.getSelectedItem();
						if (!file.exists()) {
							file.createNewFile();
						}
						//ͨ��BufferedWrite����������д���ļ�
						FileWriter fw = new FileWriter(file,true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(text+"    ");
						bw.write(doctor1+"        ");
						bw.write(time1+"\r\n");
						bw.flush();
						bw.close();
						
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					//	f.setVisible(false);
				}
			});

		    bt1.addMouseListener(new MouseAdapter() {
			    	public void mouseClicked(MouseEvent e) {
			    		
			    		String name = userField.getText();
			    		name = "              "+name;
			    		String doctor1 = 
			    				(String)box1.getSelectedItem();
			    		
			    		String time1 = 
			    				(String)box2.getSelectedItem();
			    	if(box1.getSelectedItem().equals("-��ѡ��-")||
			    			box2.getSelectedItem().equals("-��ѡ��-")
			    			){
			        	// TODO Auto-generated method stub
			    		JOptionPane.showMessageDialog(box1, "ԤԼ��Ϣδ����",null, JOptionPane.WARNING_MESSAGE);
			 

			   
			    	}else if(userField.getText().equals("�����뻼������")||userField.getText().equals("")){
			        	// TODO Auto-generated method stub
			    		JOptionPane.showMessageDialog(doctor, "�����뻼������",null, JOptionPane.WARNING_MESSAGE);

			    	}
			    	else if(name!="�����뻼������" && doctor1!= "-��ѡ��-"  && time1!="-��ѡ��-"	){
						//����Ϣ��ӵ�������Ϣ�С�
			    		JOptionPane.showMessageDialog(box2, "ԤԼ�ɹ�",null, JOptionPane.WARNING_MESSAGE);
			    	}
			    	Information info  = new Information(name, doctor1,time1);
						DB.info.put(name, info);
						//����Ϣͨ�� saveData(buyerDB,info,"info");����
						DB db = new DB();
						db.saveData(DB.info, "info");
			    
			 		
			         /*  orderGUI.setVisible(false);*/}}
			    				);
			bt2.setBounds(490, 380, 80, 35);
			bt2.setFont(new Font("Monospaced", Font.BOLD, 22)); 
		    bt2.setContentAreaFilled(false); //��ť͸��
		    //bt2.setBorderPainted(false); //ȥ����ť�߿�
			bt2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					new Patient();
				}
			});
			
			bt4.setBounds(800, 20, 119, 35);
			bt4.setFont(new Font("Monospaced", Font.BOLD, 20));
		    bt4.setContentAreaFilled(false); //��ť͸��
			//bt4.setBorder(BorderFactory.createLoweredBevelBorder());  //����ȥ�İ�ť
			bt4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);;
				}
			});
			// ��Ӷ���
			orderGUI.add(reservation);
			orderGUI.add(patient);
			orderGUI.add(doctor);
			orderGUI.add(time);
			orderGUI.add(userField);
			orderGUI.add(box1);
			orderGUI.add(box2);
			orderGUI.add(bt1);
			orderGUI.add(bt2);
			orderGUI.add(bt4);
			// ������ӻ�
			orderGUI.setVisible(true);
			
}

//��������ִ�е����
public static void main(String[] args) {
	Order o = new Order();
	o.OrderGUI();
	new Order();
}
}
