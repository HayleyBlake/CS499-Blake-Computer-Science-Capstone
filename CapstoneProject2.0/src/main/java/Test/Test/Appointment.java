package Test.Test;
import java.sql.Time;
import java.util.*;
import org.bson.types.ObjectId;

public class Appointment {	
	//Creating variables for appointment, date, time, and description
	//TODO: Change the appointment Time variable from string to time?
	private final ObjectId appointmentID;
	private String appointmentTitle; 
	private Date appointmentDate;
	private Time appointmentTime;
	private String appointmentDescription;
		
		public Appointment (ObjectId appointmentID, String appointmentTitle, Date appointmentDate, Time appointmentTime, String appointmentDescription) {
			//appointmentID cannot be longer than 10 characters nor be null and shall not be updated
			if (appointmentID == null) {
				throw new IllegalArgumentException("Invalid Appointment ID");
			}
			
			//date - no past or null
			if (appointmentDate == null || appointmentDate.before(new Date()) ) {
				throw new IllegalArgumentException("Invalid Date");
			}
			
			//description cannot be longer than 50 characters nor be null.
			if (appointmentDescription == null || appointmentDescription.length() > 50 ) {
				throw new IllegalArgumentException("Invalid Description");
			}
			
			
			this.appointmentID = appointmentID;
			this.appointmentTitle = appointmentTitle;
			this.appointmentDate = appointmentDate;
			this.appointmentTime = appointmentTime;
			this.appointmentDescription = appointmentDescription;
		}

		public ObjectId getAppointmentID() {
			return appointmentID;
		}
		
		public String getAppointmentTitle() {
			return appointmentTitle;
		}
		
		public String getAppointmentDate() {
			return appointmentDate.toString();
		}
		
		//TODO: Change to correct variable 
		public Time getAppointmentTime() {
			return appointmentTime;
		}
		
		public String getAppointmentDescription() {
			return appointmentDescription;
		}

		public void setAppointmentTitle(String appointmentTitle) {
			if (appointmentTitle == null) {
				throw new IllegalArgumentException("Please enter title for appointment.");
				}
			this.appointmentTitle = appointmentTitle;
		}

		public void setAppointmentDate(Date appointmentDate) {
			if (appointmentDate == null || appointmentDate.before(new Date())) {
				throw new IllegalArgumentException("Invalid Date");
				}
			this.appointmentDate = appointmentDate;
		}
		
		public void setAppointmentTime(Time appointmentTime) {
			if (appointmentTime == null) {
				throw new IllegalArgumentException("Time cannot be null");
				}
			this.appointmentTime = appointmentTime;
		}

		public void setAppointmentDescription(String AppointmentDescription) {
			if (AppointmentDescription == null || AppointmentDescription.length() > 50 ) {
				throw new IllegalArgumentException("Invalid Description");
			}
			this.appointmentDescription = AppointmentDescription;
		}

}