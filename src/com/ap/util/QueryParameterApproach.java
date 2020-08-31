package com.ap.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/queryparam")
public class QueryParameterApproach {

	@Path("/query")//{parametertype}
	@GET
	@Produces(MediaType.APPLICATION_XML)
	//URL: http://localhost:8080/02ResaleTicketWS/rs/queryparam/query?ticket_type=movie&date_=20-2-20202&time_=10&name=URI&location=KOP&price=240
	public String insertQuery(
				@QueryParam("ticket_type") String ticketType,
				@QueryParam("date_") String date,
				@QueryParam("time_") String time,
				@QueryParam("name") String name,
				@QueryParam("location") String location,
				@QueryParam("price") String price
				
			){
			if( ticketType != null && date != null && time != null && name != null && location != null && price != null ){
				System.out.println(ticketType +"\t"+date +"\t"+time +"\t"+name +"\t"+location +"\t"+price +"\t");
				return "<result><status>Success</status></result>";
			}else{
				return "<result><status>Fail</status></result>";
			}
	}
	
}
