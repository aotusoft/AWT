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

public class C_Output extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
    private JFrame PFrame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					C_Output frame = new C_Output();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}}});}

	/**
	 * Create the frame.
	 */
	public C_Output(JFrame PFrame) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(C_Output.class.getResource("/swing/arrow-alt-circle-left.png")));
		setTitle("\u51FA\u5E93");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("\u51FA\u5E93\u6D41\u6C34\u8868");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
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
		B_Query.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_Query.setBackground(Color.WHITE);
		B_Query.setBounds(384, 20, 110, 30);
		panel.add(B_Query);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(156, 22, 204, 30);
		panel.add(textField);
		
		DatePicker datePicker = new DatePicker();
		datePicker.setBounds(156, 20, 204, 33);
		panel.add(datePicker);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		comboBox.setBounds(39, 23, 107, 30);
		panel.add(comboBox);
		panel_1.setLayout(null);
		
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
		L_Num.setBounds(524, 13, 55, 30);
		L_Num.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		panel_1.add(L_Num);
		
		textField_3 = new JTextField();
		textField_3.setBounds(585, 13, 55, 30);
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JButton button = new JButton("\u5F55\u5165");
		button.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		button.setBounds(736, 13, 80, 30);
		panel_1.add(button);
		
		table = new JTable();
		table.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
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
		scrollPane.setViewportView(table);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 856, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 856, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 856, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
		);
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
