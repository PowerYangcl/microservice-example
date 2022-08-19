package com.matrix.springcloud.alibaba.service;

import org.springframework.stereotype.Component;

import com.matrix.springcloud.entities.CommonResult;
import com.matrix.springcloud.entities.Payment;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
