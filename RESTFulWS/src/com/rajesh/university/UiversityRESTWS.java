package com.rajesh.university;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/university")
public class UiversityRESTWS {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityInfo() {

		return "<html> " + "<title>" + "University Information" + "</title>"
        + "<body><h1>" + "This is just the beginning" + "</body></h1>" + "</html>";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getXMLUniversityInfo() {
		return "Name-Indian University";
	}
	
	@PUT
	@Path("{studentRollNo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUniversityInfo(@PathParam("studentRollNo") String studentRollNo) {

		
	// CODE TO UPDATE STUDENT RECORD USING STUDENT ROLL NO
	
		return "Done Successfully!!";
	}
}
