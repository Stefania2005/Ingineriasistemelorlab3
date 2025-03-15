//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            PasswordMaker pm = PasswordMaker.getInstance("Stefania");
            System.out.println("Generated Password: " + pm.getPassword());
        PasswordMaker pm2 = PasswordMaker.getInstance("Nadia");
        System.out.println("Generated Password: " + pm2.getPassword());

        System.out.println("getInstance() was accessed " + PasswordMaker.getInstanceAccessCount() + " times.");

    }


}