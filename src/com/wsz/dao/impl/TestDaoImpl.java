package com.wsz.dao.impl;

import com.wsz.dao.TestDao;

/**
 * @author: wsz
 * @className: TestDaoImpl
 * @description:
 * @date: 2021/6/17 21:33
 * @version: 0.1
 * @since: jdk1.8
 */
public class TestDaoImpl implements TestDao {
    @Override
    public void sayHello() {
        System.out.println("First Spring");
    }
}
