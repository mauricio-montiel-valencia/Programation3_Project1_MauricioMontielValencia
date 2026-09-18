package View;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientMenuView extends JFrame{
    
    JPanel panel;
    public JButton BTNGeneralInformation, BTNFormalities, BTNPayments, BTNPreferentialCare;
    
    public ClientMenuView(){
    
        createWindow();
        createPanel();
        createLabel();
        creteButtons();
    }
    
    private void createWindow(){
    
        setSize(600, 400);
        setTitle("Menu");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void createPanel(){
    
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void createLabel(){
    
        JLabel menuLabel = new JLabel("Menu");
        menuLabel.setFont(new Font("Times New Roman", 3, 27));
        menuLabel.setBounds(250, 100, 100, 30);
        panel.add(menuLabel);
    }
    
    private void creteButtons(){
    
        BTNGeneralInformation = new JButton("General Information");
        BTNGeneralInformation.setBounds(210, 150, 150, 30);
        panel.add(BTNGeneralInformation);
        
        BTNFormalities = new JButton("Formalities");
        BTNFormalities.setBounds(210, 180, 150, 30);
        panel.add(BTNFormalities);
        
        BTNPayments = new JButton("Payments");
        BTNPayments.setBounds(210, 210, 150, 30);
        panel.add(BTNPayments);
        
        BTNPreferentialCare = new JButton("Preferential Care");
        BTNPreferentialCare.setBounds(210, 240, 150, 30);
        panel.add(BTNPreferentialCare);
    }
}
