package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import info.Appointment;

class AppointmentTest {
	
	
	LocalDate today = LocalDate.now();
	

	
	@Test
	void appointmentTest() {
		Appointment appointment = new Appointment("A0001", LocalDate.of(2021, 12, 12), "Appointment Descriptiont");
		assertTrue(appointment.getApptId().equals("A0001"));
		assertTrue(appointment.getApptDate().equals(LocalDate.of(2021, 12, 12)));
		assertTrue(appointment.getApptDesc().equals("Appointment Description"));
	}
	
	@Test
	void testApptIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("A00000000001", LocalDate.of(2021, 12, 12), "Appointment Description");
		}); }
	
	@Test
	void testApptDateBeforeCurrent() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("A0001", LocalDate.of(2021, 02, 02), "Appointment Description");
		}); }
	

	@Test
	void testApptDescTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("A0001", LocalDate.of(2021, 12, 12), "The description of this appointment is too long, it will throw an exception!");
		}); }
	
	@Test
	void testApptIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, LocalDate.of(2021, 12, 12), "Appointment A0001 Description");
		}); }
	
	@Test
	void testApptDescNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("A0001", LocalDate.of(2021, 12, 12), null);
		}); }
	
	@Test
	void testApptDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("A0001", null, "Appointment A0001 Description");
		}); } 
	
}

