import java.util.Scanner;
public class Ar16
{
   // define variables for storing reservation information
    private static String[][] seats = new String[10][4];
    private static int numReserved = 0;
    public static void main(String[] args) 
	{
        // add login and password functionality
        Scanner input = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        if (login.equals("Urja") && password.equals("1234"))
			{
            // display menu options
            int choice;
            do 
			{
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("===================Welcome to Airline Reservation System====================");
				System.out.println("----------------------------------------------------------------------------");
                System.out.println("1. Add user details");
                System.out.println("2. Register a flight");
                System.out.println("3. Book a ticket and calculate charges");
                System.out.println("4. Print reserved seats");
                System.out.println("5. Print available seats");
                System.out.println("6. Print occupied seats");
                System.out.println("7. Print ticket");
                System.out.println("8. Exit");
				System.out.println(" ");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                // process user's choice
                switch (choice) 
				{
                    case 1:
                        addUserDetails();
                        break;
                    case 2:
                        registerFlight();
                        break;
                    case 3:
                        bookTicket();
                        break;
                    case 4:
                        printReservedSeats();
                        break;
                    case 5:
                        printAvailableSeats();
                        break;
                    case 6:
                        printOccupiedSeats();
                        break;
                    case 7:
                        printTicket();
                        break;
                    case 8:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            }
			while (choice != 8);
        }
		else 
		{
            System.out.println("Invalid login or password. Exiting program...");
        }
    }
    // method for adding user details
    private static void addUserDetails()
	{
		System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
		System.out.print("Enter age:");
		int age = input.nextInt();
		input.nextLine();
		System.out.print("Enter Gender F/M: ");
        String Gender = input.nextLine();
        System.out.print("Enter email: ");
        String email = input.nextLine();
		
		String num="10";
		int flag=0;
        System.out.println("Enter 10 digit phone number: ");
		while(flag==0)
		{
		for(int i=0;i<num.length();i++)
		{
			num=input.nextLine();
			if(num.length()==10)
			{
				if(num.charAt(0)=='9'|| num.charAt(0)=='8'|| num.charAt(0)=='7')
				{
					System.out.println("valid phone number,thank you");
					System.out.println("your mobile number is="+ num);
					flag=1;
					break;
				}
				else{
					System.out.println("your phone number must be start at 9,8,7");
					num = input.nextLine();
				}
			}
			else
			{
				System.out.println("enter valid length of number");
			}
		}
		}
		System.out.println("  ");
		System.out.println("Your Name: "+name);
		System.out.println("Your Age: "+age);
		System.out.println("Your Gender: "+Gender);
		System.out.println("Your Email: "+email);
		System.out.println("Your Phone: "+num);
        System.out.println("User details added successfully.");
    }
   // method for registering a flight
    private static void registerFlight() 
	{
		System.out.println("  ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter flight number: ");
        String flightNum = input.nextLine();
        System.out.print("Enter Departure city: ");
        String DepartureCity = input.nextLine();
        System.out.print("Enter Arrivel city: ");
        String ArrivelCity = input.nextLine();
        System.out.print("Enter Departure time: ");
        String departTime = input.nextLine();
		System.out.println("  ");
        System.out.println("Your Flight number: "+flightNum);
		System.out.println("Your Departure city: "+DepartureCity);
		System.out.println("Your Arrivel city: "+ArrivelCity);
		System.out.println("Your Departure time: "+departTime);
        System.out.println("Flight registered successfully.");
    }

    // method for booking a ticket and calculating charges
    private static void bookTicket()
	{
		String[] name = new String[50];
        Scanner input = new Scanner(System.in);
		System.out.print("Enter number of tickets to book: ");
        int numTickets = input.nextInt();
		input.nextLine();
		for(int i=0;i<numTickets;i++)
		{
        System.out.println("Enter name: ");
         name[i] = input.nextLine();
		}
        System.out.print("Enter email: ");
        String email = input.nextLine();
        System.out.print("Enter phone number: ");
        String phone = input.nextLine();
        System.out.print("Enter seat class (1 for first class, 2 for economy): ");
        int seatClass = input.nextInt();
        

        double ticketPrice;
		if (seatClass == 1) 
		{
           ticketPrice = 1000.0;
        }
		else 
		{
            ticketPrice = 500.0;
        }
        double totalCharges = ticketPrice * numTickets;
        int availableSeats = 40 - numReserved;
        if (numTickets > availableSeats)
			{
                System.out.println("Not enough seats available. Please try again.");
                return;
            }

    // assign seats to passenger
    for (int i = 0; i < numTickets; i++)
		{
        for (int j = 0; j < 4; j++)
			{
            if (seats[i][j] == null)
			{
                seats[i][j] =name[i];
                numReserved++;
                break;
            }
            }
        }
	
    // print ticket and charges
    System.out.println("Ticket booked successfully. Total charges: " + totalCharges);
}
    // method for printing reserved seats
    private static void printReservedSeats()
	{
    System.out.println("Reserved seats:");
    for (int i = 0; i < 10; i++) 
	{
        for (int j = 0; j < 4; j++)
			{
            if (seats[i][j] != null) 
			{
                System.out.println("Seat " + (i+1) + (char)('A'+j) + ": " + seats[i][j]);
            }
        }
    }
}
// method for printing available seats
private static void printAvailableSeats()
 {
    System.out.println("Available seats:");
    for (int i = 0; i < 10; i++) 
	{
        for (int j = 0; j < 4; j++) 
		{
            if (seats[i][j] == null)
			{
                System.out.print("Seat " + (i+1) + (char)('A'+j) + " ");
            }
        }
    }
    System.out.println();
}
// method for printing occupied seats
private static void printOccupiedSeats()
 {
    System.out.println("Occupied seats:");
    for (int i = 0; i < 10; i++) 
	{
        for (int j = 0; j < 4; j++)
			{
            if (seats[i][j] != null)
			{
                System.out.println("Seat " + (i+1) + (char)('A'+j) + " ");
            }
        }
    }
    System.out.println();
}
 // method for printing ticket
 private static void printTicket()
 {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter passenger name: ");
    String name = input.nextLine();
    for (int i = 0; i < 10; i++) 
	{
        for (int j = 0; j < 4; j++)
			{
            if (seats[i][j] != null && seats[i][j].equals(name))
			{
                System.out.println("Passenger name: " + name);
                System.out.println("Seat number: " + (i+1) + (char)('A'+j));
                return;
            }
        }
    }
    System.out.println("Passenger not found. Please try again.");
}
}