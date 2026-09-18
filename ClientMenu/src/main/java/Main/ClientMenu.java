    package Main;

    import Controller.ClientMenuController;
    import DataBase.Database_Connection;
    import View.ClientMenuView;
    import java.sql.Connection;

    public class ClientMenu {

        public static void main(String[] args) {

            ClientMenuController CMController = new ClientMenuController();
            Database_Connection database = new Database_Connection();
        }
    }
