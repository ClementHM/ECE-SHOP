package Controleur;
import java.sql.*;

public class Controleur {
    public static void main(String[] args) {
        Controleur C1= new Controleur();
        C1.lectureArticle();
    }
    void lectureArticle(){
        String sql = "SELECT article FROM Shopping";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shopping", "root", "");
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            while (rs.next()) {
                System.out.println(rs.getString("article"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
