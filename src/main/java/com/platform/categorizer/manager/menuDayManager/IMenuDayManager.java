package com.platform.categorizer.manager.menuDayManager;

import java.util.List;

import com.platform.categorizer.model.business.Day;

public interface IMenuDayManager {
	
	
	public List<Day> getDays();
	
	public Day createDay();

}
