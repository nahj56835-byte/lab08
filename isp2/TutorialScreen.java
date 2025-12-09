package isp2;

public class TutorialScreen implements TextScreen, MediaSreen {
    @Override
    public void showText(String text) {
        System.out.println("TUTORIAL: " + text);
    }

    @Override
    public void showImage(String path) {
        System.out.println("Showing image: " + path);
    }

    @Override
    public void playVideo(String path) {
        System.out.println("Playing video: " + path);
    }


    
}
