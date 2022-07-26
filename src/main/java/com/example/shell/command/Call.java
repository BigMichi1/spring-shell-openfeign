package com.example.shell.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.example.shell.feign.TestApi;
import com.example.shell.feign.TestApi2;

@ShellComponent
public class Call {
    private final TestApi testApi;
    private final TestApi2 testApi2;

    @Autowired
    public Call(final TestApi testApi, final TestApi2 testApi2) {
        this.testApi = testApi;
        this.testApi2 = testApi2;
    }

    @ShellMethod
    public void doApiCall() {
        testApi.doCall("Hello World");
        testApi2.doCall("Finish");
    }
}
