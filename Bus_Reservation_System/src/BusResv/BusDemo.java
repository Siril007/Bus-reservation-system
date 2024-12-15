package BusResv;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
	public static void main(String[]args)
	{
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		for(Bus b:buses)
		{
			b.displayBusInfo();
		}
		
		int userOpt =1;
		Scanner sc = new Scanner(System.in);
		while(userOpt == 1)
		{
			System.out.println("Enter 1 to Book or 2 to exit");
			userOpt = sc.nextInt();
			
			if(userOpt ==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed");
				}
				else {
					System.out.println("Sorry. Bus is Full. Try another Bus or Date");
				}
			}
		}
	}
}
