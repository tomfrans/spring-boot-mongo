package com.frans.mongo.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.frans.mongo.dto.Customer;
import com.frans.mongo.dto.Event;
import com.frans.mongo.repository.CustomerRepository;
import com.frans.mongo.repository.EventsRepository;

@RestController
public class EventsController {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	EventsRepository eventsRepository;
	
	@Autowired
	private CustomerRepository repository;
		
	@RequestMapping(value="/service/events") //,method=RequestMethod.POST
	public String postEvents(){
		
		String events = this.restTemplate.getForObject("https://www.visitdubai.com/api/en/events", String.class);
		
		eventsRepository.deleteAll();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JSONObject json =new JSONObject(events);
			System.out.println(json.getJSONObject("result"));
			
			JSONArray eventsObj = json.getJSONObject("result").getJSONArray("events");
			System.out.println(eventsObj);
			ArrayList<Event> listdata = new ArrayList<Event>();     
			
			List<Event> eventsArr = objectMapper.readValue(eventsObj.toString(), new TypeReference<List<Event>>(){});

			
			
			//List eventsArr = new ArrayList<Event>();
			//eventsArr =(List<Event>) json.getJSONObject("result.events");
			eventsRepository.saveAll(eventsArr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Events Reposiroty count :"+eventsRepository.count());
		
		
		repository.deleteAll();
		
		System.out.println(eventsRepository.findByCategoryName("Live Entertainment").size());

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
		
		return events;
		
	}
}
