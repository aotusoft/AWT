package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;

public class C_ModifyUser extends JFrame {

	private JPanel contentPane;
    private JFrame PFrame;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					C_ChangePassword frame = new C_ChangePassword();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}}});}

	/**
	 * Create the frame.
	 */
	public C_ModifyUser(JFrame PFrame) {
		setTitle("\u4FEE\u6539\u5BC6\u7801");
		setIconImage(Toolkit.getDefaultToolkit().getImage(C_ModifyUser.class.getResource("/swing/key.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel L_Name = new JLabel("\u5F53\u524D\u7528\u6237\uFF1A");
		L_Name.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_Name.setBounds(71, 34, 129, 30);
		contentPane.add(L_Name);
		
		JLabel LL_Name_1 = new JLabel("");
		LL_Name_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		LL_Name_1.setBounds(211, 34, 129, 30);
		contentPane.add(LL_Name_1);
		
		JLabel L_Name_2_1 = new JLabel("\u8BF7\u8F93\u5165\u5BC6\u7801\uFF1A");
		L_Name_2_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_Name_2_1.setBounds(71, 86, 120, 30);
		contentPane.add(L_Name_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 86, 170, 30);
		contentPane.add(passwordField);
		
		JLabel L_Name_2 = new JLabel("\u8BF7\u8F93\u5165\u5BC6\u7801\uFF1A");
		L_Name_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_Name_2.setBounds(71, 143, 120, 30);
		contentPane.add(L_Name_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(201, 143, 170, 30);
		contentPane.add(passwordField_1);
		
		JButton B_modify = new JButton("\u4FEE\u6539");
		B_modify.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_modify.setBackground(Color.WHITE);
		B_modify.setBounds(168, 210, 110, 30);
		contentPane.add(B_modify);
	}
}
