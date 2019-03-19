package org.occ.p3.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="work")
public class Work implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(generator="gen_work", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="gen_work", allocationSize=1)
	private Integer id;
	
	private String title;
	
	private String author;
	
	private Integer publicationDate;
	
	private String bookDescription;

	@ManyToOne
	private Library library;

	@OneToMany(fetch = FetchType.EAGER)
	//@LazyCollection(FALSE)
	private List<Book> booksList;

	public Work() {
		super();
	}

	public Work(String title, String author){
		this.title = title;
		this.author = author;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Integer publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

}
