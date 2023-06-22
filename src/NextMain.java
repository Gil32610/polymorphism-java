public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();
        //The compiler cannot figure out if the method will return a Adventure type class
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        //Casting is needed because the compiler won't figure out the return type without executing the code
        jaws.watchMovie();


        //The compiler assumes this is an object and it has access to any object functionalities
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy)comedy;
        comedyMovie.watchComedy();
        //Compiler cannot find watchMovie method on the Object class
        //Casting is once again necessary
        //When a method is exclusive of a subclass the compiler only looks at the reference type
        //A cast to a more specific class is then needed

    //Local variable type inference
        //figures out what compile-time type
        //it infers that the type of the variable is a Movie
        /*
It can't be used in field declarations on a class.

It can't be used in method signatures,  either as a parameter type or a return type.

It can't be used without an assignment, because  the type can't be inferred in that case.

It can't be assigned a null literal, again  because a type can't be inferred in that case.
*/
        var airplane = Movie.getMovie("C", "Airplane");
        //Local Variable Type Inference.
        airplane.watchMovie();
//Testing the runtime type using instance of and class name
        Object unknownObject     =  Movie.getMovie("A", "Jaws");
        if(unknownObject.getClass().getSimpleName()=="Comedy"){
            Comedy c = (Comedy) unknownObject;
            //casts and assigns it to a local variable
            c.watchComedy();
        } else if (unknownObject instanceof  Adventure){
            ((Adventure)unknownObject).watchAdventure();
            //method chaining from a cast
        }else if(unknownObject instanceof SciFi syfy){
            //creates bound local variable of Class type if instance
            syfy.watchSciFi();
        }
    }
}
