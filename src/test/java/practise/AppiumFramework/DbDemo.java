package practise.AppiumFramework;

import practise.AppiumFramework.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DbDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // connect the DB
        DBUtils.createConnection();
        System.out.println("creating database connection");

        String sqlQuery = "SELECT * FROM demo.credentials WHERE scenario = 'zerobalancedcard';";
        List<Object>  queryResult = DBUtils.getColumnData(sqlQuery, "username");
        System.out.println("queryResult.getString(\"username\") = " + queryResult);

    }



}
