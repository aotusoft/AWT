package manager;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OutputTableClass {
    public String oT (Connection conn, String item, String num) throws SQLException {
        PreparedStatement Pstmt = null;
        String sql = "select num from currentTable where name='" + item + "'";
        QueryRunner qr = new QueryRunner();
        Object obj = qr.query(conn, sql, new ScalarHandler<Object>("num"));
        String str = null;
        if (obj != null) {
            int old = Integer.parseInt(String.valueOf(obj));
            if (old >= (Integer.parseInt(num))) {
                sql = "UPDATE currentTable set num=? where name=?";
                Pstmt = conn.prepareStatement(sql);
                Pstmt.setString(1, ((old - Integer.parseInt(num)) + ""));
                Pstmt.setString(2, item);
                Pstmt.execute();
                str = "操作成功";
            } else {
                str = "物品数量不足";
            }
        } else {
            str = "不存在此物品";
        }
        return str;
    }
}
