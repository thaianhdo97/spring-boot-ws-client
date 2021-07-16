package com.t1908e.springbootwsclient.demo;

import com.example.springbootwsclient.service.HelloService;
import com.example.springbootwsclient.service.HelloServiceService;

public class TestService {
    public static void main(String[] args) {
        HelloServiceService hss = new HelloServiceService();
        HelloService hs = hss.getHelloServicePort();
        System.out.println();
    }
}
