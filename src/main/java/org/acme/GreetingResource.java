package org.acme;

import io.quarkus.runtime.Startup;
import org.coollibrary.DoCoolStuff;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Startup
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return DoCoolStuff.sayHello();
    }
}
