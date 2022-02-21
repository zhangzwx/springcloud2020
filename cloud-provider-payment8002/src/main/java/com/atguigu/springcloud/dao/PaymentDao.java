package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;

public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}

