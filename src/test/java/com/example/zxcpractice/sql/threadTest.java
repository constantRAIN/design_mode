package com.example.zxcpractice.sql;

import org.testng.annotations.Test;

/**
 * @author xuce.zhang
 * @date 2022/12/21
 */
public class threadTest {
    //@Test(invocationCount = 5, threadPoolSize= 5)
    @Test
    public void testa_1(){
        System.out.println("testaaa-1级别1执行");
        System.out.println("testaaa-1线程id:"+Thread.currentThread().getId());
    }

    //@Test(invocationCount = 5,threadPoolSize = 5)
    @Test
    public void testa_2(){
        System.out.println("testaaa-2级别2执行");
        System.out.println("testaaa-2线程id:"+Thread.currentThread().getId());
    }
}
