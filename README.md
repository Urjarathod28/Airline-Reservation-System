# Airline-Reservation-System

Login Functionality: The program begins with a simple login system where the user is prompted to enter a username and password. If the entered credentials match the predefined values ("Urja" and "1234" respectively), the user gains access to the system.

Menu Options: After successful login, the program displays a menu with several options:

Add user details: Allows users to input their personal information like name, age, gender, email, and phone number.

Register a flight: Enables the registration of flight details including flight number, departure city, arrival city, and departure time.
Book a ticket and calculate charges: Allows users to book tickets by specifying the number of tickets, passenger names, email, phone number, and seat class. It calculates the total charges based on the seat class and the number of tickets booked.

Print reserved seats: Prints the seats that have been reserved along with the corresponding passenger names.

Print available seats: Displays the available seats that have not been booked yet.

Print occupied seats: Shows the seats that have been booked by passengers.

Print ticket: Prints the ticket details for a specific passenger, including their name and seat number.

Data Storage: The reservation information such as user details, flight details, and booked tickets are stored using arrays.
Seat Reservation Logic: Seats are represented as a two-dimensional array. When a ticket is booked, the program assigns a seat to the passenger and marks it as reserved in the array.

Validation: The program performs some basic validations such as checking the availability of seats before booking, ensuring the correctness of user input (e.g., valid phone numbers), and handling invalid menu choices.

Looping Structure: The program utilizes a do-while loop to continuously prompt the user for their choice until they decide to exit the 
program
