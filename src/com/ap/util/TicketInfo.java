package com.ap.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ticketinfo")
public class TicketInfo {

	@Path("/insertpath/{ticket_type}/{date_}/{time_}/{name}/{location}/{price}")//{parametertype}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	//URL: http://localhost:8080/02ResaleTicketWS/rs/ticketinfo/insertpath/movie/31-08-2020/12:24/Uri/Pune/240
	public String receiveTicketInfo(
				@PathParam("ticket_type") String ticketType,
				@PathParam("date_") String date,
				@PathParam("time_") String time,
				@PathParam("name") String name,
				@PathParam("location") String location,
				@PathParam("price") String price
				
			){
			if( ticketType != null && date != null && time != null && name != null && location != null && price != null ){
				System.out.println(ticketType +"\t"+date +"\t"+time +"\t"+name +"\t"+location +"\t"+price +"\t");
				return "Success";
			}else{
				return "Fail";
			}
	}
	
}
