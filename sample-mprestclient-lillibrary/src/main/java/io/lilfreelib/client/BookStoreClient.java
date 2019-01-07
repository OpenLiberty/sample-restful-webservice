package io.lilfreelib.client;

import java.util.Collection;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.lilfreelib.server.Book;

@Path("/books")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface BookStoreClient {
	@GET
	public Book[] listBooks();
	
	@Path("/{id}")
	@DELETE
	public Book takeBook(@PathParam("id") String bookId);
	
	@POST
	public void depositBook(Book newBook);
	
	@Path("/{id}")
	@PUT
	public void updateBook(@PathParam("id") String bookId, Book book);
}
