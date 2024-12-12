package pkg;

public class Movie{
    String movieName;
    double rating;
    int numrating;
    int revenue;
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numrating = 33;
        revenue = 623357910;
    }
    public Movie(String m, double r, int n, int re){
        movieName = m;
        rating = r;
        numrating = n;
        revenue = re;
    }
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numrating);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }
    public String getMovieName(){
        return movieName;
    }
    public double getRating(){
        return rating;
    }
    public int getNumRating(){
        return numrating;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double r){
       
        double avg = numrating;
        avg = avg * rating;
        numrating++;
        avg = avg + r;
        rating = avg/numrating;
    }
    public boolean compareRatings(Movie c){
        return rating > c.getRating();
    }
    public int revenueToString(){
        return getRevenue();
    }
    public Movie pirateMovie(){
        return new Movie(movieName, rating, numrating, revenue);
    }
}
