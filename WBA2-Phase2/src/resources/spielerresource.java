package resources;

import java.io.File;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import jaxb.SpielerType;



@Path("recources/accounts/")
public class spielerresource {
	
	
	public SpielerType spieler = new SpielerType();
	
	public spielerresource(SpielerType spieler) {
			super();
			this.spieler = spieler;
	}
		
		
		
		@GET
		@Path("{id}")
		@Produces(MediaType.APPLICATION_XML)
		public SpielerType getSpielerInfo(@PathParam("id") String telefonnummer) {
			return this.spieler;
		
	}

}
