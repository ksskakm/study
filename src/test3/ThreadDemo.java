package test3;

class MyThread extends Thread { //继承 Thread
    MyThread(String name){
        super(name);
    }
    //复写其中的 run 方法
    public void run(){
        for (int i=1;i<=20 ;i++ ){
            System.out.println(Thread.currentThread().getName()+",i="+i);
        }
    }
}
class ThreadDemo {
    public static void main(String[] args) {
//创建两个线程任务
        MyThread d = new MyThread("d");
        MyThread d2 = new MyThread("d2");
        d.start();//没有开启新线程, 在主线程调用 run 方法
        d2.start();//开启一个新线程，新线程调用 run 方法
    }
}
