package chapter_13_3;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class ConnMySql {
	public static void main(String arg[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			System.err.println("加载数据库驱动失败！"+e.getMessage());
		}
		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql", "root", "123456");
			Statement state=conn.createStatement();
			ResultSet res = state.executeQuery("select * From help_topic");
			while(res.next()){
				System.out.println(res.getInt(1)+"\t"+res.getString(2));
			}
		}catch(SQLException e){
			System.err.println("连接数据库失败！"+e.getMessage());
		}
		
	}
}
