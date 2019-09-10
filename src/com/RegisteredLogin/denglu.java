package com.RegisteredLogin;
import java.awt.Font;
import java.awt.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.User.Patient;
import com.admin.Doctor;





public class denglu {

	 	 
public static void main(String[] args) {

				new denglu();
}

			public  denglu() {
				
				JFrame jFrame = new JFrame("��½����");
				JPanel imagePanel;
			    ImageIcon background;
				jFrame.setBounds(200,90,950,600);
				jFrame.setResizable(false);
				jFrame.setLayout(null);
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//����ͼƬ
				background = new ImageIcon("denglu.png");// ����ͼƬ
				JLabel label = new JLabel(background);// �ѱ���ͼƬ��ʾ��һ����ǩ����
				// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
				label.setBounds(0, 0, background.getIconWidth(),
						background.getIconHeight());
				// �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��
				imagePanel = (JPanel) jFrame.getContentPane();
				imagePanel.setOpaque(false);
				// ���ݴ���Ĭ�ϵĲ��ֹ�����ΪBorderLayout
				
				jFrame.getLayeredPane().setLayout(null);
				// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
				jFrame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setSize(background.getIconWidth(), background.getIconHeight());
				jFrame.setResizable(false);
				
				jFrame.setVisible(true);
			
				
				
				JLabel label0 = new JLabel("��ӭ������������������Ϣ����");
				label0.setFont(new Font("BOLD", Font.BOLD, 25));
				label0.setBounds(300, 80, 500, 50);
				jFrame.add(label0);
				
				JLabel label1 = new JLabel("����");
				label1.setFont(new Font("BOLD", Font.BOLD, 15));
				label1.setBounds(400, 140, 100, 50);
				jFrame.add(label1);
				
				JLabel label2 = new JLabel("����");
				label2.setFont(new Font("BOLD", Font.BOLD, 15));
				label2.setBounds(400, 200, 100, 50);
				jFrame.add(label2);
				
				final JTextField text1 = new JTextField();
				text1.setBounds(450, 145, 130, 25);
				jFrame.add(text1);
				
				final JPasswordField text2 = new JPasswordField();
				text2.setBounds(450, 205, 130,25);
				jFrame.add(text2);
				JRadioButton hbtn = new JRadioButton("�����û�");
				JRadioButton ybtn = new JRadioButton("ҽ����Ա");
				hbtn.setContentAreaFilled(false); //��ť͸��
				ybtn.setContentAreaFilled(false); //��ť͸��
				ButtonGroup bg = new ButtonGroup();
				bg.add(hbtn);
				bg.add(ybtn);
				hbtn.setBounds(410,250,80,30);
				ybtn.setBounds(500,250,80,30);	   
				jFrame.add(hbtn);
				jFrame.add(ybtn);
				
				
				JButton button = new JButton("��¼");
				button.setBounds(105, 295, 180, 40);
				button.setContentAreaFilled(false); //��ť͸��
				jFrame.add(button);
				
				button.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
					}
					
					public void mouseClicked(MouseEvent e) {
						
						// TODO Auto-generated method stub
						// this.setVisible(false);
						if(hbtn.isSelected()){
							String pwd = text2.getText();
							User user = UserDB.users.get(text1.getText());
							if(user==null||!pwd.equals(user.getT2())){
								JOptionPane.showMessageDialog(
										button, "�û������������");
							}else{
								JOptionPane.showMessageDialog(button, "��½�ɹ���");
								jFrame.setVisible(false);
									new Patient();
							}}else if(ybtn.isSelected()){
								String pwd = text2.getText();
								Adm adm = AdmDB.adms.get(text1.getText());
								if(adm==null||!pwd.equals(adm.getT2())){
									JOptionPane.showMessageDialog(
											button, "�û������������");
								}else{
									JOptionPane.showMessageDialog(button, "��½�ɹ���");
									jFrame.setVisible(false);
										new Doctor();
								}		
							}else{
								JOptionPane.showMessageDialog(button, "���δȷ�ϣ�");
							}
							
						}
				});
				
				
				text1.addFocusListener(new FocusListener() {
					public void focusLost(FocusEvent e) {
						// TODO Auto-generated method stub
						String text = text1.getText();
						if(text.trim().length()<=0)
							text1.setText("�������û���");
					}
					
					public void focusGained(FocusEvent e) {
						// TODO Auto-generated method stub
						String text = text1.getText();
						if("�������û���".equals(text)){
							text1.setText("");
						}
					}
				});
				text2.addFocusListener(new FocusListener() {
					public void focusLost(FocusEvent e) {
						// TODO Auto-generated method stub
						String text1 = text2.getText();
						if(text1.trim().length()<=0)
							text2.setText("����������");
					}
					
					public void focusGained(FocusEvent e) {
						// TODO Auto-generated method stub
						String text1 = text2.getText();
						if("����������".equals(text1)){
							text2.setText("");
						}
					}
					
					
				});
				
				jFrame.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
//			System.exit(0);
						jFrame.setVisible(false);
					}	
				});
				
				jFrame.setVisible(true);
				
				
				JButton button2 = new JButton("ע��");
				button2.setBounds(105, 350, 180, 40);
				button2.setContentAreaFilled(false); //��ť͸��
				button2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO �Զ����ɵķ������
						new zhuce();
						
					}
				});
				
				jFrame.addWindowListener(new WindowAdapter() {
					
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						//System.exit(0);	
						jFrame.setVisible(false);
					}
					
				});
				jFrame.add(button2);
				
				jFrame.setVisible(true);
				
			
			}
			


			public void setVisible(boolean b) {
				// TODO Auto-generated method stub
			}
			static Frame jFrame;
			public static void main1(String[] args) {
//	ϵͳ����ʱ����ԭ���־û������ݼ��ص���ǰ�ڴ�����
				UserDB db = new UserDB();
				@SuppressWarnings("unchecked")
				HashMap<String, User> map = 
				(HashMap<String, User>)db.getData("users");
//	����ȡ�����ϴγ־û������ݣ����뵱ǰϵͳ���ݼ���UserDB.users
				System.out.println(map);
				if(map!=null){
					UserDB.users.putAll(map);
				}
				jFrame = new Frame("��½");
				
				AdmDB db1 = new AdmDB();
				@SuppressWarnings("unchecked")
				HashMap<String, Adm> map1 = 
				(HashMap<String, Adm>)db1.getData("adms");
				
				System.out.println(map1);
				if(map1!=null){
					AdmDB.adms.putAll(map1);
				}
				
			}
}