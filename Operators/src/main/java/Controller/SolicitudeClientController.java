package Controller;

import View.SolicitudeClientView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class SolicitudeClientController {
    
    SolicitudeClientView SCView = new SolicitudeClientView();
    
    public SolicitudeClientController(){
    
        turnNumber();
        giveFunctions();
    }
    
    private void turnNumber(){

        
    }
    
    private void giveFunctions(){
    
        SCView.BTNSolicitudeClient.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
            
                SCView.updateNumber();
                if(SCView.turnNumber == 100){SCView.turnNumber = 0;}
                SCView.transformNumber();
            }
        });   
    }
}