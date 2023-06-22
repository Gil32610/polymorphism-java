import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Adventure is a subclass of Movie
//        Movie theMovie = Movie.getMovie("SciFi", "Star Wars");
        //it is based on the runtime object and not the variable type
//        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type:");
            System.out.printf("(A for %s, C for %s, S for %s, or Q to quit)%n","Adventure", "Comedy","SciFi");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter movie title:");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();

            //Allows the use of generic code
            //factory method handles it all
            //Parent class is the base for the factory method
        }
    }
}
