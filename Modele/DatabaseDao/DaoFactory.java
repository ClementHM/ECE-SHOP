package Modele.DatabaseDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//on simplifie la connexion à la bdd
public class DaoFactory{

    private String url;
    private String username;
    private String password;
    public DaoFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        }

        public static DaoFactory getInstance() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {

            }

            DaoFactory instance = new DaoFactory(
                    "jdbc:mysql://localhost:3306/shopping",  "root","abcdef" );
            return instance;
        }

        public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, username, password);
        }



    }

