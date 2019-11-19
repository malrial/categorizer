package com.platform.categorizer.manager.eventManager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.categorizer.model.business.Event;
import com.platform.categorizer.repository.EventRepository;

@Service
public class EventManagerImpl implements EventManager {
	
	@Autowired
	private EventRepository eventRepository;

	@Override
	public void saveEvent(Event event) {
		eventRepository.save(event);

	}

	@Override
	public Optional<Event> getEvent(String name) {
		Optional<Event> event = null;
		event =  eventRepository.findById(name);
		return event;

	}

	@Override
	public List<Event> getAllEvents() {
		return (List<Event>) eventRepository.findAll();
	}

}
