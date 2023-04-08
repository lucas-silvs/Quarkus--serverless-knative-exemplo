package com.lucassilvs.serverless.exemplo.service;

import io.quarkus.funqy.Funq;

public class GreetingResource {

    @Funq
    public String hello() {
        return "Hello World";
    }

    @Funq
    public String toLowerCase(String val) {
        return val.toLowerCase();
    }

    //Alterando nome endpoint de acesso para execução da função
    @Funq("double")
    public int doubleIt(int val) {
        return val + val;
    }
}