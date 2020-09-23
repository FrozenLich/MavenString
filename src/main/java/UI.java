import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        HuluRegistration user = new HuluRegistration();
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your email");
        String userEmail = in.nextLine();
        user.setEmail(userEmail);

        System.out.println("Please enter your password");
        String userPassword = in.nextLine();
        user.setPassword(userPassword);

        System.out.println("Please enter your name");
        String userName = in.nextLine();
        user.setName(userName);

        System.out.println("Please enter your birthday (DD/MM/YYYY)");
        String birthday = in.nextLine();
        String[] birth = birthday.split("/");
        user.setBirthDate(Integer.parseInt(birth[0]));
        user.setBirthMonth(Integer.parseInt(birth[1]));
        user.setBirthYear(Integer.parseInt(birth[2]));

        System.out.println("Please enter your gender");
        String userGender = in.nextLine();
        user.setGender(userGender);


    }
}
