package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.eltima.components.ui.DatePicker;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class C_Input extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
    private JFrame PFrame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					C_Input frame = new C_Input();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}}});}

	/**
	 * Create the frame.
	 */
	public C_Input() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\u8363\u8000\\eclipse-workspace\\AWT\\src\\swing\\arrow-alt-circle-right.png"));
		setTitle("\u5165\u5E93");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5165\u5E93\u6D41\u6C34\u8868");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setLayout(null);
		
		JButton B_modify = new JButton("\u4FEE\u6539");
		B_modify.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_modify.setBackground(Color.WHITE);
		B_modify.setBounds(591, 20, 110, 30);
		panel.add(B_modify);
		
		JButton B_delete = new JButton("\u5220\u9664");
		B_delete.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_delete.setBackground(Color.WHITE);
		B_delete.setBounds(705, 20, 110, 30);
		panel.add(B_delete);
		
		JButton B_Query = new JButton("\u67E5\u8BE2");
		B_Query.setBounds(384, 20, 110, 30);
		B_Query.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_Query.setBackground(Color.WHITE);
		panel.add(B_Query);
		
		textField = new JTextField();
		textField.setBounds(156, 22, 204, 30);
		textField.setColumns(10);
		panel.add(textField);
		
		DatePicker datePicker = new DatePicker();
		datePicker.setBounds(156, 20, 204, 33);
		panel.add(datePicker);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(39, 23, 107, 30);
		comboBox.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel L_ID = new JLabel("\u7F16\u53F7\uFF1A");
		L_ID.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_ID.setBounds(30, 13, 55, 30);
		panel_1.add(L_ID);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(90, 13, 100, 30);
		panel_1.add(textField_1);
		
		JLabel L_Name = new JLabel("\u540D\u79F0\uFF1A");
		L_Name.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_Name.setBounds(230, 13, 55, 30);
		panel_1.add(L_Name);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(290, 13, 170, 30);
		panel_1.add(textField_2);
		
		JLabel L_Num = new JLabel("\u6570\u91CF\uFF1A");
		L_Num.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		L_Num.setBounds(524, 13, 55, 30);
		panel_1.add(L_Num);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(585, 13, 55, 30);
		panel_1.add(textField_3);
		
		JButton button = new JButton("\u5F55\u5165");
		button.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		button.setBounds(734, 13, 80, 30);
		panel_1.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 856, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
								.addGap(697))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 856, GroupLayout.PREFERRED_SIZE)
									.addComponent(panel_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 856, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		scrollPane.setColumnHeaderView(table);
		contentPane.setLayout(gl_contentPane);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
