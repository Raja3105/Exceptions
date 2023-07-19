package abstraction;

public class Car implements Vehicle3 , RoadWayRules3 {

	@Override
	public String transportType(String boardColour) {
		if(boardColour.equalsIgnoreCase("Yellow")) {
		
		return "RENTAL";
	}
		else {
			
			return "OWN";
		}
	}

	@Override
	public String fuelType(boolean isPetrol) {
		if(isPetrol==true) {
		   return "PETROL";
	}
		else {
		    return "DIESEL";
		}
	}

	@Override
	public int speedLimit(String location) {
		
		if(location.equalsIgnoreCase("CITY")) {
		    return 40;
		}
		else {
		    return 100;
		}
	}

	
}
