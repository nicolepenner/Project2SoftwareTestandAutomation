package info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TaskService {
	
	private ArrayList<Task> tasks;
	
	public TaskService() {
		tasks = new ArrayList<>();
	}

	
	//function too add a new task
	public boolean addTask(Task task) {
		boolean present = false;
			for(Task object1 : tasks) {
				if(object1.equals(task)) {
					present = true;
			}
		}
		if (!present) {
			tasks.add(task);
			return true;
		} else {
			System.out.println("Task already present");
			return false;
		}
	}
	
	//function to update task from task ID
	public boolean updateTask(String taskId, String taskName, String taskDesc) {
		for (Task object2 : tasks) {
			if (object2.getTaskId().equals(taskId)) {
				if (!taskName.equals(""))
					object2.setTaskName(taskName);
				if (!taskDesc.equals(""))
					object2.setTaskDesc(taskDesc);
				System.out.println("Task updated");
				return true;
			}
		}
		System.out.println("Task not found");
		return false;
	}
	
	//function to delete task from a task ID
	public boolean remove(String taskId) {
		for (Task object3 : tasks) {
			if (object3.getTaskId().equals(taskId)) {
				tasks.remove(object3);
				return true;
			}
		}
		return false;
	}
}
