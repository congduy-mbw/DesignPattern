package FecadePattern;

public class TravelFacade {
	private final CarRental carRental;
	private final FlightBooking flightBooking;
	private final HotelBooking hotelBooking;
	
	public TravelFacade(CarRental carRental, FlightBooking flightBooking, HotelBooking hotelBooking) {
		this.carRental = carRental;
		this.flightBooking = flightBooking;
		this.hotelBooking = hotelBooking;
	}
	
	public void bookCompleteTrip() {
		this.carRental.hiring();
		this.flightBooking.booking();
		this.hotelBooking.booking();
	}
}
