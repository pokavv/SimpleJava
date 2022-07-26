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
		setTitle("이벤트 예제");
		
		p = new JPanel();
		b1 = new JButton("노랑색");
		b2 = new JButton("분홍색");
		
		b1.addActionListener(this);//이벤트메소드호출
		b2.addActionListener(this);//이벤트메소드호출
		
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