package View;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SolicitudeClientView extends JFrame{
    
    JPanel panel;
    public JLabel ticketLabel;
    public JButton BTNSolicitudeClient, BTNFinalizeAttention;
    public static int turnNumber = 0;
    String position;
    
    public void transformNumber(){position = String.valueOf(turnNumber); disponibility(false);}    
    public void updateNumber(){turnNumber++;}

    
    public SolicitudeClientView(){
        
        createPanel();
        createLabels();
        createButton(); 
        createWindow();
    }
    
    private void createWindow(){
    
        setSize(400, 400);
        setTitle("Solicitude Client");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void createPanel(){
     
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void createLabels(){
    
        JLabel turnLabel = new JLabel("Turn");
        turnLabel.setFont(new Font("Times New Roman", 3, 32));
        turnLabel.setBounds(150, 100, 100, 30);
        panel.add(turnLabel);
        
        position = String.valueOf(turnNumber);
        ticketLabel = new JLabel(position);
        ticketLabel.setFont(new Font("Times New Roman", 2, 28));
        ticketLabel.setBounds(175, 200, 100, 30);
        panel.add(ticketLabel);
    }
    
    private void createButton(){
        
        BTNFinalizeAttention = new JButton("Finalize Attention");
        BTNFinalizeAttention.setBounds(100, 25, 200, 30);
        panel.add(BTNFinalizeAttention);
    
        BTNSolicitudeClient = new JButton("Solicitude Client");
        BTNSolicitudeClient.setBounds(100, 300, 200, 30);
        panel.add(BTNSolicitudeClient);
    }
    
    private void disponibility(boolean flag){
    
        if(flag){ticketLabel.setText("N/A :(");}
        else{ticketLabel.setText(position);}
    }
}

