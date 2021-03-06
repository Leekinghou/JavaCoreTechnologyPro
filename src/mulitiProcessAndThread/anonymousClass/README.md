# 匿名内部类

## 什么是？
- 匿名：没有名字
- 内部类：写在其他类内部的类

## 作用
- 简化代码
- 把子类继承父类，重写父类方法，创建子类对象合一步完成
- 把实现类、实现类接口，重写接口中的方法，创建实现类对象合成一步完成

## 最终产物
- 子类/实现类对象，而这个类没有名字

## 使用格式
- new 父类/接口(){
  重写父类/接口中的方法
  }

```java
public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new myThread().start();

        new Thread() {
            //重写run方法
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "->" + "111");
                }
            }
        }.start();
    }
}
```

```java
package mulitiProcessAndThread.anonymousClass;

import mulitiProcessAndThread.RunnableCode.RunnableImple;

public class Demo01InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        //new myThread().start();

        new Thread() {
            //重写run方法
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + "111");
                }
            }
        }.start();

        //线程的接口Runnable
        //RunnableImple r = new RunnableImple(); //多态
        Runnable r = new Runnable() {
            //重写run方法
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + "222");
                }
            }
        };
        new Thread(r).start();

        //简化接口方式
        new Thread(
                new Runnable() {
                    //重写run方法
                    @Override
                    public void run(){
                        for (int i = 0; i < 20; i++) {
                            System.out.println(Thread.currentThread().getName() + "---->" + "333");
                        }
                    }
                }
        ).start();
    }
}
```



  