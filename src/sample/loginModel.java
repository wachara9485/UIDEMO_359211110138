package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.SQLDataException;

public class loginModel {

    Connection connection;

    public loginModel() {
        try {
            this.connection = dbConnection.getConnection();
        } catch (SQLDataException e) {
            e.printStackTrace();
        }

        if (this.connection == null) {
            System.exit(status:1);

        }
    }//loginModel




    }
}//class
