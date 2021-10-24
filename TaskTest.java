package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import info.Task;

class TaskTest {
	
	@Test
	void testTask() {
		Task task = new Task("00001", "Name", "Task Description");
		assertTrue(task.getTaskId().equals("00001"));
		assertTrue(task.getTaskName().equals("Name"));
		assertTrue(task.getTaskDesc().equals("Task Description"));
	}
	
	@Test
	void testTaskIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("00001000011", "Name", "Task Description");
	}); }	
	
	@Test
	void testTaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("00001", "The name of this task is too long!", "Task Description");
		}); }	
		
	@Test
	void testTaskDescTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("00001", "Name", "The description of the task is too long. It will throw an exception!");
		}); }	
	
	@Test
	void testTaskIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Name", "Task Description");
		}); }	
	
	@Test
	void testTaskNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("00001", null, "Task Description");
		}); }	
	
	@Test
	void testTaskDescNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("00001", "Name", null);
		}); }	
}
