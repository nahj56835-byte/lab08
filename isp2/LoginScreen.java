package isp2;

public class LoginScreen implements InteractiveScreen, TextScreen {
    @Override
    public void handleUserInput(String input) {
        System.out.println("Handling login input: " + input);
    }

    @Override
    public void showText(String text) {
        System.out.println("LOGIN: " + text);
    }


    
}
