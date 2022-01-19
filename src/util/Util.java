package util;

import java.util.Scanner;

public class Util {
    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        String result= scanner.nextLine();
        return result;
    }
    public static int enterInteger( String title) {
        System.out.println(title);
        Scanner scanner=new Scanner(System.in);
        int result= scanner.nextInt();
        return result;

    }

    public static String fillUserInfo() {
        String nameSurname = enterString("enter name and surname");
        String email = enterString("enter your email");
        String phone = enterString("enter your number");
        return "name:" +nameSurname + ", email:" + email + ", phone:" +phone;
    }

    public static String fillTripInfo(){
        String location = enterString("your current location");
        int passenger = enterInteger("how many passengers will travel?");
        String time = enterString("enter time:");
        String requires = enterString("enter requires : for example :(SMOKING-NO, PET-YES, LUGGAGE-No)");
        return "your destination from" + location + "with" + passenger + "passengers and with the requires:" + " "
                + requires + "in" + time;

    }


}
