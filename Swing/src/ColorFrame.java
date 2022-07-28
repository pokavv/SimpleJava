import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorFrame extends JFrame implements ActionListener{
	JButton b1,b2;
	JPanel p;
	public ColorFrame() {
		setSize(300,200);
		setTitle("�̺�Ʈ ����");
		
		p = new JPanel();
		b1 = new JButton("�����");
		b2 = new JButton("��ȫ��");
		
		b1.addActionListener(this);//�̺�Ʈ�޼ҵ�ȣ��
		b2.addActionListener(this);//�̺�Ʈ�޼ҵ�ȣ��
		
		p.add(b1);
		p.add(b2);
		add(p);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			p.setBackground(Color.YELLOW);
		}else if(e.getSource()==b2) {
			p.setBackground(Color.pink);
		}
	}
	
	public static void main(String[] args) {
		new ColorFrame();
	}
}