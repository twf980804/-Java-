package com.User;


import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Buy {
	public  Buy() {
	super();
	init();
	
}
public void init(){
	final JFrame f = new JFrame("��ӭʹ�ù�ҩƽ̨");
	JPanel imagePanel;
    ImageIcon background;
	f.setLayout(null);
	f.setBounds(200,90,950,600);
	
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
	
	JLabel  l1 = new JLabel("��ҩƽ̨");
	l1.setFont(new Font("BOLD", Font.BOLD, 35));
	l1.setBounds(350,90,400,50);
	l1.setOpaque(false);//��ΪJLabel��Ĭ��͸���ģ�ֻ����ȡ����͸���ȡ��ſ�����ʾ��ɫ���������ؼ�Ҳһ����
	f.add(l1);
	
	//վ������
	JLabel l2 = new JLabel("ҩ    Ʒ��");
	l2.setFont(new Font("BOLD", Font.BOLD, 25));
	l2.setBounds(300,180,120,35);
	l2.setOpaque(false);//��ΪJLabel��Ĭ��͸���ģ�ֻ����ȡ����͸���ȡ��ſ�����ʾ��ɫ���������ؼ�Ҳһ����
	f.add(l2);
	
	 final JComboBox<String> kinSelect = 
			new JComboBox<String>(
				new String[]{"-����-","��ð","����","����","ֹ��",
						"����","����","��Чҩ","ɱ��","��ҩ","�ȵ�"});
	 
	 final JComboBox<String> name1Select = 
			new JComboBox<String>(
					new String[]{"-����-"});
	 final String[][] name1s = 
			new String[][]{
			{"������������  ��15","˫�����ڷ�Һ  ��15","��ð��  ��15","���  ��15"},
			{"���������鰷Ƭ  ��15","��˾ƥ��  ��15","�����  ��15"},
			{"�޺�ù�ؽ���  ��15","����ù��  ��15","��ù��  ��15"},
			{"�����ǽ�  ��15","999ֹ��  ��15","��������C  ��15"},
			{"����  ��15","���  ��15","�ٶ��Īƥ�������  ��15","����������Һ  ��15"},
			{"��������Ƭ  ��15","�˶���  ��15"},
			{"��Ч�����裨���ಡ��  ��15","��ѹҩ  ��15"},
			{"����������  ��15","����������Һ  ��15"},
			{"������  ��15","����ĸ  ��15","�ʲ�  ��15","���ϰ�ҩ  ��15","����˪  ��15"},
			{"��������"},
	};
	 kinSelect.setBounds(410, 180,110, 30);
	f.add(kinSelect);
	name1Select.setBounds(530, 180,160, 30);
	f.add(name1Select);
	 
	JLabel l3 = new JLabel("��    ����");
	l3.setFont(new Font("BOLD", Font.BOLD, 25));
	l3.setBounds(300,240,120,50);
	l3.setOpaque(false);//��ΪJLabel��Ĭ��͸���ģ�ֻ����ȡ����͸���ȡ��ſ�����ʾ��ɫ���������ؼ�Ҳһ����
	f.add(l3);
	
 final JComboBox<String> numberSelect = 
			new JComboBox<String>(
					new String[]{"-                      ��ѡ��                    -"});
final String[][] numbers = 
     new String[][]{
	    	{"1","2","3","4","5","6","7","8","9","10"},


	};
	
numberSelect.setBounds(410,240,240, 30);
	f.add(numberSelect);

	
	kinSelect.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int index = name1Select.getSelectedIndex();
			//ɾ��ԭ������Ϣ
			name1Select.removeAllItems();
			//��ȡ��ǰѡ�е���Ϣ
			String[] name1 = name1s[index];
			for(String c:name1){
				//��ÿһ����Ϣ��ӵ���ǰname1Select�� ��
				name1Select.addItem(c);
			}
		}
	});
	
	name1Select.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int index = numberSelect.getSelectedIndex();
			//ɾ��ԭ������Ϣ
			numberSelect.removeAllItems();
			//��ȡ��ǰѡ�е���Ϣ
			String[] number = numbers[index];
			for(String c:number){
				//��ÿһ����Ϣ��ӵ���ǰnumberSelect�� ��
				numberSelect.addItem(c);
			}
		}
	});
	

	JLabel l4 = new JLabel("����������Ϣ���ĸ�л����֧�֡�");
	l4.setFont(new Font("BOLD", Font.BOLD, 18));
	l4.setBounds(300,420,280,20);
	l4.setOpaque(false);//��ΪJLabel��Ĭ��͸���ģ�ֻ����ȡ����͸���ȡ��ſ�����ʾ��ɫ���������ؼ�Ҳһ����
	l4.setForeground(Color.black);
	f.add(l4);
	
	
	JButton btn2 = new JButton("ȡ��");
	btn2.setBounds(450,340,90,40);
	btn2.setContentAreaFilled(false); //��ť͸��
	f.add(btn2);
	btn2.setForeground(Color.red);
    btn2.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		// TODO Auto-generated method stub
//    		this.setVisible(false);
    		new Patient();
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
	JButton btn3 = new JButton("�ѹ��б�");
	btn3.setBounds(580,340,90,40);
	btn3.setContentAreaFilled(false); //��ť͸��
	f.add(btn3);
	btn3.setForeground(Color.black);
    btn3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		// TODO Auto-generated method stub
//    		this.setVisible(false);
    		new yaopininformation();
    		f.setVisible(true);
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
	//��Ʊ��ť
	final JButton btn1 = new JButton("ȷ��");
	btn1.setBounds(300,340,90,40);
	btn1.setContentAreaFilled(false); //��ť͸��
	//����Ʊ��ť�����ʱ����ȡ�����û��������Ϣ
	//���г־û���

    btn1.addMouseListener(new MouseAdapter() {
    	public void mouseClicked(MouseEvent e) {
    		
    	if(kinSelect.getSelectedItem().equals("����-")||
    
    			name1Select.getSelectedItem().equals("-����-")){
        	// TODO Auto-generated method stub
    		JOptionPane.showMessageDialog(l2, "��ҩ��Ϣδ����",null, JOptionPane.WARNING_MESSAGE);
 

   
    	}else{	
			String name = 
				(String)name1Select.getSelectedItem();
			String number = 
					(String)numberSelect.getSelectedItem();
		    int n1 = Integer.parseInt(number);
			int p=15* n1;
			int price =p;
			yaopin yaopin  = new yaopin(name,price,number);
			//����Ϣ��ӵ�������Ϣ�С�
		     
		     yaopinDB.yaopins.put(name,yaopin);
			//����Ϣͨ�� saveData(buyerDB,yaopins,"yaopins");����
			yaopinDB db = new yaopinDB();
			db.saveData(yaopinDB.yaopins, "yaopin");

 		JOptionPane.showMessageDialog(l2, "����ɹ�",null, JOptionPane.WARNING_MESSAGE);
 		

    		f.setVisible(true);}}}
    
    				);
    
	f.add(btn1);
	f.setVisible(true);
	
}
	public static void main(String[] args) {
		new Buy();
	}

}