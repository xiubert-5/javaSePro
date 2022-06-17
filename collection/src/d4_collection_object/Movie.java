package d4_collection_object;

public class Movie {
    private String name;
    private String actor;
    private String score;

    public Movie(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Movie(String name, String actor, String score) {
        this.name = name;
        this.actor = actor;
        this.score = score;
    }
}
