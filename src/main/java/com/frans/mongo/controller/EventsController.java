package com.frans.mongo.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		
	@RequestMapping(value="/service/events",method=RequestMethod.POST) //,method=RequestMethod.POST
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
		
		//eventsStartingToday.get(0).setId(null);
		
		//eventsRepository.insert(eventsStartingToday);
		
		System.out.println("Events starting Today After:"+eventsRepository.findAll().size());
		
		return eventsRepository.findByStartDateAndCategoryName(LocalDate.now(ZoneId.of( "Asia/Dubai" )).atStartOfDay(),"Live Entertainment");
		
	}
	
	@RequestMapping(value="/service/events",method=RequestMethod.GET) 
	public ResponseEntity<List<Event>> retrieveEvents(){
		
		List<Event> events = eventsRepository.findAll();		
		for(Event event:events){
			event.add(linkTo(methodOn(EventsController.class).retrieveEventsByKey(event.getKey())).withSelfRel());
		}
		return ResponseEntity.ok(events);
	}
	
	@RequestMapping(value="/service/events/category", produces = {MediaType.APPLICATION_JSON_VALUE}) 
	public Resources<Resource<Event>> retrieveEventsByCategoryName(
			@RequestParam(value = "name", required = true) String name){
		
		List<Event> categoryList = eventsRepository.findByCategoryName(name);
		List<Link> links = new LinkedList<>();
		links.add(linkTo(methodOn(EventsController.class).retrieveEventsByCategoryName(name)).withSelfRel());
		
		List<Resource<Event>> resources = new ArrayList<>(categoryList.size());
		for (Event event:categoryList) {
            Link selfLink = linkTo(methodOn(EventsController.class).retrieveEventsByKey(event.getKey())).withSelfRel();
            resources.add(new Resource<Event>(event, selfLink));
        }
 
		return new Resources<>(resources, links);
	}
	
	@RequestMapping(value="/service/events/today/category/", produces = {MediaType.APPLICATION_JSON_VALUE}) 
	public Resources<Event> retrieveTodaysEventsByCategoryName(
			@RequestParam(value = "name", required = true) String name){
		
		List<Event> categoryList = eventsRepository.findByStartDateAndCategoryName(LocalDate.now(ZoneId.of( "Asia/Dubai" )).atStartOfDay(),name);
		Resources<Event> resource = new Resources<>(categoryList, linkTo(methodOn(EventsController.class).retrieveTodaysEventsByCategoryName(name)).withSelfRel());
		for(Event event:categoryList){
			event.add(linkTo(methodOn(EventsController.class).retrieveEventsByKey(event.getKey())).withSelfRel());
		}
	
		return resource;
	}
	
	
	@RequestMapping(value="/service/events/{key}",produces = {MediaType.APPLICATION_JSON_VALUE}) 
	public ResponseEntity<Event> retrieveEventsByKey(@PathVariable String key){
		
		Event event = eventsRepository.findByKey(key);
		return ResponseEntity.ok(event);
	}
	
	
	
	
}
