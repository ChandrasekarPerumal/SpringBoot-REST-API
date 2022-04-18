package com.Chandra.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChandraResource {

	@RequestMapping("chan")
	public List<chan> getChandra(){
		
		
		chan object1=new chan();
		object1.setId(101);
		object1.setName("Guru");
		
		chan object2=new chan();
		object2.setId(102);
		object2.setName("Gumms");
		
		System.out.println("Enter the Name");
		
		
		
		List<chan> objectList=new ArrayList<>();
		
		objectList.add(object1);
		objectList.add(object2);
		
		return objectList;
		
	}
	
}
