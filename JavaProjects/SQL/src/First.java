import java.sql.*;
import java.util.Properties;

public class First {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/customers";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "root");

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, info);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from customers");

            while(rs.next()) {
                System.out.println(rs.getString("firstname"));
            }

//            if (conn != null) {
//                System.out.println("Connected.");
//            }
            st.close();
            rs.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}