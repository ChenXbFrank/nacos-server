package com.cxb.springcloud.web;


import org.springframework.web.bind.annotation.*;

@RestController
public class ServerController {

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "hello Nacos Discovery " + string;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(a / b);
    }
}
