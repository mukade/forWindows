import java.sql.*;

public class SqlTest_1{
  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
      //Class.forName("org.gjt.mm.mysql.Driver");
     System.out.println("Success loading Mysql Driver!");
    }
    catch (Exception e) {
      System.err.print("Error loading Mysql Driver!");
      e.printStackTrace();
    }
    try {
      Connection connect = DriverManager.getConnection(
          "jdbc:mysql://192.168.0.108:3306/test","root","123456");
           //连接UR为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

      System.out.println("Success connect Mysql server!");
      Statement stmt = connect.createStatement();
      ResultSet rs = stmt.executeQuery("select * from user");
                                                              //user 为你表的名称
while (rs.next()) {
        System.out.println(rs.getString("name1"));
      }
    }
    catch (Exception e) {
      System.err.print("get data error!");
      e.printStackTrace();
    }
  }
}