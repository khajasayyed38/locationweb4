package com.locationweb4.dervices;

import java.util.List;

import com.locationweb4.entity.location;

public interface locationService {
	public void saveLocation(location location);
	
	public List<location> getLocations();
}
