package swing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class JFs extends JFrame{

    private JPanel contentPane;
    private JTextField Tuser;
    private JPasswordField TpW;
    private String user = "1";
    private String password = "1";



    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFs frame = new JFs();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JFs() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("ͨ�ÿ�����ϵͳ");
        lblNewLabel.setFont(new Font("΢���ź�", Font.BOLD, 22));
        lblNewLabel.setBounds(135, 10, 239, 38);
        contentPane.add(lblNewLabel);

        //JLabel �û���
        JLabel userName = new JLabel("\u7528\u6237");
        userName.setIcon(new ImageIcon("C:\\Users\\\u8363\u8000\\eclipse-workspace\\AWT\\src\\swing\\user.png"));
        userName.setFont(new Font("΢���ź�", Font.PLAIN, 18));
        userName.setBounds(105, 58, 83, 47);
        contentPane.add(userName);
        Tuser = new JTextField();
        Tuser.setBounds(198, 71, 176, 28);
        contentPane.add(Tuser);
        Tuser.setColumns(10);
        Tuser.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped (KeyEvent keyEvent) {}

            @Override
            public void keyPressed (KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER){
                    TpW.requestFocus();
                }
            }
            @Override
            public void keyReleased (KeyEvent keyEvent) {}});

        //JLabel ����
        JLabel passWord = new JLabel("����");
        passWord.setIcon(new ImageIcon("C:\\Users\\\u8363\u8000\\eclipse-workspace\\AWT\\src\\swing\\lock.png"));
//        passWord.setIcon(new ImageIcon("C:\\Users\\\u8363\u8000\\Desktop\\QQ\u622A\u56FE20211106162028.png"));
        passWord.setFont(new Font("΢���ź�", Font.PLAIN, 18));
        passWord.setBounds(105, 113, 83, 47);
        contentPane.add(passWord);
        TpW = new JPasswordField();
        TpW.setBounds(198, 126, 176, 28);
        contentPane.add(TpW);

        //JButton ��¼��ť
        JButton register = new JButton("��¼");
        register.setBackground(Color.WHITE);
        register.setForeground(Color.BLACK);
        register.setFont(new Font("΢���ź�", Font.PLAIN, 18));
        register.setIcon(null);
        register.setBounds(154, 191, 142, 39);
        contentPane.add(register);
        register.addActionListener(new ActionListener(){ // ��� ���� ����
            public void actionPerformed(ActionEvent e) {
                if((Tuser.getText().equals(user))&&(TpW.getText().equals(password))) {
                    JOptionPane.showMessageDialog(null, "��½�ɹ�","��Ϣ��ʾ",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "�û������������","��Ϣ��ʾ",JOptionPane.ERROR_MESSAGE);
                    TpW.setText("");//��ձ༭��
                    Tuser.requestFocus();//�༭�������뽹��
                }}});

        //JButton ע�ᰴť
        JButton signup = new JButton("ע���˺�");
        signup.setBackground(Color.WHITE);
        signup.setForeground(Color.BLACK);
        signup.setFont(new Font("΢���ź�", Font.PLAIN, 12));
        signup.setBounds(0, 239, 97, 23);
        contentPane.add(signup);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\\u8363\u8000\\eclipse-workspace\\AWT\\src\\swing\\sidebar.png"));
        lblNewLabel_1.setBounds(381, 209, 40, 39);
        contentPane.add(lblNewLabel_1);
        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent actionEvent) {
//                SubUserForm suf=new SubUserForm();
                SubUserForm suf=new SubUserForm(JFs.this);
                suf.setVisible(true);
            }});
    }
}
