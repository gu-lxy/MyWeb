package cn.qianfeng.pojo;

public class Person {
    public void money(){
        System.out.println("我有500万");
    }
    public void foodDog(Dog dog){
        dog.eat();
    }

    public static class ZhangAo extends Dog {
        public void eat(){
            System.out.println("吃嘎嘎");
        }
    }
}
