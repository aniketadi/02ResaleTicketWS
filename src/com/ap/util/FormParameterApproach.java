package com.ap.util;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/formparam")
public class FormParameterApproach {

	@Path("/form")//{parametertype}
	@POST
	@Produces(MediaType.TEXT_HTML)
	//URL: http://localhost:8080/02ResaleTicketWS/rs/queryparam/query?ticket_type=movie&date_=20-2-20202&time_=10&name=URI&location=KOP&price=240
	public String insertQuery(
				@FormParam("ticket_type") String ticketType,
				@FormParam("date_") String date,
				@FormParam("time_") String time,
				@FormParam("name") String name,
				@FormParam("location") String location,
				@FormParam("price") String price
				
			){
			if( ticketType != null && date != null && time != null && name != null && location != null && price != null ){
				System.out.println(ticketType +"\t"+date +"\t"+time +"\t"+name +"\t"+location +"\t"+price +"\t");
				return "<html><body bgcolor='green'><h1>Success</h1></body></html>";
			}else{
				return "<html><body bgcolor='red'><h1>Fail</h1></body></html>";
			}
	}
	
}
