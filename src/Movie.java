public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
//Returns an instance of Movie or any of its subclasses
    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A'-> new Adventure(title);
            case 'C'-> new Comedy(title);
            case 'S'-> new SciFi(title);
            default -> new Movie(title);
        };
    }
    //This is the factory method!
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Confusing scene", "Psychedelic", "Parade");
        //repeats this line 3 times and adds 3 new lines so that every string parameter gets printed out on a diff line
    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Something funny", "Even funnier", "Funny ending?");
        //repeats this line 3 times and adds 3 new lines so that every string parameter gets printed out on a diff line
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy");
    }


}

class SciFi extends Movie {
    public SciFi(String title) {
        super(title);
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Aliens", "Tech", "Catastrophe");
        //repeats this line 3 times and adds 3 new lines so that every string parameter gets printed out on a diff line
    }
    public void watchSciFi(){
        System.out.println("Watching an SciFi");
    }
}