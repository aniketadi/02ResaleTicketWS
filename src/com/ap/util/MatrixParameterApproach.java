package com.ap.util;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/matrixparam")
public class MatrixParameterApproach {

	@Path("/matrix")//{parametertype}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8080/02ResaleTicketWS/rs/matrixparam/matrix;ticket_type=movie;date_=20-2-20202;time_=10;name=URI;location=KOP;price=240
		public String matrixInsertQuery(
				@MatrixParam("ticket_type") String ticketType,
				@MatrixParam("date_") String date,
				@MatrixParam("time_") String time,
				@MatrixParam("name") String name,
				@MatrixParam("location") String location,
				@MatrixParam("price") String price
				
			){
			if( ticketType != null && date != null && time != null && name != null && location != null && price != null ){
				System.out.println(ticketType +"\t"+date +"\t"+time +"\t"+name +"\t"+location +"\t"+price +"\t");
				return "{\"status\":\"success\"}";
			}else{
				return "{\"status\":\"fail\"}";
			}
	}
	
}
