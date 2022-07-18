package bus_Train_ReservationSystems;
import java.util.*;
import java.io.*;

public class booking {
	 String passengername;
	  int busno;
	  String date;
	  
	  booking(){
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter name of the passenger");
		  passengername = sc.next();
		  System.out.println("Enter busnumber :  ");
		  busno= sc.nextInt();
		  System.out.println("Enter date dd/mm/yyyy");
		  date =sc.next();
	  }
	  public  boolean isavailable(ArrayList<booking>bookings, ArrayList<bus>buses) {
		  int capacity = 0;
		  for(bus B : buses) {
			  if(B.getBusnumber()==busno) {
				  capacity = B.getcapacity();
			  }
		  }
		  int booked =0;
		  for(booking b : bookings) {
			  if(b.busno == busno && b.date.equals(date))
				  booked++;
		  }
		  if(booked<capacity)
			  return true;
		  else
			  return false;
		 
	  }

}
