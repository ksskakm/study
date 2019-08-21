package test4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
    public static void main(String[] args) {
//        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(new Thread1());
        executor.submit(new Thread2());
        executor.submit(new Thread3());
        executor.submit(new Thread4());
        executor.submit(new Thread5());
        executor.shutdown();
    }


    public static int random(){
        return  (int)(1+Math.random()*(4-1+1))*1000;
    }

    public static class Thread1 implements Runnable{
        @Override
        public void run() {
            try {
                //随机睡眠1-4秒
                int time = random();
                Thread.sleep(time);
                System.out.println("Thread1停顿了 " + time/1000 + "秒");
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            System.out.println("Thread1 END");
        }
    }

    public static class Thread2 implements Runnable{
        @Override
        public void run() {
            try {
                int time = random();
                Thread.sleep(time);
                System.out.println("Thread2停顿了 " + time/1000 + "秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread2 END");
        }
    }

    public static class Thread3 implements Runnable{
        @Override
        public void run() {
            try {
                int time = random();
                Thread.sleep(time);
                System.out.println("Thread3停顿了 " + time/1000 + "秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread3 END");
        }
    }

    public static class Thread4 implements Runnable{
        @Override
        public void run() {
            try {
                int time = random();
                Thread.sleep(time);
                System.out.println("Thread4停顿了 " + time/1000 + "秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread4 END");
        }
    }

    public static class Thread5 implements Runnable{
        @Override
        public void run() {
            try {
                int time = random();
                Thread.sleep(time);
                System.out.println("Thread5停顿了 " + time/1000 + "秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread5 END");
        }
    }

}
