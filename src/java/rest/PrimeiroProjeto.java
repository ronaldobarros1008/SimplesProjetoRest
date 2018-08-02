package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/primeiro")
public class PrimeiroProjeto {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String primeiro(){
        return "Meu primeiro Webservice REST Manes!!!";
    }
    
}
