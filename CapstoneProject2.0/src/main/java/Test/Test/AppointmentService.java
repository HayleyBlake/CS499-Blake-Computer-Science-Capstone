package Test.Test;
import java.util.ArrayList;
import java.util.Map;

public class AppointmentService {
	
	//Creates the private map appointments to be used to store the appointment ID, date, and description
	private Appointment[] appointments;
	
	public AppointmentService() {
		this.appointments = new HashMap<>();
	}
	
	//Add appointments with a unique ID.
	public void addAppointments(Appointment appointment){
		if (appointments.containsKey(appointment.getAppointmentID())) {
			throw new IllegalArgumentException("Appointment already exists. Please try again.");
		}
		else {
			appointments.put(appointment.getAppointmentID(), appointment);
		}
	}

	//Delete appointments per appointment ID.
	public void deleteAppointments(String appointmentID){
		if (!appointments.containsKey(appointmentID)) {
			throw new IllegalArgumentException("No appointments with that ID exists. Please try again.");
		}
		else {
			appointments.remove(appointmentID);
		}
	}
	
	//Return the appointment ID to make sure that it went thru
	public Appointment getAppointment(String appointmentID) {
		return appointments.get(appointmentID);
	}
	
	
}
