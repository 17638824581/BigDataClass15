package com.xty.JDBCTest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {

        Connection conn = JdbcUtils.getConn();
        CallableStatement callableStatement = conn.prepareCall("select * from user;");


    }
}
