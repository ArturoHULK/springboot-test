package com.politecnica.workshops.springboottest.controler;

import com.politecnica.workshop.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {

    private Operation operation;

    @Autowired
    public void setOperation(Operation operation){
        this.operation=operation;
    }

     @RequestMapping(value="/sum")
    public int doOperation(@RequestParam int a ,@RequestParam int b){
        return operation.suma(a,b);
    }
}
