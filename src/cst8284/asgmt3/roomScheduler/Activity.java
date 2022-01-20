package cst8284.asgmt3.roomScheduler;

public class Activity implements java.io.Serializable{
	private String category, description;
	
	public Activity(String category, String description) {
		setCategory(category); setDescription(description);	
	}
	
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	
	public String getCategory() {return category;}
	public void setCategory(String category) {this.category = category;}
	
	@Override
	public String toString() {
		return  "Event: " + getCategory() + "\n" + 
			((getDescription()!="")?"Description: " + getDescription():"") + "\n";
	}
}
