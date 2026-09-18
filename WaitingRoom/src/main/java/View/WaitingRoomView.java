package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WaitingRoomView extends JFrame{
    
    public JLabel lastCalledLabel, actualHour;
    public JButton btnWindow1, btnWindow2, btnWindow3, btnWindow4;
    JPanel panel;
    public JTable table;
    public DefaultTableModel tableModel;
    
    public WaitingRoomView(){
    
        createPanel();
        createLabel();
        createButtons();
        createTable();
        createWindow();
    }
    
    public void createWindow(){
    
        setSize(800, 600);
        setTitle("Waiting Room");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void createPanel(){
    
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void createLabel(){
    
        lastCalledLabel = new JLabel("AaAa");
        lastCalledLabel.setBounds(600, 400, 150, 30);
        panel.add(lastCalledLabel);
        
        actualHour = new JLabel("Actual Hour: ");
        actualHour.setBounds(350, 500, 150, 30);
        panel.add(actualHour);
    }
    
    private void createButtons(){
    
        btnWindow1 = new JButton("Window #1");
        btnWindow1.setBounds(550, 100, 150, 30);
        panel.add(btnWindow1);
        
        btnWindow2 = new JButton("Window #2");
        btnWindow2.setBounds(550, 100, 150, 30);
        panel.add(btnWindow2);
        
        btnWindow3 = new JButton("Window #3");
        btnWindow3.setBounds(550, 100, 150, 30);
        panel.add(btnWindow3);
        
        btnWindow4 = new JButton("Window #4");
        btnWindow4.setBounds(550, 100, 150, 30);
        panel.add(btnWindow4);
    }
    
    private void setVisibleButton(int option){
    
        switch(option){
        
            case 1:
                btnWindow1.setVisible(true);
                btnWindow2.setVisible(false);
                btnWindow3.setVisible(false);
                btnWindow4.setVisible(false);
                break;
                
            case 2:
                btnWindow1.setVisible(false);
                btnWindow2.setVisible(true);
                btnWindow3.setVisible(false);
                btnWindow4.setVisible(false);
                break;
                
            case 3:
                btnWindow1.setVisible(false);
                btnWindow2.setVisible(false);
                btnWindow3.setVisible(true);
                btnWindow4.setVisible(false);
                break;
                
            case 4:
                btnWindow1.setVisible(false);
                btnWindow2.setVisible(false);
                btnWindow3.setVisible(false);
                btnWindow4.setVisible(true);
                break;
        }
    }
    
    private void createTable(){
    
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Turn");
        tableModel.addColumn("Window");
        
        table = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 100, 200, 300);
        panel.add(scrollPane);
    }
}
