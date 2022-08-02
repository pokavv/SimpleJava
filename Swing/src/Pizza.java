import javax.swing.*;

public class Pizza extends JFrame{
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	JButton button1 = new JButton("콤보피자");
	JButton button2 = new JButton("포테이토피자");
	JButton button3 = new JButton("불고기피자");
	
	JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
	JLabel label2 = new JLabel("개수");
	
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);
	
	public Pizza() {
		setTitle("Pizza Order");
		setSize(600, 150);
		setDefaultCloseOperation(3);
		
		panel2.add(label1);
		panel3.add(button1);
		panel3.add(button2);
		panel3.add(button3);
		
		panel3.add(label2);
		panel3.add(field1);
		
		panel1.add(panel2);
		panel1.add(panel3);
		add(panel1);
		setVisible(true);
	}
	public static void main(String[] args) {
		Pizza order = new Pizza();
	}
}