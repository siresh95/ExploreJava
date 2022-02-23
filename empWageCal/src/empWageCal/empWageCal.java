package empWageCal;

public class empWageCal {
	  static final int isPresent=1;
	    static final int isAbsent=0;
	    static int perHourWage=20;
	    static int wokingHour=8;
	    static int partTimeWage=8;
	    static  int dailyWage=0;
	    static final int isPartTime=2;
	    static int monthlySalary=0;
	    static int totalWorkingHrs=0;
	public static void main(String args[])
	{
		for(int i=0;i<20;i++)
		{
	    int randomValue = (int)((Math.random()*10) % 3);
	    System.out.println(randomValue);
	    
	    switch(randomValue){    
	    case isPresent:    
	    	totalWorkingHrs=wokingHour+totalWorkingHrs;
	    	System.out.println("Employee is present");
            dailyWage=wageCalculationMethod(perHourWage,wokingHour);   
	    	 break; 
	    	case isAbsent:    
	    		System.out.println("Employee is absent");
	    	dailyWage=0;
	    	 break;    
	    	case isPartTime:
	    		totalWorkingHrs=wokingHour+totalWorkingHrs;
		    	System.out.println("Employee is Doing Part Time");
		    	dailyWage=wageCalculationMethod(perHourWage, partTimeWage);    
	    		
	    	
	    	 break;    
	    	    
	    	    
	    	default:     
	    	  System.out.println("default");  
	    	}   
	    System.out.println(dailyWage);
	    
	    if (totalWorkingHrs<100) {
	    	monthlySalary=dailyWage+monthlySalary;
	   
	    }
	    else {
	    	break;
	    }
	}
		System.out.println(monthlySalary);
	}

	    public static int wageCalculationMethod(int perDayWage,int workingHour){
	       
	    	int dailyWage=perDayWage*workingHour;
	            return dailyWage;
	    }
}
