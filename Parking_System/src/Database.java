
import java.sql.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Database {

    public static void main(String[] args) {
//        private  String API_URL =
//        HttpClient client  = HttpClient.newHttpClient();
//        HttpRequest request= HttpRequest.newBuilder().GET().uri().build();

        try {
//            loading the driver.
            Class.forName("com.mysql.jdbc.Driver");

//            establish a connection.
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/parking2021", "root", "");

//            create statement object.
            Statement stmt = connection.createStatement();

            Person p = new Administrator();
            String userName = p.getUserName();
            String pass = p.getPassword();

            ResultSet rs = stmt.executeQuery("Select from * Person where username="+ userName +" and password=" + pass);
            while (rs.next()) {
                System.out.println(rs.getString(4) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

//    protected void doPost(HttpRequest request, HttpRequest response) {
//        String username = request.
//        String password = request.getParameter("password");
//
//    }
    }
