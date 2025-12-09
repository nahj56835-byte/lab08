package isp2;
public class MainISP {
    public static void main(String[] args) {
        LoginScreen login = new LoginScreen();
        login.showText("Welcome");
        login.handleUserInput("user=an;pass=123");

        TutorialScreen t = new TutorialScreen();
        t.showText("How to use app");
        t.showImage("/img/step1.png");
        t.playVideo("/video/intro.mp4");
    }
}