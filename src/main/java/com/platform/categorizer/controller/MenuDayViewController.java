package com.platform.categorizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

@Controller
public class MenuDayViewController {
	
	@Autowired
	private IMenuDayManager iMenuDayManager; 
	
	


	
	@GetMapping(value = "/calendar/web/createDay", produces = { "application/json" })
	public String createDayView(Model model){
		
		Day day = iMenuDayManager.createDay(); 
		
		model.addAttribute("day", day.getDate());
		model.addAttribute("menu", day.getMenu());
		return "calendar";
		
	}
	

	
	@GetMapping(value = "/calendar/web/days", produces = { "application/json" })
	public String getDays(Model model){
		
		model.addAttribute("days",iMenuDayManager.getDays());
		
		return "calendar";
		
	}

}
