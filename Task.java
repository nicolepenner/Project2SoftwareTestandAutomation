package info;

public class Task {
	private String taskId;
	private String taskName;
	private String taskDesc;
	
	public Task(String taskId, String taskName, String taskDesc) {
		
		//unique task ID String that cannot be null or longer than 10 characters, not update-able
		//name String field that cannot be null or longer than 20 characters
		//description String field that cannot be null or longer than 50 characters
		
		if(taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid task ID");
		}
		if(taskName == null || taskName.length() > 20) {
			throw new IllegalArgumentException("Invalid task name");
		}
		if(taskDesc == null || taskDesc.length() > 50) {
			throw new IllegalArgumentException("Invalid task description");
		}
		
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDesc = taskDesc;
	}
	
	//setters & getters for variables
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}
	
}
