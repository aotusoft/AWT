package manager;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InputTableClass {
    public void iT (Connection conn,String id, String item, String num) throws SQLException {
        PreparedStatement Pstmt = null;
        String sql = "select num from currentTable where name='" + item + "'";
        QueryRunner qr = new QueryRunner();
        Object obj = qr.query(conn, sql, new ScalarHandler<Object>("num"));
        if (obj == null) {
            sql = "insert into currentTable(bh,name,num) values(?,?,?)";
            System.out.println(num);
            Pstmt = conn.prepareStatement(sql);
            Pstmt.setString(1, id);
            Pstmt.setString(2, item);
            Pstmt.setString(3, num + "");
            Pstmt.execute();
            Pstmt.execute();
        } else {
            try {
                int old = Integer.parseInt(String.valueOf(obj));
                sql = "UPDATE currentTable set num=? where name=?";
                Pstmt = conn.prepareStatement(sql);
                Pstmt.setString(1, ((old + Integer.parseInt(num))+""));
                Pstmt.setString(2, item);
                Pstmt.execute();

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
