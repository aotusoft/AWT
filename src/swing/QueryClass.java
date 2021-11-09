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
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.eltima.components.ui.DatePicker;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;

public class QueryClass extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
    private JFrame PFrame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					QueryClass frame = new QueryClass();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public QueryClass(JFrame PFrame) {
		setTitle("\u67E5\u8BE2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 560);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu M_table = new JMenu("\u5E93\u64CD\u4F5C");
		M_table.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		menuBar.add(M_table);
		
		JMenuItem MI_input = new JMenuItem("\u5165\u5E93");
		MI_input.setIcon(new ImageIcon(QueryClass.class.getResource("/swing/arrow-alt-circle-right.png")));
		MI_input.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		M_table.add(MI_input);
		MI_input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                C_Input ci =new C_Input();
                ci.setVisible(true);
            }});
		
		JMenuItem MI_output = new JMenuItem("\u51FA\u5E93");
		MI_output.setIcon(new ImageIcon(QueryClass.class.getResource("/swing/arrow-alt-circle-left.png")));
		MI_output.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		M_table.add(MI_output);
		MI_output.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                C_Output co =new C_Output(QueryClass.this);
                co.setVisible(true);
            }});
		
		JMenu M_user = new JMenu("\u7528\u6237\u64CD\u4F5C");
		M_user.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		menuBar.add(M_user);
		M_user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
            	SubUserForm suf = new SubUserForm(QueryClass.this);
            	suf.setVisible(true);
            }});
		
		JMenuItem MI_query = new JMenuItem("\u7528\u6237\u67E5\u8BE2");
		MI_query.setIcon(new ImageIcon(QueryClass.class.getResource("/swing/user-circle.png")));
		MI_query.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		M_user.add(MI_query);
		MI_query.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
            	SubUserForm suf =new SubUserForm(QueryClass.this);
                suf.setVisible(true);
            }});
		
		JMenuItem MI_create = new JMenuItem("\u521B\u5EFA\u7528\u6237");
		MI_create.setIcon(new ImageIcon(QueryClass.class.getResource("/swing/user-add.png")));
		MI_create.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		M_user.add(MI_create);
		MI_create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                C_NewUser co =new C_NewUser(QueryClass.this);
                co.setVisible(true);
            }});
		
		JMenuItem MI_modify = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		MI_modify.setIcon(new ImageIcon(QueryClass.class.getResource("/swing/key.png")));
		MI_modify.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		M_user.add(MI_modify);
		MI_modify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                C_ModifyUser co =new C_ModifyUser(QueryClass.this);
                co.setVisible(true);
            }});
		
		JMenuItem MI_delete = new JMenuItem("\u5220\u9664\u7528\u6237");
		MI_delete.setIcon(new ImageIcon(QueryClass.class.getResource("/swing/trash.png")));
		MI_delete.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		M_user.add(MI_delete);
		MI_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
                C_DeleteUser co =new C_DeleteUser(QueryClass.this);
                co.setVisible(true);
            }});
		
		JMenu M_help = new JMenu("\u5E2E\u52A9");
		M_help.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		menuBar.add(M_help);
		
		JMenuItem MI_about = new JMenuItem("\u5173\u4E8E");
		MI_about.setIcon(new ImageIcon(QueryClass.class.getResource("/swing/info-circle.png")));
		MI_about.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		M_help.add(MI_about);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("\u5373\u65F6\u5E93\u5B58\u67E5\u8BE2");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
							.addGap(697))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(null);
		
		JButton B_input = new JButton("\u5165\u5E93");
		B_input.setBounds(591, 20, 110, 30);
		B_input.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_input.setBackground(Color.WHITE);
		panel.add(B_input);
		
		JButton B_output = new JButton("\u51FA\u5E93");
		B_output.setBounds(705, 20, 110, 30);
		B_output.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_output.setBackground(Color.WHITE);
		panel.add(B_output);
		
		JButton B_Query = new JButton("\u67E5\u8BE2");
		B_Query.setBounds(384, 20, 110, 30);
		B_Query.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		B_Query.setBackground(Color.WHITE);
		panel.add(B_Query);
		
		textField = new JTextField();
		textField.setBounds(156, 22, 204, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		DatePicker datePicker = new DatePicker();
		datePicker.setBounds(156, 20, 204, 33);
		panel.add(datePicker);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		comboBox.setBounds(39, 23, 107, 30);
		panel.add(comboBox);
		
		table = new JTable();
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
