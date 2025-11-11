package hw_6_1.task_3;

public class Music {
    private String title;
    private int duration;

    public Music() {
    }

    public String play (){
        return "Multimedia playback";
    }

    public Music(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
