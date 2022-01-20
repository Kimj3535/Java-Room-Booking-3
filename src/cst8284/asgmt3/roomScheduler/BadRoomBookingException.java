package cst8284.asgmt3.roomScheduler;

public class BadRoomBookingException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String header;
	public String message;
	
		public BadRoomBookingException() {
		this.header.equals("Bad room rooking entered");
		this.message.equals("“Please try again");
		setHeader(header);
}
  
	
public BadRoomBookingException(String header, String message ) {
	   super(message);
	   this.header = header;
	   this.message = message;
	   
   }
	   public void setHeader(String header) {
		   this.header = header;   
}
	   public String getheader() {
		   return header;
	   }
}