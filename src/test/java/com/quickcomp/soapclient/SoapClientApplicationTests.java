package com.quickcomp.soapclient;


import com.quickcomp.soapclient.client.SoapClient;
import com.quickcomp.soapclient.wsdll.GetOrderRequest;
import com.quickcomp.soapclient.wsdll.GetProductRequest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SoapClientApplicationTests {

    @Autowired
    private SoapClient client;

    @Test
    public void testClientSoapForGettingProductByOrderId() {
        GetProductRequest request = new GetProductRequest();
        request.setOrderId(1);
        assertThat(client.getProduct(request).getProduct().getDescription()).isEqualTo("descr");
    }
    @Test
    void testClientSoapForGettingOrderById() {
        GetOrderRequest request = new GetOrderRequest();
        request.setId(1);
        assertThat(client.getOrder(request).getBooking().getAddress()).isEqualTo("address");
    }
}
