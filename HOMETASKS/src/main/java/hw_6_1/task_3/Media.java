package hw_6_1.task_3;

public class Media extends Music{

    private String artist;

    public Media(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public String play (){
        return "Music is playing " + "[" + artist + "]" + " : " + "[" + getTitle() + "]";
    }

}
