package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import info.Appointment;
import info.AppointmentService;

class AppointmentServiceTest {
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void AddAppt() {
		AppointmentService newAppt = new AppointmentService();
		
		//new task
		Appointment new1 = new Appointment("A0001", LocalDate.of(2021, 12, 12), "Appointment Description");
		
		//boolean true
		assertEquals(true, newAppt.addAppt(new1));
	}
	
	@Test
	//add appointment failed test
	public void AddApptFail() {
		AppointmentService newAppt = new AppointmentService();
		
		//new appointment
		Appointment new2 = new Appointment("A0001", LocalDate.of(2021, 12, 12), "Appointment Description");

		
		//fail appointment add
		assertEquals(true, newAppt.addAppt(new2));
		assertEquals(false, newAppt.addAppt(new2));
	}

	
	//delete appointment test
	@Test
	public void DeleteAppt() {
		AppointmentService newAppt = new AppointmentService();
		
		//new appointment
		Appointment new1 = new Appointment("A0001", LocalDate.of(2021, 12, 12), "Appointment Description");
		
		//delete appointment success
		assertEquals(true, newAppt.addAppt(new1));
		assertEquals(true, newAppt.addAppt(new1));
	}
	
	//delete appointment test fail
	@Test
	public void DeleteApptFail() {
		AppointmentService newAppt = new AppointmentService();
		
		//new appointment
		Appointment new1 = new Appointment("A0001", LocalDate.of(2021, 12, 12), "Appointment Description");
		
		//delete appointment success
		assertEquals(true, newAppt.addAppt(new1));
		assertEquals(true, newAppt.deleteAppt("A0001"));
		assertEquals(false, newAppt.deleteAppt("A0002"));
	}

	
	

}
