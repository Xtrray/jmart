package com.ferdyJmartDR.controller;

import com.ferdyJmartDR.Account;
import com.ferdyJmartDR.Payment;
import com.ferdyJmartDR.dbjson.JsonAutowired;
import com.ferdyJmartDR.dbjson.JsonTable;
import org.springframework.web.bind.annotation.PostMapping;

public class PaymentController implements BasicGetController<Payment>{
    public static final long DELIVERED_LIMIT_MS = 24;
    public static final long ON_DELIVERY_LIMIT_MS = 24;
    public static final long ON_PROGRESS_LIMIT_MS = 24;
    public static final long WAITING_CONF_LIMIT_MS = 24;

    @JsonAutowired(value = Payment.class, filepath = "C:\\Java\\jmart\\src\\main\\java\\com\\ferdyJmartDR\\payment.json")
    public static JsonTable<Payment> paymentTable;

    @Override
    public JsonTable<Payment> getJsonTable() {
        return paymentTable;
    }
}
