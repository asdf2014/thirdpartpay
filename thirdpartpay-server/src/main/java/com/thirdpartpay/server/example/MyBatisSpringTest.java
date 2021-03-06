package com.thirdpartpay.server.example;

import com.thirdpartpay.common.model.Customer;
import com.thirdpartpay.common.model.CustomerExample;
import com.thirdpartpay.common.service.customer.ICustomerService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * MyBatis 生成器的 增删查改 测试例子
 * <p>
 * Created by Benedict Jin on 2016/4/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "")
@ContextConfiguration(locations = {"classpath:/spring/spring-mybatis.xml"})
public class MyBatisSpringTest {

    private static Logger _log = Logger.getLogger(MyBatisSpringTest.class);

    @Autowired
    private ICustomerService customerService;

    @Test
    public void testInsert() {
        Customer customer = new Customer();
        customer.setCustomerId(10);
        customer.setCustomerName("Jin");
        customer.setCustomerPassword("123456");
        customer.setEmail("grace@gmail.com");
        _log.debug(customer.toString());

        customerService.insert(customer);
    }

    @Test
    public void testDelete() {

        CustomerExample customerExample = new CustomerExample();
        customerExample.or().andCustomerIdIn(new LinkedList<>(Arrays.asList(10)));

        customerService.deleteByExample(customerExample);
    }

    @Test
    public void testQuery() {
        CustomerExample customerExample = new CustomerExample();
        customerExample.or().andCustomerIdIn(new LinkedList<>(Arrays.asList(1)));

        List<Customer> customers = customerService.selectByExample(customerExample);
        for (Customer customer : customers) {
            _log.info(customer.getCustomerName());
        }
    }

    @Test
    public void testUpdate() {

        Customer customer = new Customer();
        customer.setCustomerPassword("268479135");
        _log.debug(customer.toString());

        CustomerExample customerExample = new CustomerExample();
        customerExample.or().andCustomerIdIn(new LinkedList<>(Arrays.asList(1)));

        customerService.updateByExampleSelective(customer, customerExample);
    }

}