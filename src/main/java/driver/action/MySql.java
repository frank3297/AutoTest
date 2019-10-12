package driver.action;

import lombok.extern.slf4j.Slf4j;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
@Slf4j
public class MySql {
	public static ResultSet dataBase(String sql,String sqlobject,String target) throws ClassNotFoundException, SQLException {
		//String sql数据库查询sql
		//String sqlobject  需要的数据库字段
		//String target需要比对的值
		java.sql.Connection conn;
//		String driver = "com.mysql.jdbc.Driver";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://10.20.22.11:3306/systembasedb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
		String user = "enote";
		String password = "123";
		ResultSet rs = null;

		//加载驱动程序
		Class.forName(driver);
		//连接数据库
		conn = DriverManager.getConnection(url,user,password);
		java.sql.Statement statement = conn.createStatement();
		rs = statement.executeQuery(sql);

		while(rs.next()){

			String name = rs.getString(sqlobject);
			log.info("通过{}查到结果：{}",sqlobject,name);
			if(target.equals(name)){
				log.info("查询到的结果存在:{}",target);
				break;
			}else{
				log.info("未匹配到数据");
			}
		}

		rs.close();
		conn.close();
		return rs;
	}
	
	

}
