package com.RegisteredLogin;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.RegisteredLogin.denglu;

public class zhuce{
	
	

public static void main(String[] args) {
	new zhuce();
}
public zhuce() {
	JFrame jFrame = new JFrame("ע�����");
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
	
	
	JRadioButton hbtn = new JRadioButton("�����û�");
	JRadioButton ybtn = new JRadioButton("ҽ����Ա");
	hbtn.setContentAreaFilled(false); //��ť͸��
	ybtn.setContentAreaFilled(false); //��ť͸��
	ButtonGroup hy = new ButtonGroup();
	hy.add(hbtn);
	hy.add(ybtn);
	hbtn.setBounds(220,80,80,30);
	ybtn.setBounds(320,80,80,30);	   
	jFrame.add(hbtn);
	jFrame.add(ybtn);
	
	
	JLabel label1 = new JLabel("��   ��");
	label1.setFont(new Font("BOLD", Font.BOLD, 15));
	label1.setBounds(205, 120, 50, 40);
	jFrame.add(label1);
	
	JLabel label2 = new JLabel("��   ��");
	label2.setFont(new Font("BOLD", Font.BOLD, 15));
	label2.setBounds(205, 175, 50, 40);
	jFrame.add(label2);
	
	JLabel label3 = new JLabel("֤����");
	label3.setFont(new Font("BOLD", Font.BOLD, 15));
	label3.setBounds(205, 230, 50, 40);
	jFrame.add(label3);
	
	JLabel label4 = new JLabel("ס   ַ");
	label4.setFont(new Font("BOLD", Font.BOLD, 15));
	label4.setBounds(205, 285, 50, 40);
	jFrame.add(label4);
	
	final JTextField text1 = new JTextField();
	text1.setBounds(260, 130, 150, 25);
	jFrame.add(text1);
	
	final JTextField text2 = new JTextField();
	text2.setBounds(260, 185, 150, 25);
	jFrame.add(text2);
	
	final JTextField text3 = new JTextField();
	text3.setBounds(260, 240, 150, 25);
	jFrame.add(text3);
	
	final JTextField text4 = new JTextField();
	text4.setBounds(260, 295, 150, 25);
	jFrame.add(text4);
	
	
	JButton button = new JButton("ȷ��");
	button.setBounds(205, 340, 200, 40);
	button.setContentAreaFilled(false); //��ť͸��
	button.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
//1.����û�����ԭʼ���ݣ��뵯����ʾ�û���������
//2.�����û����жϵ�ǰ�û��Ƿ��Ѿ���ע��
			
//if(!UserDB.exists(p1)){
			if (text1.getText().equals("")) {
				
				JOptionPane.showMessageDialog
				(button, "�û�������Ϊ�գ�","������Ϣ",JOptionPane.WARNING_MESSAGE);
				return;
			}
			if(text2.getText().equals("")){
				JOptionPane.showMessageDialog
				(button, "���벻��Ϊ�գ�","������Ϣ",JOptionPane.WARNING_MESSAGE);
				return;
				
			}
			if(text3.getText().equals("")){
				JOptionPane.showMessageDialog
				(button, "֤������Ϊ�գ�","������Ϣ",JOptionPane.WARNING_MESSAGE);
				return;
				
			}
			else{
				
				String t1 = text1.getText();
				String t2 = text2.getText();
				JOptionPane.showMessageDialog(button,"�û�����"+t1+'\n'+
						"��    �룺"+t2, "��ϲ��ע��ɹ�",
						JOptionPane.WARNING_MESSAGE);
								
			}
		}	
	});
	
	button.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO �Զ����ɵķ������
			
			String name = text1.getText();
			String pwd = text2.getText();
			String id = text3.getText();
			String add = text4.getText();
			
			if(hbtn.isSelected()){
				User user = new User(name, pwd, id, add);
//���û���Ϣ��ӵ�����ע���û���Ϣ�С�
				UserDB.users.put(name, user);
				UserDB db = new UserDB();
//�־û���
				db.saveData(user,"users");
//System.out.println(UserDB.users);
				
			} else  if(ybtn.isSelected()){
				Adm adm = new Adm(name, pwd, id, add);
				//���û���Ϣ��ӵ�����ע���û���Ϣ�С�
				AdmDB.adms.put(name, adm);
				AdmDB db = new AdmDB();
				//�־û���
				db.saveData(adm,"adms");
				//System.out.println(AdmDB.adms);		
			}else{
				JOptionPane.showMessageDialog
				(button, "���δȷ����","������Ϣ",JOptionPane.WARNING_MESSAGE);
				return;
				
			}
		}
	});
	
	jFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			//System.exit(0);
			jFrame.setVisible(false);
			
		}	
	});
	jFrame.setVisible(true);
	
	JButton button2 = new JButton("����");
	button2.setBounds(205, 400, 200, 40);
	button2.setContentAreaFilled(false); //��ť͸��
	button2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
//		this.setVisible(false);
			new denglu();
			jFrame.setVisible(false);
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
	jFrame.add(button);
	
	jFrame.setVisible(true);
	
}
}
