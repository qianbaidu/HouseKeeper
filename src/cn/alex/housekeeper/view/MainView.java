package cn.alex.housekeeper.view;

import cn.alex.housekeeper.controller.AccountBillController;
import cn.alex.housekeeper.domain.AccountBill;

import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Created By Alex
 * Date: 2018-08-18
 * Time: 21:25
 */
public class MainView {

    private AccountBillController accountBillController = new AccountBillController();

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------------管家婆家庭记账软件---------------");
            System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
            System.out.println("请输入要操作的功能序号[1-5]:");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    //add
                    add();
                    break;
                case 2:
                    //edit
                    edit();
                    break;
                case 3:
                    //del
                    delete();
                    break;
                case 4:
                    //query
                    query();
                    break;
                case 5:
                    // exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    public void edit(){
        System.out.println("请输入要修改的ID:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println("输入分类名称");
        String cate_name = sc.next();
        System.out.println("输入金额");
        double money = sc.nextDouble();
        System.out.println("输入账户");
        String account = sc.next();
        System.out.println("输入日期：格式XXXX-XX-xx");
        String create_time = sc.next();
        System.out.println("输入具体描述");
        String description = sc.next();

        AccountBill accountBill = new AccountBill(id,cate_name,money,account,create_time,description);
        int res = accountBillController.editById(accountBill);
        System.out.println(res);
        if (res == 1){
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败！");
        }
    }

    public void query(){
        System.out.println("请选择查询方式：1、按ID查询；2、按名称查询");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input){
            case 1:
                selectById();
                break;
            case 2:
                selectByName();
                break;
            default:
                System.out.println("暂未提供该查询方法");
                break;
        }
    }

    public void selectByName(){
        System.out.println("请输入要查询的账户名:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        List<AccountBill> res = accountBillController.selectByName(name);
        if (res == null || res.size() < 1){
            System.out.println("查询信息不存在");
        } else {
            for(int i = 0 ;i<res.size();i++){
                System.out.println(res.get(i));
            }
        }
    }

    public  void selectById(){
        System.out.println("请输入要查询的ID:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        AccountBill res = accountBillController.selectById(id);
        if (res == null){
            System.out.println("查询信息不存在");
        } else {
            System.out.println(res);
        }
    }

    public void add(){
        System.out.println("选择的添加账务功能，请输入以下内容");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分类名称");
        String cate_name = sc.next();
        System.out.println("输入金额");
        double money = sc.nextDouble();
        System.out.println("输入账户");
        String account = sc.next();
        System.out.println("输入日期：格式XXXX-XX-xx");
        String create_time = sc.next();
        System.out.println("输入具体描述");
        String description = sc.next();

        AccountBill accountBill = new AccountBill(0,cate_name,money,account,create_time,description);
        accountBillController.add(accountBill);
        System.out.println("----添加成功");
    }

    public void delete(){
        System.out.println("请输入要删除的条目ID:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int res = accountBillController.deleteById(id);
        System.out.println(res);
        if (res == 1){
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败！条目不存在或已被删除");
        }
    }
}
