package com.company;

public class Main {
    public static void main(String[] args) {
        Passenger passenger=new Passenger(121,"Pranav","9040506070","pranav@gmail.com",
                "Gandhi nagar","Mumbai","Maharashtra");
        Flight flight=new Flight("se123","Air India",150,10);
        RegularTicket regularTicket=new RegularTicket("918171","MUM","CBE","01-06-2021",
                "01-06-2021","s15", (float) 4500.0,false,flight,passenger,"Foods");
        String hotelAddress="near church park,Gandhi nagar,Coimbatore";
        String[] locations={"India Gate","Shivaji Park","Marine Drive"};

        TouristTicket touristTicket=new TouristTicket("102030","MUM","CBE","01-06-2021",
                "01-06-2021","H101", 8200.0f,false,flight,passenger,hotelAddress,locations);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println("PNR NO:"+ticket.getPnr());     //Prints the PNR number from the ticket class
    }
}
