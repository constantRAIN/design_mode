package com.example.zxcpractice.sql;

import org.testng.annotations.*;

/**
 * @author xuce.zhang
 * @date 2022/12/7
 */
public class TestNGTask1 {

    @BeforeMethod
    public void test3() {
        System.out.println("------beforeMethod------");
    }

    @AfterMethod
    public void test4() {
        System.out.println("------afterMethod------");
    }

    @Test
    public void test1() {
        System.out.println("------test1------");
    }
    @Test
    public void test2() {
        System.out.println("------test2------");
    }

    @BeforeClass
    public void test5() {
        System.out.println("------类之前运行------");
    }

    @AfterClass
    public void test6() {
        System.out.println("------类之后运行------");
    }


}
