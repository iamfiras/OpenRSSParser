package openrssparser.models.common;

import java.util.Date;
import java.util.List;

import openrssparser.models.common.interfaces.IEntry;

public class Entry implements IEntry {

	private IEntry initial;

	private List<Person> authors;
	private List<Person> contributors;
	private List<String> categories;
	private String title;
	private String url;
	private String description;
	private Date publicationDate;
	private Date modificationDate;

	public IEntry getInitial() {
		return initial;
	}

	public void setInitial(IEntry initial) {
		this.initial = initial;
	}

	public List<Person> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Person> authors) {
		this.authors = authors;
	}

	public List<Person> getContributors() {
		return contributors;
	}

	public void setContributors(List<Person> contributors) {
		this.contributors = contributors;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

}
