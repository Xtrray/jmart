package com.ferdyJmartDR.controller;

import com.ferdyJmartDR.ObjectPoolThread;
import com.ferdyJmartDR.Payment;
import com.ferdyJmartDR.dbjson.JsonAutowired;
import com.ferdyJmartDR.dbjson.JsonTable;
import org.springframework.web.bind.annotation.PostMapping;

public class PaymentController implements BasicGetController<Payment>{
    public static final long DELIVERED_LIMIT_MS = 24;
    public static final long ON_DELIVERY_LIMIT_MS = 24;
    public static final long ON_PROGRESS_LIMIT_MS = 24;
    public static final long WAITING_CONF_LIMIT_MS = 24;

    @JsonAutowired(value = Payment.class, filepath = "C:/Java/jmart/src/main/java/com/payment.json")
    public static JsonTable<Payment> paymentTable;

    public static ObjectPoolThread<Payment> poolThread;

    @Override
    public JsonTable<Payment> getJsonTable() {
        return paymentTable;
    }

    @PostMapping("/{id}/accept")
    public boolean accept (int id){
        return true;
    }

    @PostMapping("/{id}/cancel")
    public boolean cancel (int id){
        return true;
    }

    @PostMapping("/create")
    public Payment create (int buyerId, int productId, int productCount, String shipmentAddress, byte shipmentPlan){
        return null;
    }

    @PostMapping("/{id}/submit")
    public boolean submit(int id,String receipt){
        return true;
    }

    private boolean timekeeper(Payment payment){
        return true;
    }
}
