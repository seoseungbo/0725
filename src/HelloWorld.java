import java.lang.*;
import java.util.*;

public class HelloWorld {
   public static void main(String[] args) {
//	   System.out.println("안녕, 세계여!!");
//	   System.out.println("안녕,!");
//	   System.out.println("안녕, 세계여!!");
	   
	   Scanner sc = new Scanner(System.in);
	  	   
	   System.out.print("당신의 이름은 ? :");
	   String name = sc.nextLine();
	   
	   System.out.println("귀하의 이름은" + name + "이군요.");
   }
}
