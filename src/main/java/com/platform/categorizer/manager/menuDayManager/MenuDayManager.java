package com.platform.categorizer.manager.menuDayManager;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.categorizer.model.business.Day;
import com.platform.categorizer.repository.IDayRepository;

@Service
public class MenuDayManager implements IMenuDayManager {
	
	@Autowired
	private IDayRepository iDayRepo;

	@Override
	public List<Day> getDays() {
		return iDayRepo.findAll();
	}

	@Override
	public Day createDay() {
		
		Day day = new Day();
		day.setDate(new Date());
		day.setMenu("menu");		
		
		return iDayRepo.save(day);
	}

}
