import javax.swing.*;

public class Pizza extends JFrame{
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	JButton button1 = new JButton("�޺�����");
	JButton button2 = new JButton("������������");
	JButton button3 = new JButton("�Ұ������");
	
	JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
	JLabel label2 = new JLabel("����");
	
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