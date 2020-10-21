package cn.ruishengyy.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BaseDao {
    public Connection getConnection () {
        Connection conn = null;
        try { //获取与逻辑名相关联的数据源对象
            Context ctx = new InitialContext();
            DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/news");
            conn = ds.getConnection();
        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (NamingException namingException) {
            namingException.printStackTrace();
        }
        return conn;
    }

    public void closeAll(ResultSet rs, Statement stat, Connection conn){
        try {
            if(rs != null)
                rs.close();
            if(stat != null)
                stat.close();
            if(conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
