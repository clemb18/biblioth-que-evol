package org.occ.p3.controler;

import org.occ.p3.client.endpoint.Book;
import org.occ.p3.client.endpoint.BookWeb;
import org.occ.p3.client.endpoint.BookWs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class BookControler {


	BookWeb bookWsService = new BookWeb();
	BookWs bookWs = bookWsService.getBookWsPort();

	@RequestMapping(value = "/book/{bookId}", method = RequestMethod.GET)

	public @ResponseBody
	Book sayHello (@PathVariable Integer bookId) {
		return bookWs.getBookById(bookId);
	}


}


	
	
	

