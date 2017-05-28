package org.services.interfaces;

import org.services.pojo.SearchResult;

public interface SearchEngine {
	SearchResult performSearch(Integer numAdults, 
									 Integer numChild, 
									 Integer numInfant, 
									 Integer daysToDeparture, 
									 String origin, 
									 String destination);
}
