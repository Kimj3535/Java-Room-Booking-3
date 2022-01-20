package cst8284.asgmt3.roomScheduler;

public class RoomBooking implements java.io.Serializable {
	public static final long serialVersionUID = 1L;
	private ContactInfo contactInfo;
	private Activity activity;
	private TimeBlock timeBlock;
	
	public RoomBooking(ContactInfo contactInfo, Activity activity, TimeBlock timeBlock) {
		setContactInfo(contactInfo); setActivity(activity); setTimeBlock(timeBlock);
	}
	
	public RoomBooking() {}

	public void setContactInfo(ContactInfo contactInfo) {this.contactInfo = contactInfo;}
	public ContactInfo getContactInfo() {return contactInfo;}

	public void setActivity(Activity activity) {this.activity = activity;}
	public Activity getActivity() {return activity;}

	public void setTimeBlock(TimeBlock timeBlock) {this.timeBlock = timeBlock;}
	public TimeBlock getTimeBlock() {return timeBlock;}

	@Override public String toString() {
		return (getTimeBlock().toString() + getActivity().toString() +  getContactInfo().toString());
	}

}
