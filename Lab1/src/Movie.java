// Movie.java
// Chris Gala 64338761
// Shashank Reddy 64446601

public class Movie
{
	private int duration_min;
	private int release_year;
	private double price_USD;
	private String title;
	private Director director;


	/* Constructor */
	public Movie()
	{

	}


	public Movie(int duration_min, int release_year, int price_USD,
		String title, Director director)
	{
		this.duration_min = duration_min;
		this.release_year = release_year;
		this.price_USD = price_USD;
		this.title = title;
		this.director = director;
	}


	/* Copy Constructor */
	public Movie(Movie movie)
	{
		this.duration_min = movie.duration_min;
		this.release_year = movie.release_year;
		this.price_USD = movie.price_USD;
		this.title = movie.title;
		this.director = movie.director;
	}


	/* Getters */
	public int getDurationMin()
	{
		return this.duration_min;
	}


	public int getReleaseYear()
	{
		return this.release_year;
	}


	public double getPriceUSD()
	{
		return this.price_USD;
	}


	public String getTitle()
	{
		return this.title;
	}


	public Director getDirector()
	{
		return this.director;
	}


	/* Setters */
	public void setDurationInMinutes(int duration_min)
	{
		this.duration_min = duration_min;
	}


	public void setYearReleased(int release_year)
	{
		this.release_year = release_year;
	}


	public void setPrice(double price_USD)
	{
		this.price_USD = price_USD;
	}


	public void setTitle(String title)
	{
		this.title = title;
	}


	public void setDirector(Director director)
	{
		this.director = director;
	}


	public void setDirector(String first_name, String last_name, int birth_year,
		int num_of_directed_movies)
	{
		this.director = new Director(first_name, last_name, birth_year,
			num_of_directed_movies);
	}


	@Override
	public String toString()
	{
		return "Title: " + title + "\n" + "Published in: " + release_year + "\n"
			+ "Price: $" + price_USD + "\n" + "Written by: "
			+ director.getFirstName() + " " + director.getLastName()
			+ ", who was born in " + director.getBirthYear() + " and has "
			+ director.getNumberOfDirectedFilms() + " releases";
	}

}
