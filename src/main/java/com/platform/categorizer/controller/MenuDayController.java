package com.platform.categorizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.categorizer.manager.menuDayManager.IMenuDayManager;
import com.platform.categorizer.model.business.Day;

@RestController
public class MenuDayController {
	
	@Autowired
	private IMenuDayManager iMenuDayManager; 
	
	
	@GetMapping(value = "/calendar/createDay", produces = { "application/json" })
	public Day createDay(){
		
		return iMenuDayManager.createDay();
		
	}
	
	@GetMapping(value = "/calendar/days", produces = { "application/json" })
	public List<Day> getDays(){
		
		return iMenuDayManager.getDays();
		
	}

}
