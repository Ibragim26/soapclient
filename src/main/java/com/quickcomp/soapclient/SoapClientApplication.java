package com.quickcomp.soapclient;

import com.quickcomp.soapclient.client.SoapClient;
import com.quickcomp.soapclient.wsdll.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class SoapClientApplication {

//    @Autowired
//    private SoapClient client;
//    @PostMapping("/getProduct")
//    public GetProductResponse invokeSoapClient(@RequestBody GetProductRequest request){
//        return client.getProduct(request);
//    }
//
//    @PostMapping("/getOrder")
//    public GetOrderResponse invokeSoapClient(@RequestBody GetOrderRequest request){
//        return client.getOrder(request);
//    }

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

}
