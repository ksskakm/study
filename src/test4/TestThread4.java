package test4;

public class TestThread4 implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    private TestThread4(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 2;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name+" ");
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();
        Object e = new Object();
        TestThread4 pa = new TestThread4("A", e, a);
        TestThread4 pb = new TestThread4("B", a, b);
        TestThread4 pc = new TestThread4("C", b, c);
        TestThread4 pd = new TestThread4("D", c, d);
        TestThread4 pe = new TestThread4("E", d, e);

        new Thread(pa).start();
        Thread.sleep(3000);  //确保按顺序A、B、C执行，sleep使当前线程睡眠一段时间
        new Thread(pb).start();
        Thread.sleep(3000);
        new Thread(pc).start();
        Thread.sleep(3000);
        new Thread(pd).start();
        Thread.sleep(3000);
        new Thread(pe).start();
    }
}