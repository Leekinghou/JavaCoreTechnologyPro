# Java多线程

## 两种方式
- java.lang.Thread
    - 线程继承Thread类，实现run方法
```java
public class Thread1 extends Thread{
	public void run(){
		System.out.println("hello");
	}
}
```

- java.lang.Runnable接口
    - 线程实现Runnable接口，实现run方法
```java
public class Thread1 extends Runable{
	public void run(){
		System.out.println("hello");
	}
}
```

- 启动
    - start方法，会自动以新进程调用run方法
    - 直接调用run方法，将变成串行执行
    - 同一个线程，多次start会报错，只执行第一个start方法
    - 多个线程启动，启动顺序是随机的
    - 线程无需关闭，只要其run方法执行结束，会自动关闭
    - main函数（线程）可能早于新线程结束，整个程序并不终止
    - 整个程序终止是等所有的线程都终止(包括main函数线程)

## Thread vs Runnable
- Thread占据了父类的名额，不如Runnable 方便
- Thread类实现Runnable
- Runnable启动时需要Thread类支持
- Runnable更容易实现多线程中的资源共享


## 实现多线程步骤
### 创建多线程程序的第一种方式：创建Thread类的子类
- java.Lang.Thread类
    - 是描述线程的类，我们想要实现多线程程序，就必须继承Thread类

步骤：
```
1. 创建一个Thread类的子类
2. 在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么？)
3. 创建Thread类的子类对象
4. 调用Thread类中的方法start方法，开启新的线程，执行run方法
```

- oid start()使该线程开始执行；Java虚拟机调用该线程的run方法。
- 结果是两个线程并发地运行；当前线程（main线程）和另一个线程（创建的新线程，执行其run方法）。
- 多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
- java程序属于抢占式调度，那个线程的优先级高，那个线程优先执行；同一个优先级，随机选择一个执行



## 获取线程名字的方法

1. 使用Thread类的getName()方法

2. 先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
    - static Thread currentThread()返回对当前正在执行的线程对象的引用。

```java  
Thread t = Thread.currentThread();
//system.out.println(t);//Thread[Thread-0,5,main]
String name = t.getName();
System.out.println(name);
```

```java
//获取主线程只能用这种方法，因为主线程没有继承Thread类，所以就没有getName()方法
System.out.println(Thread.currentThread().getName());
```

## 设置线程名字的方法
1. 使用`Thread类`中的方法setName(名字）
    - void setName(String name)改变线程名称，使之与参数name相同
2. 创建一个带参数的构造方法，参数传递线程的名称；`调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread)给子线程起一个名字`
    - Thread(string name)分配新的Thread对象。
```
new MyThread("hello").start();  
```

## Thread其他常用方法
- Thread.sleep(毫秒)
    - sleep自带异常，所以要写try-catch


## 结论
	- Runnable接口完成多线程更方便



































