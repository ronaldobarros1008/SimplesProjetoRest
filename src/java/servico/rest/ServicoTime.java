package servico.rest;

import agremicoes.Time;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/times")
public class ServicoTime {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Time> getTimes(){
        List<Time> times = new ArrayList <Time>();
            times.add(new Time(1, "Grêmio", "RS"));
            times.add(new Time(2, "Internacional", "RS"));
            times.add(new Time(3, "São Paulo", "SP"));
            times.add(new Time(4, "Flamengo", "RJ"));
        
        return times;
    }
    
}
