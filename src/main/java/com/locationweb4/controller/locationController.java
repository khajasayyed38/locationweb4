package com.locationweb4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb4.entity.location;
import com.locationweb4.dervices.locationService;
import com.locationweb4.dto.GetLocationData;
import com.locationweb4.repositories.locationRepository;

@Controller
public class locationController {

	@Autowired
	private locationService locationService;

	@RequestMapping("/showlocation")
	public String showLocationPage() {
		return "saveLocation";
	}

	@RequestMapping("/saveLocation")
	public String getLocationData(@ModelAttribute("location") location location, ModelMap modelMap) {
		locationService.saveLocation(location);
		modelMap.addAttribute("msg", "Location is saved!!");
		return "saveLocation";
	}
	
	@RequestMapping("/getalllocations")
	public String getAllLocation(ModelMap modelMap) {
		List<location> locations = locationService.getLocations();
		for(location l : locations)
			System.out.println(l.getCode());
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
}
