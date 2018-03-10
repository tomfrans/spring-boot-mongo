package com.frans.mongo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.frans.mongo.dto.Event;
import com.frans.mongo.repository.EventsRepository;

@RunWith(SpringRunner.class)
@DataMongoTest
public class EventsRepositoryTest {

	@Autowired
	private EventsRepository eventsRepository;
	
	@Test
    public void testFindByCategoryName(){
    	List<Event> events = eventsRepository.findByCategoryName("Live Entertainment");		
		assertEquals("Live Entertainment", events.get(0).getCategoryName());		
    }
	
	@Test
    public void testFindByKey(){
    	Event events = eventsRepository.findByKey("fa0e24ec360840c19ceb817d0a0ad45b");		
		assertEquals("fa0e24ec360840c19ceb817d0a0ad45b", events.getKey());		
    }
}
