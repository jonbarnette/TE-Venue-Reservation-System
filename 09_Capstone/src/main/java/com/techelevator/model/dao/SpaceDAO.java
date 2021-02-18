package com.techelevator.model.dao;

import java.time.LocalDate;
import java.util.List;

import com.techelevator.model.*;

public interface SpaceDAO {
	
	public List<Space> retrieveSpacesByVenueID(int venueID);
	
	public List<Space> retrieveAvailableSpaces(LocalDate startingDate, LocalDate endingDate, int expectedAttendance,
			boolean wheelchairAccess, double dailyRate, int category);
	
	public List<Space> retrieveSpacesForVenue(int venueID, LocalDate startingDate, LocalDate endingDate, int expectedAttendance);
	

}