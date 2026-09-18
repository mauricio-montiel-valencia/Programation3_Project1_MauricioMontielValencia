package Controller;

import DAO.DaoTurnRegister;
import View.ClientTurnView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

public class ClientTurnController {
    
    ClientTurnView CTView = new ClientTurnView();
    DaoTurnRegister daoTurn = new DaoTurnRegister();
    
    public ClientTurnController(){
    
        turnNumber();
        giveFunctions();
    }
    
    private void turnNumber(){

        CTView.updateNumber();
        if(CTView.turnNumber == 100){CTView.turnNumber = 0;}
        CTView.convertNumber();
        
        LocalDateTime generationDate_hour = LocalDateTime.now();
        //daoTurn.saveTurn(CTView.turnNumber, generationDate_hour);
    }
    
    private void giveFunctions(){
    
        CTView.BTNReturn.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
            
                CTView.setVisible(false);
                ClientMenuController CMController = new ClientMenuController();
            }
        });
    }
}