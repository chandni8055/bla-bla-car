package serviceUtil;

import game.Cities;
import util.Util;

import java.util.LinkedList;

public class Service {
    public static void menu1(){
        String info = Util.fillUserInfo();
        System.out.println(info);
        System.out.println("welcome......");
        String city = Util.enterString("where do you want to go?");
        String toUpperCity = city.toUpperCase();
        System.out.println("checking destination for " + toUpperCity);
        Cities cities = new Cities();
        LinkedList <String> list = cities.getList();
        if(list.contains(toUpperCity)){
            System.out.println("There are available trips for" + toUpperCity + "...");
            String tripinfo = Util.fillTripInfo();
            System.out.println(tripinfo);
        }
        else
        {
            System.out.println("There are no available trips \t Here are the active trips");
            LinkedList <String> list1 = cities.getList();
            for(String s: list1){
                System.out.println(s);
            }
        }


    }

    public static void menu2() {
        String info = Util.fillUserInfo();
        System.out.println(info);
        String carType = Util.enterString("please enter your carType");
        String placeTo = Util.enterString("where do you ride?");
        String placeFrom = Util.enterString("your current location?");
        int capacity = Util.enterInteger("How many passengers you can carry?");
        String requires = Util.enterString("enter requires : for example :(SMOKING-NO, PET-YES, LUGGAGE-No)");
        System.out.println("CarType :" + carType + " from " + placeFrom + " to " + placeTo + "with" + capacity +
                "passengers and with their requires :" + requires);

    }

    public static void menu3() {
        System.out.println("Bla Bla-Car is a french online marketplace for carpooling.\n" +
                "Tis website and mobile apps connect drivers and passengers willing to travel together" +
                "between cities and share the cost of journey.\n" +
                "The platform had 70 millions was in 2019 and is available in 22 countries.\n" +
                "Almost all of which are in Europe and Latin america - countries include: \n Belgium, Brazil," +
                "crezch republic, france, germany, india,italy and uk. ");


    }
}
