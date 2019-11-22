package com.platform.categorizer.controller;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.platform.categorizer.manager.eventManager.EventManager;
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
	
	@Autowired
	private EventManager eventManager;
	
	Logger logger = LoggerFactory.getLogger(CategorizerController.class);
    


    // Acceso a pagina api: http://localhost:8080/swagger-ui/index.html
	
    @Tag(name = "Events", description = "the events API")
    @Operation(summary = "save event", description = "save event", tags = { "Events" })
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation",
    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Event.class)))) })	

    @GetMapping(value = "/event/save", produces = { "application/json" })
    public Event saveEvent(@RequestParam(value="name", defaultValue="World") String name) {
    	logger.info("saveEvent");
    	Event event = new Event();
    	event.setName(name);
    	event.setTs(new Date());
    	
    	eventManager.saveEvent(event);
    	
        return event;
                            
    }
    
    @Operation(summary = "get event", description = "get event", tags = { "Events" })
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation",
    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Event.class)))) })
    
    @GetMapping(value = "/event/get", produces = { "application/json" })
    public Optional<Event> getEvent(@RequestParam(value="name") String name) {
    	logger.info("getEvent");
    	return eventManager.getEvent(name);
                            
    }
    
    @Operation(summary = "get all events", description = "get all events", tags = { "Events" })
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation",
    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Event.class)))) })
    
    @GetMapping(value = "/event/getAll", produces = { "application/json" })
    public List<Event> getAllEvent() {
    	logger.info("getAllEvent");
    	return eventManager.getAllEvents();
                            
    }
}
