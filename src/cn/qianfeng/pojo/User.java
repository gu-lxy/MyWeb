package cn.qianfeng.pojo;

/**
 * 1. 封装 保证代码的安全性
 *      1.1 public  改为  private
 *      1.2 给属性提供  get/set方法
 *
 * 练习：自定义一个类 设置3个属性，进行封装
 *
 * 2. 继承 可以直接继承其他类写好的成员
 * extends 继承关键字  只用于 class
 * 继承有超类/根类 class Object,你不继承任何类，默认继承Object
 * 继承只能单继承，但是可以多重继承
 *
 * 3.多态  一种类型 多种形态
 * 目的： 可以屏蔽不同子类实现差异
 *  2.性能更优
 *  3.写法
 *  
 */
//类首字符大写
public class User extends Person{
    //属性
    private long id;
    private String interName;
    private int userAge;

    //构造器
    public User(){}
    //方法
    public void Method(){
        System.out.println("普通方法");
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getInterName() {
        return interName;
    }

    public void setInterName(String interName) {
        this.interName = interName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {

        this.userAge = userAge;
    }
}
