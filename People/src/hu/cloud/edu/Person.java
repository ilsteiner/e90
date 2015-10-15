package hu.cloud.edu;

public class Person {
	protected String firstName;
	protected String lastName;
	protected String movie;
	protected String imageURL;
	protected String resumeURL;
	
	public Person(String firstName, String lastName, String movie, String imageURL, String resumeURL) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.movie = movie;
		this.imageURL = imageURL;
		this.resumeURL = resumeURL;
	}
}
