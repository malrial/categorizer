package com.platform.categorizer.manager.eventManager;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.platform.categorizer.model.business.Event;


public interface EventManager {
	
	public void saveEvent(Event event);
	
	public Optional<Event> getEvent(String name);
	
	public List<Event> getAllEvents();

}
