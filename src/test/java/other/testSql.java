package other;

import driver.action.MySql;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class testSql {

    @Test
    public void testsql() throws SQLException, ClassNotFoundException {
        String sql = "select username from t_user where phone = '17721372329'" ;
        String object = "username" ;
        String target = "frank" ;

        MySql.dataBase(sql,object,target);


    }
}
