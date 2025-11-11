package hw_6_1.task_3;

public class Video extends Music{

    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    public String play(){
        return "Playing video" +  "[" + getTitle() + "]" + " in resolution " + "[" + resolution + "]";
    }
}
