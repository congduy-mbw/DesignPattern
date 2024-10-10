package FecadePattern;

public class FecadeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRental carRental = new CarRentalImp();
		FlightBooking flightBooking = new FlightBookingImp();
		HotelBooking hotelBooking = new HotelBookingImp();
		TravelFacade travelFacade = new TravelFacade(carRental, flightBooking, hotelBooking);
		travelFacade.bookCompleteTrip();
	}

}
