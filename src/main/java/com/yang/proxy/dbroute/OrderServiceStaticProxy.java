package com.yang.proxy.dbroute;

import com.yang.proxy.dbroute.db.DynamicDataSourceEntry;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {

    private IOrderService iOrderService;
    private SimpleDateFormat sim=new SimpleDateFormat("yyyy");

    public OrderServiceStaticProxy(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }


    @Override
    public int createOrder(Order order) {
        before();
        Long time = order.getCreate();
        Integer year = Integer.valueOf(sim.format(new Date(time)));
        System.out.println("静态代理自动分配到数据库DB_"+year+"中调用数据");
        DynamicDataSourceEntry.set(year);
        iOrderService.createOrder(order);
        DynamicDataSourceEntry.restore();
        after();
        return 0;
    }

    private void after() {
        System.out.println("代理执行后的方法");
    }

    private void before() {
        System.out.println("代理执行前的方法");
    }
}
