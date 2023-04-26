package CourseJavaSE.GUI_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingGUI extends JFrame implements ActionListener {

    JFrame loginFrame;
    JLabel lblUserName,lblPassword;
    JTextField txtUserName;
    JPasswordField txtPassword;
    JCheckBox chkRemember;
    JComboBox comboCities;
    JButton btnLogin;

    public SwingGUI() throws HeadlessException {
        loginFrame = new JFrame("login Form");
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        int wScreen= (int) screenSize.getWidth();
        int hScreen=(int) screenSize.getHeight();
        int weight=300;
        int height=200;
        loginFrame.setBounds(wScreen/2-weight/2,hScreen/2-height/2,weight,height);
        loginFrame.setIconImage(Toolkit.getDefaultToolkit().createImage("images/icons/icon1.png"));
        //--------Create label----------//
        //user
        lblUserName = new JLabel("User Name");
        lblUserName.setBounds(20,10,150,20);
        lblUserName.setFont(new Font(Font.DIALOG,Font.BOLD,12));
        lblUserName.setForeground(new Color(239, 84, 84));
        txtUserName = new JTextField();
        txtUserName.setBounds(100,10,150,20);
        //password
        lblPassword = new JLabel("Password");
        lblPassword.setBounds(20,40,150,20);
        lblPassword.setFont(new Font(Font.DIALOG,Font.BOLD,12));
        lblPassword.setForeground(new Color(239, 84, 84));
        txtPassword = new JPasswordField();
        txtPassword.setBounds(100,40,150,20);
        //----------check box-----------//
        chkRemember = new JCheckBox("Remember");
        chkRemember.setBounds(100,60,100,20);
        //---------Combo cities-------//
        String[] cities={"Tehran","Isfahan","Shiraz","Hamedan","Kerman","khorasan"};
        comboCities = new JComboBox(cities);
        comboCities.setBounds(100,90,100,20);
        comboCities.setFont(new Font(Font.MONOSPACED,Font.BOLD,12));
        //--------button Login------//
        btnLogin = new JButton("LOGIN");
        btnLogin.setBounds(100,120,100,30);
        btnLogin.setBackground(new Color(177, 206, 236));
        btnLogin.addActionListener(this);

        loginFrame.add(btnLogin);
        loginFrame.add(comboCities);
        loginFrame.add(chkRemember);
        loginFrame.add(txtPassword);
        loginFrame.add(lblPassword);
        loginFrame.add(txtUserName);
        loginFrame.add(lblUserName);
        loginFrame.setLayout(null);
        loginFrame.setResizable(false);
        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();

        if (obj.equals(btnLogin)){
            String userName=txtUserName.getText();
            String password=new String(txtPassword.getPassword());
            if (userName.equals("mohsen") && password.equals("123")){

                String[] title= {"id","name","family","age"};
                String[][] data={
                        {"1","mohsen","alikhani","36"},
                        {"2","reza","mahjob","30"},
                        {"3","behnam","molaei","25"},
                        {"4","sima","bakhshesh","40"},
                        {"5","darab","siahkal","26"},
                        {"6","kamyab","tavakoli","20"},
                        {"7","reza","tavasoli","22"},
                        {"8","sima","bakhshesh","40"},
                        {"9","darab","siahkal","26"},
                        {"10","kamyab","tavakoli","20"},
                        {"11","reza","tavasol","22"},
                        {"12","darab","siahkal","26"},
                        {"13","kamyab","tavakoli","20"},
                        {"14","reza","tavasol","22"},
                        {"15","sima","bakhshesh","40"},
                };
                JTable table=new JTable(data,title);
                JScrollPane scrollPane=new JScrollPane(table);
                myCanvas canv=new myCanvas("images/pic1.png",0,0,200,200);
//                newFrame newFrame1=new newFrame("user", 0, 0, 400, 200, JFrame.DISPOSE_ON_CLOSE, null);
//                newFrame newFrame2=new newFrame("Table User",0,0,400,200,JFrame.DISPOSE_ON_CLOSE,new GridLayout());
                newFrame newFrame3=new newFrame("pic User",0,0,200,300,JFrame.DISPOSE_ON_CLOSE,new GridLayout());
//                newFrame2.addFrame(scrollPane);
                newFrame3.addConvas(canv);
            }else{
                String msg="incorrect your user name or password";
                JOptionPane.showMessageDialog(new JFrame(),msg,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    class newFrame{
        JFrame newFrames;

        public newFrame(String title,
                        int x,int y,int weight,int height,
                        int closeOn,LayoutManager layoutManager) {
            newFrames = new JFrame(title);
            newFrames.setBounds(x,y,weight,height);
            newFrames.setLayout(layoutManager);
            newFrames.setDefaultCloseOperation(closeOn);
            newFrames.setVisible(true);
        }

        public void addFrame(JComponent component){
            newFrames.add(component);
        }

        public void addConvas(Canvas canvas){
            newFrames.add(canvas);
        }
    }
}
