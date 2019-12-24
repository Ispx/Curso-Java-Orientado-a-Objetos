package ProjetoHotel;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Reservation {
	private Integer roomNumber;
	private Date checkin ;
	private Date checkout;


	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	public Reservation() {
		
	}
	
	public void Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;

	}
	
	public int Duration() {
		return (int) (checkout.getTime() - checkin.getTime())/(3600*1000)/24;
	}
	
	@Override
	public String toString() {
		return "Reservation: " + "Room " + getRoomNumber() + ", " + "Check-in: " + sdf.format(getCheckin()) + ", " + "Check-out: " + sdf.format(getCheckout()) + ", " + Duration() + " nights";
	}	
	
	public void updataDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
		
	}
	
	public Integer getRoomNumber() {
		return this.roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckin() {
		return this.checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return this.checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	
	
	
}
