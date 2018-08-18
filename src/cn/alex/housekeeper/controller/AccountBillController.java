package cn.alex.housekeeper.controller;

import cn.alex.housekeeper.domain.AccountBill;
import cn.alex.housekeeper.service.AccountBillService;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Created By Alex
 * Date: 2018-08-18
 * Time: 21:28
 */
public class AccountBillController {

    private AccountBillService accountBillService = new AccountBillService();

    public void add(AccountBill account){
        accountBillService.add(account);
    }

    public AccountBill selectById(int id){
        return accountBillService.selectById(id);
    }

    public List<AccountBill> selectByName(String name){
        return accountBillService.selectByName(name);
    }

    public int deleteById(int id){
        return accountBillService.deleteById(id);
    }

    public int editById(AccountBill account){
        return accountBillService.editById(account);
    }
}
