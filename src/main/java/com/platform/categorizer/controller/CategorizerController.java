package com.platform.categorizer.controller;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.platform.categorizer.model.business.Event;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class CategorizerController {
	
	Logger logger = LoggerFactory.getLogger(CategorizerController.class);
    


    private static final String template = "Event name, %s!";
    
    @Tag(name = "categories", description = "the categories API")
    @Operation(summary = "List categories", description = "List all categories", tags = { "categories" })
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation",
    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Event.class)))) })	

    @GetMapping(value = "/categories", produces = { "application/json" })
    public Event greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	logger.info("Hello World");
    	Event event = new Event();
    	event.setName(String.format(template, name));
    	event.setTs(new Date());
        return event;
                            
    }
}
