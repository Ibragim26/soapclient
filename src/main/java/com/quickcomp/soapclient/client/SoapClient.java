package com.quickcomp.soapclient.client;

import com.quickcomp.soapclient.wsdll.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;


@Service
public class SoapClient {

    @Autowired
    private WebServiceTemplate template;

    @Value("${soap-request}")
    private String soapUrl;

    public GetProductResponse getProduct (GetProductRequest request) {
        return (GetProductResponse) template.marshalSendAndReceive(soapUrl, request );
    }

    public GetOrderResponse getOrder (GetOrderRequest request) {
        return (GetOrderResponse) template.marshalSendAndReceive(soapUrl, request );
    }
}
