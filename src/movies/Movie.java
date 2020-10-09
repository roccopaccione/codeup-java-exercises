package movies;

public class Movie {

    private String name;
    private String category;
        // Create Movies List
       public Movie(String movieName, String movieCategory){
           this.name = movieName;
           this.category = movieCategory;
        }

        public String getName(){
           return this.name;
        }
        public String getCategory(){
            return this.category;
        }

        public void setName(String movieName){
           this.name = movieName;
        }

        public void setCategory(String movieCategory){
           this.category = movieCategory;
        }

}



