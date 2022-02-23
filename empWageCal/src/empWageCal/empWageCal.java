package empWageCal;

public class empWageCal {

	  static int isPresent=1;
      static int isAbsent=0;
      static int perHourWage=20;
      static int wokingHour=8;
      static int dailyWage=0;
  public static void main(String args[])
  {
      int randomValue = (int)((Math.random()*10) % 2);
      System.out.println(randomValue);
      if(randomValue==isPresent){
              System.out.println("Employee is present");
              dailyWage=wageCalculationMethod(perHourWage,wokingHour);
      }
      if(randomValue==isAbsent){
              System.out.println("Employee is absent");
      }
      System.out.println(dailyWage);
  }

      public static int wageCalculationMethod(int perDayWage,int workingHour){
              int dailyWage=perDayWage*workingHour;
              return dailyWage;
      }
}
