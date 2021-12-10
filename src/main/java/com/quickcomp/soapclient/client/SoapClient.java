package com.quickcomp.soapclient.client;

import com.quickcomp.soapclient.wsdll.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;


@Service
public class SoapClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public GetProductResponse getProduct (GetProductRequest request) {
        template = new WebServiceTemplate(marshaller);

        GetProductResponse soap = (GetProductResponse) template.marshalSendAndReceive("http://localhost:8081/soapWS/defaultWsdl11Definition.wsdl",
                request );
        return soap;
    }

    public GetOrderResponse getOrder (GetOrderRequest request) {
        template = new WebServiceTemplate(marshaller);
        GetOrderResponse soap = (GetOrderResponse) template.marshalSendAndReceive("http://localhost:8081/soapWS/defaultWsdl11Definition.wsdl",
                request );
        return soap;
    }
}
