package View;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sign_In extends JFrame{
    
    private JPanel panel;
    public JButton btnSignIn, btnSignUp;
    public JComboBox JCBProfile;
    public JTextField JTXTName, JTXTPassword;
    
    String[] profiles = {"Functionaries", "Clients"};
    
    public Sign_In(){
    
        createWindow();
        createPanel();
        setLabels();
        createButtons();
        createTextFields();
        createJComboBox();
    }
    
    private void createWindow(){
     
        setSize(800, 600);
        setTitle("Sing In");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    private void createPanel(){
    
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void setLabels(){
    
        JLabel sign_InLabel = new JLabel("Sign In");
        sign_InLabel.setFont(new Font("Times New Roman", 3, 19));
        sign_InLabel.setBounds(350, 50, 100, 30);
        panel.add(sign_InLabel);
        
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Times New Roman", 3, 19));
        usernameLabel.setBounds(270, 120, 120, 30);
        panel.add(usernameLabel);
        
        JLabel profileLabel = new JLabel("Profile:");
        profileLabel.setFont(new Font("Times New Roman", 3, 19));
        profileLabel.setBounds(270, 220, 120, 30);
        panel.add(profileLabel);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Times New Roman", 3, 19));
        passwordLabel.setBounds(270, 320, 120, 30);
        panel.add(passwordLabel);
    }
    
    private void createTextFields(){
    
        JTXTName = new JTextField();
        JTXTName.setBounds(370, 120, 120, 30);
        panel.add(JTXTName);
        
        JTXTPassword = new JTextField();
        JTXTPassword.setBounds(370, 320, 120, 30);
        panel.add(JTXTPassword);
    }
    
    private void createJComboBox(){
        
        JCBProfile = new JComboBox(profiles);
        JCBProfile.setBounds(350, 220, 120, 30);
        panel.add(JCBProfile);
    }
    
    private void createButtons(){
        
        btnSignIn = new JButton("Sign In");
        btnSignIn.setBounds(250, 400, 120, 30);
        panel.add(btnSignIn);
       
        btnSignUp = new JButton("Sign Up");
        btnSignUp.setBounds(370, 400, 120, 30);
        panel.add(btnSignUp);
    }
}
