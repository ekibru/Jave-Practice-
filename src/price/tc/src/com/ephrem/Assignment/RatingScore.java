package price.tc.src.com.ephrem.Assignment;

public class RatingScore {
    private String description;
    private String max;
    private String rating;

    public void setDescription(String newDescription,String Max) {
        this.description = newDescription;
        this.max= Max;
    }

    public void setRating(String boxOfficeRating) { this.rating = boxOfficeRating; }
    public int maxRating(){ return maxRating(); }
    public String getRating(){ return rating; }
    public String display(){
        return   rating+" "+max;
    }
}
