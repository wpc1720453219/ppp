package com.wpc;

import sun.util.locale.provider.SPILocaleProviderAdapter;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class mathpc implements Callable<String> {
    public String call(){
        return "wpc";
    }
}
public class thread1 {
    public static void main(String[] args) throws ExecutionException,InterruptedException{
          mathpc mc=new mathpc();
        FutureTask<String> ft=new FutureTask<>(mc);
        Thread thread=new Thread(ft);
        thread.start();
  Thread.sleep(1000);
        Object lock=new Object() ;
        synchronized (lock){
             lock.wait();
        }

        System.out.println(ft.get());

    }
}
