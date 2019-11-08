package com.platform.categorizer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategorizerController {
	
	Logger logger = LoggerFactory.getLogger(CategorizerController.class);
    


    private static final String template = "Categories, %s!";

    @RequestMapping("/categories")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	logger.info("Hello World");
        return String.format(template, name);
                            
    }
}
