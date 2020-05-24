package com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test2 {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
      public void before(){
          lock.lock();
          try{
              System.out.println("before");
              condition.signalAll();
          }finally {
              lock.unlock();
          }
    }
    public  void after(){
          lock.lock();
          try {
              condition.await();
              System.out.println("after");
          }catch (InterruptedException e){
              e.printStackTrace();
          }finally {
              lock.unlock();
          }
    }
    public static void main(String[] args) {
       test2 locke=new test2();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->locke.after());
        executorService.execute(()->locke.before());
    }
}
