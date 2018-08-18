package cn.alex.housekeeper.dao;

import cn.alex.housekeeper.tools.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import cn.alex.housekeeper.domain.AccountBill;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Alex
 * Date: 2018-08-18
 * Time: 21:21
 */
public class AccountBillDao {
    private QueryRunner db = new QueryRunner(JDBCUtils.getDataSource());

    public void add(AccountBill account){
        try {
            String sql = "INSERT  INTO house_keeper_list(cate_name,money,user,create_time,description) VALUES (?,?,?,?,?);";
            Object[] params = {account.getCate_name(),account.getMoney(),account.getUser(),account.getCreate_time(),account.getDescription()};
            db.update(sql,params);

        } catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("add failed");
        }
    }

    public int editById(AccountBill account){
        try {
            String sql = "update house_keeper_list set cate_name=?,money=?,user=?,create_time=?,description=? where id = ?;";
            Object[] params = {account.getCate_name(),account.getMoney(),account.getUser(),account.getCreate_time(),account.getDescription(),account.getId()};
            return db.update(sql,params);
        } catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("add failed");
        }
    }

    public  AccountBill selectById(int id){
        try {
            String sql = "select * from house_keeper_list where id = ?";

            AccountBill res = db.query(sql,new BeanHandler<>(AccountBill.class),id);
//            System.out.println(res);
//            System.out.println(res.getId());
//            System.out.println(res.getUser());
            return res;
        } catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("查询失败");
        }
    }

    public List<AccountBill> selectByName(String name){
        try {
            String sql = "select * from house_keeper_list where user = ?";

            List<AccountBill> res = db.query(sql,new BeanListHandler<>(AccountBill.class),name);
            return res;
        } catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("查询失败");
        }
    }

    public int deleteById(int id){
        try {
            String sql = "delete from house_keeper_list where id = ? ";
            int res = db.update(sql,id);
            return res;
        } catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("删除失败");
        }
    }
}
