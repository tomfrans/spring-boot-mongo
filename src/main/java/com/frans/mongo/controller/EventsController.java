package com.frans.mongo.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.frans.mongo.dto.Event;
import com.frans.mongo.repository.EventsRepository;

@RestController
public class EventsController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	EventsRepository eventsRepository;
	
	@Value("${eventsURL}")
	private String eventURL;
		
	@RequestMapping(value="/service/events") //,method=RequestMethod.POST
	public List<Event> postEvents(){
		
		String events = this.restTemplate.getForObject(eventURL, String.class);
		
		//eventsRepository.deleteAll();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JSONObject json =new JSONObject(events);
			//System.out.println(json.getJSONObject("result"));
			
			JSONArray eventsObj = json.getJSONObject("result").getJSONArray("events");
			//System.out.println(eventsObj);
			
			
			List<Event> eventsArr = objectMapper.readValue(eventsObj.toString(), new TypeReference<List<Event>>(){});
			eventsRepository.saveAll(eventsArr);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Events Reposiroty count :"+eventsRepository.count());
		
		
		
		System.out.println("Events with Category Live Entertainement: "+eventsRepository.findByCategoryName("Live Entertainment").size());
		
		System.out.println("Date:"+LocalDate.now(ZoneId.of( "Asia/Dubai" )).atStartOfDay());
		
		//List<Event> eventsStartingToday = eventsRepository.findByStartDate(LocalDate.now(ZoneId.of( "Asia/Dubai" )).atStartOfDay());
		
		List<Event> eventsStartingToday = eventsRepository.findByStartDateAndCategoryName(LocalDate.now(ZoneId.of( "Asia/Dubai" )).atStartOfDay(),"Live Entertainment");
		
		System.out.println("Events starting Today:"+eventsStartingToday.size());
		
		//eventsRepository.deleteAll(eventsStartingToday);

		eventsRepository.saveAll(eventsStartingToday);
		
		System.out.println("Events starting Today before:"+eventsRepository.findAll().size());
		
		eventsStartingToday.get(0).setId(null);
		
		eventsRepository.insert(eventsStartingToday);
		
		System.out.println("Events starting Today After:"+eventsRepository.findAll().size());
		
		return eventsRepository.findByStartDateAndCategoryName(LocalDate.now(ZoneId.of( "Asia/Dubai" )).atStartOfDay(),"Live Entertainment");
		
	}
}
