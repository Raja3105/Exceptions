package abstraction;

public class LoyolaCollege implements College2 {
	public String collegeType(String degree) {
		if(degree.equalsIgnoreCase("B.E")) {
			return "ENGINEERING" ;
	}
	  else if(degree.equalsIgnoreCase("B.Tech")) {
		  
		return "ENGINEERING AND TECHNOLOGY" ;
          }
        else if(degree.equalsIgnoreCase("MBBS")) {
    	  
	     return "MEDICAL COLLEGE" ;
        }
	     else {
	    	 
	    	 return "Arts AND SCIENCE COLLEGE";
	     }
}

	@Override
	public int duration(String degree) {
		   if (degree.equalsIgnoreCase("B.E")) {
			   
			   return 4 ;
		   }
		   else if (degree.equalsIgnoreCase("B.Sc")) {
			   
			   return 3 ;
		   }
          else if (degree.equalsIgnoreCase("B.Tech")) {
			   
			   return 4 ;
		   }
          else {
        	  
     	     return 5 ;
             }
		
	}
	public String location(String location) {
		return "THE LOCATION IS :"+ location ;
	}
	

}
