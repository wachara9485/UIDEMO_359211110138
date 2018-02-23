package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
    private static final String SQCONN = ";jdbc:sqlite:school.sqlite";

    public static Connection getConnection(){
        try {
            class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }


    }










}//class
