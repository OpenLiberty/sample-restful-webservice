package io.lilfreelib.server;

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

@Path("/books")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

	@GET
	public Collection<Book> listBooks() {
		return BookStore.getBookStore().viewAllBooks();
	}
	
	@Path("/{id}")
	@DELETE
	public Book takeBook(@PathParam("id") String bookId) {
		return BookStore.getBookStore().takeBook(bookId);
	}
	
	@POST
	public void depositBook(Book newBook) {
		BookStore.getBookStore().depositBook(newBook);
	}
	
	@Path("/{id}")
	@PUT
	public void updateBook(@PathParam("id") String bookId, Book book) {
		BookStore.getBookStore().updateBook(bookId, book);
	}
}

