package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import info.Task;
import info.TaskService;

class TaskServiceTest {
	
	//add task successful test
	@Test
	public void AddTask() {
		TaskService newTask = new TaskService();
		
		//new task
		Task new1 = new Task("T0001", "Task1", "Description of Task1");
		
		//boolean true
		assertEquals(true, newTask.addTask(new1));
	}
	
	@Test
	//add task failed test
	public void AddTaskFail() {
		TaskService newTask = new TaskService();
		
		//new task
		Task new1 = new Task("T0001", "Task1", "Description of Task1");
		
		//fail task add
		assertEquals(true, newTask.addTask(new1));
		assertEquals(false, newTask.addTask(new1));
	}
	
	//update task test
	@Test
	public void UpdateTask() {
		TaskService newTask = new TaskService();
		
		//new task
		Task new1 = new Task("T0001", "Task1", "Description of Task1");
		
		//update task success
		assertEquals(true, newTask.addTask(new1));
		assertEquals(true, newTask.updateTask("T0001", "Task01", "Update Description of Task1"));
	}
	
	//update task fail test
	@Test
	public void UpdateTaskFail() {
		TaskService newTask = new TaskService();
		
		//new task
		Task new1 = new Task("T0001", "Task1", "Description of Task1");
		
		//update task failure
		assertEquals(true, newTask.addTask(new1));
		assertEquals(false, newTask.updateTask("T0002", "Task2", "Description of Task2"));
		assertEquals(true, newTask.updateTask("T0001", "Task01", "Update Description of Task1"));
	}
	
	//delete task test
	@Test
	public void DeleteTask() {
		TaskService newTask = new TaskService();
		
		//new task
		Task new1 = new Task("T0001", "Task1", "Description of Task1");
		
		//delete task success
		assertEquals(true, newTask.addTask(new1));
		assertEquals(true, newTask.remove("T0001"));
	}
	
	//delete task test failure
	@Test
	public void DeleteTaskFail() {
		TaskService newTask = new TaskService();
		
		//new task
		Task new1 = new Task("T0001", "Task1", "Description of Task1");
		
		//delete task success
		assertEquals(true, newTask.addTask(new1));
		assertEquals(true, newTask.remove("T0001"));
		assertEquals(false, newTask.remove("T0002"));
	}

	
	

}
