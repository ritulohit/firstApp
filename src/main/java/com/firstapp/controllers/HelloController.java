package com.firstapp.controllers;

import com.firstapp.beans.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController{

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping(value="/getJson", method = RequestMethod.GET)
    public @ResponseBody Shop getJsonResponse(){
        Shop shop = new Shop();
        shop.setName("Ritu shop");
        List<String> staff = new ArrayList<String>();
        staff.add("staff1");
        staff.add("staff2");
        shop.setStaffName(staff);
        return shop;
    }

}
