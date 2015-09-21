package nl.brickworks.charactersheet.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import nl.brickworks.charactersheet.character.Character;
import nl.brickworks.charactersheet.dao.CharacterDAO;

@Path("/characters")
public class CharacterController {

    @GET
    @Path("/{id}")
    @Produces("text/plain")
    public String getCharacter(@PathParam("id") final String id) {

        CharacterDAO dao = new CharacterDAO();
        
        Character character = dao.fetch(id);
        dao.create(character);
        
        return "Character " + character.getName() + " fetched from database.";

    }

}
