package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;

public class C_DeleteUser extends JFrame {

	private JPanel contentPane;
    private JFrame PFrame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					C_DeleteUser frame = new C_DeleteUser();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}}});}

	/**
	 * Create the frame.
	 */
	public C_DeleteUser(JFrame PFrame) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(C_DeleteUser.class.getResource("/swing/trash.png")));
		setTitle("\u5220\u9664\u7528\u6237");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel L_Name_2 = new JLabel("\u8BF7\u9009\u62E9\u8981\u5220\u9664\u7684\u7528\u6237\uFF1A");
		L_Name_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		L_Name_2.setBounds(85, 68, 193, 30);
		contentPane.add(L_Name_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(281, 68, 79, 30);
		contentPane.add(comboBox);
		
		JButton B_delete = new JButton("\u5220\u9664");
		B_delete.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		B_delete.setBackground(Color.WHITE);
		B_delete.setBounds(174, 150, 110, 30);
		contentPane.add(B_delete);
	}
}
