package View;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ClientTurnView extends JFrame{
    
    JPanel panel;
    public static int turnNumber = 0; 
    public JLabel turnLabel, numberLabel;
    public JButton BTNReturn;
    String position;
    
    public ClientTurnView(){
    
        createWindow();
        createPanel();
        createJLabel();
        createButton();
    }
    
    public void convertNumber(){position = String.valueOf(turnNumber); numberLabel.setText(position);}
    
    public void updateNumber(){turnNumber++;}
    
    private void createWindow(){
    
        setSize(250, 400);
        setTitle("Turn");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void createPanel(){
    
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void createJLabel(){
    
        turnLabel = new JLabel("Turn");
        turnLabel.setBounds(90, 100, 100, 30);
        turnLabel.setFont(new Font("Times New Roman", 2, 26));
        panel.add(turnLabel);
        
        numberLabel = new JLabel();
        numberLabel.setName(position);
        numberLabel.setBounds(100, 200, 70, 70);
        numberLabel.setFont(new Font("Times New Roman", 2, 30));
        panel.add(numberLabel);
    }
    
    private void createButton(){
    
        BTNReturn = new JButton("Return to Menu");
        BTNReturn.setBounds(0, 10, 170, 30);
        panel.add(BTNReturn);
    }
}