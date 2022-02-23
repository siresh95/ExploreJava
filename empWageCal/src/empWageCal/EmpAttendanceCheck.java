package empWageCal;

public class EmpAttendanceCheck {

	static int isPresent=1;
    static int isAbsent=0;
public static void main(String args[])
{
    int randomValue = (int)((Math.random()*10) % 2);
    System.out.println(randomValue);
    if(randomValue==isPresent){
            System.out.println("Employee is present");
    }
    if(randomValue==isAbsent){
            System.out.println("Employee is absent");
    }
}
}
