package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
   public static Connection getConnection() {
      Connection connection = null;
      try {
//         연결에 필요한 정보
         String userName = "hr";
         String password = "hr";
         String url = "jdbc:oracle:thin:@localhost:1521:XE";
         
//         드라이버를 메모리에 할당
         Class.forName("oracle.jdbc.OracleDriver");
         
//         정보를 전달하여 연결 객체 가져오기
         connection = DriverManager.getConnection(url, userName, password);
         
         //System.out.println("연결 성공");
         
      } catch (ClassNotFoundException e) { //Class.forName에 대한 예외
         e.printStackTrace();
         System.out.println("드라이버 로딩 실패");
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("연결 실패");
      } catch (Exception e) {
         e.printStackTrace();
         System.out.println("알 수 없는 오류");
      }
      return connection;
   }   
   
   // select할 때 사용할 객체 close
   public static void close(Connection con, PreparedStatement pstm, ResultSet rs) throws SQLException {
			if(rs != null) { // 열려있다면 닫아라!
				rs.close();
			}
			if(pstm != null) { // 열려있다면 닫아라!
				pstm.close();
			}
			if(con != null) { // 열려있다면 닫아라!
				con.close();
			}
   }
   
   // select제외 사용하는 객체 close
   public static void close(Connection con, PreparedStatement pstm) throws SQLException {
		if(pstm != null) { // 열려있다면 닫아라!
			pstm.close();
		}
		if(con != null) { // 열려있다면 닫아라!
			con.close();
		}
}
}
