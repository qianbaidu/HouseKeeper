package cn.alex.housekeeper.domain;

/**
 * Created with IntelliJ IDEA
 * Created By Alex
 * Date: 2018-08-18
 * Time: 18:37
 */
public class AccountBill {

    private int id;
    private String cate_name;
    private double money;
    private String user;
    private String create_time;
    private String description;


    public AccountBill(int id, String cate_name, double money, String user, String create_time, String description) {
        this.id = id;
        this.cate_name = cate_name;
        this.money = money;
        this.user = user;
        this.create_time = create_time;
        this.description = description;
    }

    public AccountBill() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        String info = "id : %10d    cate_name : %20s    money : %20f    create_time : %20s  description : %s  ";
        return String.format(info, getId(),getCate_name(),getMoney(),getCreate_time(),getDescription());
    }

}
