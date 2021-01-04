package com.hyperbenchh.hyperbench.plantuml;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SynchronizedTest {

    public static void main(String[] args) {


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);










    }
//    因为某一个线程进入synchronized代码块前后，线程会获得锁，清空工作内存，从主内存拷贝共享变量最新的值到工作内存成为副本，执行代码，将修改后的副本的值刷新回主内存中，线程释放锁。



}


class Demo extends Thread{

    private volatile boolean flag=false;

    public boolean isFlag(){
        return flag;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag=true;
        System.out.println("flag:"+flag);
    }
}