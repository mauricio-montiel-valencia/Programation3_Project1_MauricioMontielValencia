package Controller;

import View.ClientMenuView;
import View.ClientTurnView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMenuController {
    
    ClientMenuView CMView = new ClientMenuView();
    
    public ClientMenuController(){
    
        giveFunctions();
    }
    
    private void giveFunctions(){
    
        CMView.BTNFormalities.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
            
                CMView.setVisible(false);//Tal vez Colocarlo al Inicio si no Hay Cambios Radicales en el Futuro.
                ClientTurnView CTView = new ClientTurnView();
                ClientTurnController CTController = new ClientTurnController();
            }
        });
        
        CMView.BTNGeneralInformation.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
            
                CMView.setVisible(false);
                ClientTurnView CTView = new ClientTurnView();
                ClientTurnController CTController = new ClientTurnController();                
            }
        });
        
        CMView.BTNPayments.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
            
                CMView.setVisible(false);                
                ClientTurnView CTView = new ClientTurnView();
                ClientTurnController CTController = new ClientTurnController();
            }
        });
        
        CMView.BTNPreferentialCare.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
            
                CMView.setVisible(false);
                ClientTurnView CTView = new ClientTurnView();
                ClientTurnController CTController = new ClientTurnController();
            }
        });      
    }
}