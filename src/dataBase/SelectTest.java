package dataBase;
import java.sql.*;

public class SelectTest {
    public static void main(String[] args) throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("注册驱动成功");
        }catch (ClassNotFoundException e){
            System.out.println("注册驱动失败");
            e.printStackTrace();
            return;
        }

        String url = "jdbc:mysql://localhost:3306/javatest1";
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url,"root","MySwan0716");
            Statement stmt = conn.createStatement();
            System.out.println("创建Statement成功！");
            ResultSet rs = stmt.executeQuery("select book_id,book_name,price from bookinfo order by book_id");

        }catch (SQLException e1){
            e1.printStackTrace();
        }finally {
            try{
                if(null != conn){
                    conn.close();
                }
            }catch (SQLException e2){
                e2.printStackTrace();
            }
        }
    }
}
