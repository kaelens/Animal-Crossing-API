package com.kaelen.restapi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("character")
public class CharacterResource {

		CharacterList repo = new CharacterList();
		
		@GET
		@Path("/{name}")
		@Produces(MediaType.APPLICATION_JSON)
		public Character getCharacter(@PathParam("name") String name) {
			return repo.getCharacter(name);
		}
}
