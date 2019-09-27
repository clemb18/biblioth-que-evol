package org.occ.bibliot.controler;

import org.occ.p3.client.Book;
import org.occ.p3.client.BookWeb;
import org.occ.p3.client.BookWs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class BookControler {


	BookWeb bookWsService = new BookWeb();
	BookWs bookWs;

	public BookControler() {
		this.bookWs = this.bookWsService.getBookWsPort();
	}

	@RequestMapping(value = {"/book/{bookId}"}, method = {RequestMethod.GET})

	@ResponseBody
	public Book sayHello (@PathVariable Integer bookId) {
		return bookWs.getBookById(bookId);
	}


}


	
	
	
