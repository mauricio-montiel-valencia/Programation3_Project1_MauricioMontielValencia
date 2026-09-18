package Controller;

/*import View.Sign_In;
//import ClientMenu.Controller.ClientMenuController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SignInController {

    Sign_In view = new Sign_In();

    public SignInController() {
        giveFunctions();
    }

    private void giveFunctions() {

        view.btnSignIn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String profile = (String) view.JCBProfile.getSelectedItem();
                String username = view.JTXTName.getText();
                String password = view.JTXTPassword.getText();

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(view, " eed to fill all gaps" );
                    return;
                }

                if ("Clients".equals(profile)) {

                    if (username.equals("Client")
                            && password.equals("1234")) {

                        view.setVisible(false);

                        new ClientMenuController();

                    } else {

                        JOptionPane.showMessageDialog(view, "Invalid Username or Password.\nTest: client / 1234");
                    }

                } else if ("Functionaries".equals(profile)) {

                    if (username.equals("Functionary")
                            && password.equals("1234")) {

                        String win = JOptionPane.showInputDialog(view, "Window Number:", "Identify Window", JOptionPane.QUESTION_MESSAGE);

                        if (win == null) {
                            return;
                        }

                        view.setVisible(false);

                        new SolicitudeClientController();

                    } else {

                        JOptionPane.showMessageDialog(view,"Invalid Username or Password.\nTest: functionary / 1234");
                    }
                }
            }
        });

        view.btnSignUp.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(view, "The register has not implemented yet.");
            }
        });
    }
}*/

