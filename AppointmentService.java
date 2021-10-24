package info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppointmentService {
	
	//create ArrayList To store appointments
	private ArrayList<Appointment> appointments;
	public AppointmentService() {
		appointments = new ArrayList<>();
	}
	
	//function to add a new appointment ID
	public boolean addAppt(Appointment appointment) {
		boolean present = false;
			for(Appointment appt1 : appointments) {
				if(appt1.equals(appointment)) {
					present = true;
				}
			}
			if (!present) {
				appointments.add(appointment);
				return true;
			} else {
				System.out.println("Appointment is already present");
				return false;
			}
	}
	
	
	//function to delete an appointment by ID
	public boolean deleteAppt(String apptId) {
		for (Appointment appt : appointments) {
			if (appt.getApptId().equals(apptId)) {
				appointments.remove(appt);
				return true;
			}
		}
		return false;
	}
}
