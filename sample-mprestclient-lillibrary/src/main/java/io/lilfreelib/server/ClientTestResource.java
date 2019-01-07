package io.lilfreelib.server;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Application;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import java.util.HashSet;
import java.util.Set;


import org.eclipse.microprofile.rest.client.RestClientBuilder;

import io.lilfreelib.client.BookStoreClient;

@Path ("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClientTestResource  extends Application{
	
	@GET
	public Response test() {
		// invoke the client
		ResponseBuilder builder = Response.ok();
		
		try {
			
			URI uri = new URI("http://localhost:9080/v1");
			BookStoreClient client = RestClientBuilder.newBuilder()
					.baseUri(uri)
					.build(BookStoreClient.class);
			Book[] books = client.listBooks();
			builder = Response.ok(books);
			
			System.out.println("Books:");
			for (Book b : books) {
				System.out.println(b.getTitle());
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
			builder = Response.serverError();
		}
		
		return builder.build();
	}

}
