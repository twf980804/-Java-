package com.RegisteredLogin;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage {
	public HomePage() {}
	
	JFrame GUI = new JFrame("��������������Ϣϵͳ");
	private JPanel imagePanel;
	private ImageIcon background;
	JLabel l1 = new JLabel("��������������Ϣϵͳ");
	JButton b1 = new JButton("��½");
	JButton b2 = new JButton("ע��");
	JButton b3 = new JButton("�˳�ϵͳ");
public void HomePageGUI() {
	//����ͼƬ
	background = new ImageIcon("denglu.png");// ����ͼƬ
	JLabel label = new JLabel(background);// �ѱ���ͼƬ��ʾ��һ����ǩ����
	// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
	label.setBounds(0, 0, background.getIconWidth(),
			background.getIconHeight());
	// �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��
	imagePanel = (JPanel) GUI.getContentPane();
	imagePanel.setOpaque(false);
	// ���ݴ���Ĭ�ϵĲ��ֹ�����ΪBorderLayout
	imagePanel.setLayout(new FlowLayout());
	
	GUI.getLayeredPane().setLayout(null);
	// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
	GUI.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
	GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GUI.setSize(background.getIconWidth(), background.getIconHeight());
	GUI.setResizable(false);
	
	GUI.setBounds(200, 90, 950, 600);
	
	GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GUI.setLayout(null);
	GUI.add(l1);
	l1.setBounds(280, 200, 400, 38);
	Font font=new Font("Monospaced",Font.BOLD,38);//���������ʽ�ʹ�С
	l1.setForeground(Color.BLACK);//����ǰ��ɫ
	l1.setFont(font);
	GUI.add(b1);
	b1.setBounds(340, 370, 80, 35);
	b1.setFont(new Font("Monospaced", Font.BOLD, 22)); 
    b1.setContentAreaFilled(false); //��ť͸��
	GUI.add(b2);
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new denglu();		
			GUI.setVisible(false);
			}
	});
	b2.setBounds(510, 370, 80, 35);
	b2.setFont(new Font("Monospaced", Font.BOLD, 22)); 
    b2.setContentAreaFilled(false); //��ť͸��
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new zhuce();
			GUI.setVisible(false);
			}
	});
	GUI.add(b3);
	b3.setBounds(800, 20, 119, 35);
	b3.setFont(new Font("Monospaced", Font.BOLD, 20)); 
    b3.setContentAreaFilled(false); //��ť͸��
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);;
		}
	});
	
	ImageIcon img = new ImageIcon("C:\\Users\\lenovo\\Desktop\\�½��ļ��� (2)\\src\\com\\RegisteredLogin\\denglu.png"); //���뱳��ͼƬ·��
	JLabel background = new JLabel(img);//��ͼƬ�Ž���ǩ��
	GUI.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));//����ǩ�Ž�������
	background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());//���ñ�ǩ�Ĵ�С*/
	GUI.setVisible(true);

}
public static void main(String[] args) {
	HomePage hp = new HomePage();
	hp.HomePageGUI();
}
}
