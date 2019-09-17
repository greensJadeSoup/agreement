package com.springboot.agreement.controller;

import com.springboot.agreement.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/terminal")
public class TerminalController {
    @Autowired
    TerminalService terminalService;

    @RequestMapping("/redis/{data}")
    public void redis(@PathVariable String data){
        terminalService.analysis(data);
    }

}
