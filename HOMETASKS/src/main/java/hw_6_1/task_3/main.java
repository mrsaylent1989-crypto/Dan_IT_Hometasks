package hw_6_1.task_3;

public class main {
    public static void main(String[] args) {

        Media media = new Media("The Phoenix", 4, "Lindsey Stirling");
        Video video = new Video("in between", 6, "1920x1080");

        System.out.println(media.play());
        System.out.println(video.play());
    }
}
