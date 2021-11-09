package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class C_NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField;
    private JFrame PFrame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					C_NewUser frame = new C_NewUser();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}}});}

	/**
	 * Create the frame.
	 */
	public C_NewUser(JFrame PForm) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(C_NewUser.class.getResource("/swing/user-add.png")));
		setTitle("\u521B\u5EFA\u7528\u6237");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(70, 56, 139, 22);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(210, 67, 97, 23);
		contentPane.add(btnNewButton);

		
		JLabel L_Name = new JLabel("\u8BF7\u8F93\u5165\u7528\u6237\u540D\uFF1A");
		L_Name.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_Name.setBounds(70, 30, 129, 30);
		contentPane.add(L_Name);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(200, 30, 170, 30);
		contentPane.add(textField);
		textField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate (DocumentEvent documentEvent) {
				btnNewButton.setVisible(false);
			}

			@Override
			public void removeUpdate (DocumentEvent documentEvent) {
				label.setVisible(false);
			}

			@Override
			public void changedUpdate (DocumentEvent documentEvent) {

			}
		});

		
		JLabel L_Name_2 = new JLabel("\u8BF7\u8F93\u5165\u5BC6\u7801\uFF1A");
		L_Name_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_Name_2.setBounds(70, 149, 120, 30);
		contentPane.add(L_Name_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(200, 149, 170, 30);
		contentPane.add(passwordField_1);
		
		JLabel L_Name_2_1 = new JLabel("\u8BF7\u8F93\u5165\u5BC6\u7801\uFF1A");
		L_Name_2_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_Name_2_1.setBounds(70, 88, 120, 30);
		contentPane.add(L_Name_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 88, 170, 30);
		contentPane.add(passwordField);
		
		JButton B_ok = new JButton("\u521B\u5EFA");
		B_ok.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_ok.setBackground(Color.WHITE);
		B_ok.setBounds(167, 210, 110, 30);
		contentPane.add(B_ok);
	}

}
