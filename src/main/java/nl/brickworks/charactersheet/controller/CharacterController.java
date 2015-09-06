package nl.brickworks.charactersheet.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/characters")
public class CharacterController {

    @GET
    @Path("/fetch/{id}")
    @Produces("text/plain")
    public String getCharacter(@PathParam("id") final String id) {

        return "Character " + id + " not found.";

    }

}
