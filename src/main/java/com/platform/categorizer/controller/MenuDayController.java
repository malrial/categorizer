package com.platform.categorizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.categorizer.manager.menuDayManager.IMenuDayManager;
import com.platform.categorizer.model.business.Day;
import com.platform.categorizer.model.business.Event;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class MenuDayController {
	
	@Autowired
	private IMenuDayManager iMenuDayManager; 
	
	@Tag(name = "Calendar", description = "the calendar API")
    
	
	@Operation(summary = "create day", description = "create day", tags = { "Calendar" })
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation",
    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Day.class)))) })	

	@GetMapping(value = "/calendar/createDay", produces = { "application/json" })
	public Day createDay(){
		
		return iMenuDayManager.createDay();
		
	}
	
	@Operation(summary = "gat all days", description = "get All Days", tags = { "Calendar" })
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "successful operation",
    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Day.class)))) })	
	
	@GetMapping(value = "/calendar/days", produces = { "application/json" })
	public List<Day> getDays(){
		
		return iMenuDayManager.getDays();
		
	}

}
