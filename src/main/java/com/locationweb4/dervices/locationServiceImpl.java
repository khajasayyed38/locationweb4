package com.locationweb4.dervices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb4.entity.location;
import com.locationweb4.repositories.locationRepository;

@Service
public class locationServiceImpl implements locationService {
	
	@Autowired
	private locationRepository locationRepo;
	@Override
	public void saveLocation(location location) {
		locationRepo.save(location);

	}
	@Override
	public List<location> getLocations() {
		List<location> locations = locationRepo.findAll();
		return locations;
	}

}
