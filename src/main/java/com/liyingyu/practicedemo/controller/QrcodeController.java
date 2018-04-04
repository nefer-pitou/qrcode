package com.liyingyu.practicedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yingyu Li
 * @create 2018-04-04 16:17
 **/

@Controller
public class QrcodeController {
    @GetMapping("/qrcode")
    public String getQrcode(){
        return "jqueryQrcode";
    }
}
