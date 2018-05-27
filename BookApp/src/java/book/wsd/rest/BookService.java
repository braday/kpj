package book.wsd.rest;

import book.wsd.BookApplication;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBException;

@Path("/bookApp")
public class BookService {

    @Context
    private ServletContext application;

    private BookApplication getBookApp() throws JAXBException, IOException, Exception {
        // The web server can handle requests from different clients in parallel.
        // These are called "threads".
        //
        // We do NOT want other threads to manipulate the application object at the same
        // time that we are manipulating it, otherwise bad things could happen.
        //
        // The "synchronized" keyword is used to lock the application object while
        // we're manpulating it.
        synchronized (application) {
            BookApplication bookApp = (BookApplication) application.getAttribute("bookApp");
            if (bookApp == null) {
                bookApp = new BookApplication();
                bookApp.setFilePath(application.getRealPath("WEB-INF/books.xml"));
                application.setAttribute("bookApp", bookApp);
            }
            return bookApp;
        }
    }

    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World";
    }

}

//    @Path("users")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Users getUsers() throws JAXBException, IOException, Exception {
//        return getDiaryApp().getUsers();
//    }
