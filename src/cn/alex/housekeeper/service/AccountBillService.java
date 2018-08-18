package cn.alex.housekeeper.service;

import cn.alex.housekeeper.dao.AccountBillDao;
import cn.alex.housekeeper.domain.AccountBill;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Alex
 * Date: 2018-08-18
 * Time: 21:24
 */
public class AccountBillService {

    private AccountBillDao  accountBillDao = new AccountBillDao();

    public void add(AccountBill account){
        accountBillDao.add(account);
    }


    public AccountBill selectById(int id){
       return accountBillDao.selectById(id);
    }

    public List<AccountBill> selectByName(String name){
        return accountBillDao.selectByName(name);
    }

    public int deleteById(int id){
        return accountBillDao.deleteById(id);
    }

    public int editById(AccountBill account){
        return accountBillDao.editById(account);
    }
}
