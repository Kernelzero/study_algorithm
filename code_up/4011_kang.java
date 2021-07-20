import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Main {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        String rrn = scanner.nextLine();

        String[] jumin = rrn.split("-");
        int gender = Integer.parseInt( jumin[1].substring(0, 1));

        String year = "";
        if (gender < 3){
            year = "19" + jumin[0].substring(0, 2);
        } else {
            year = "20" + jumin[0].substring(0, 2);
        }

        String month = jumin[0].substring(2, 4);
        String day = jumin[0].substring(4,6);

        String genderChar = (gender%2) == 0 ? "F" : "M";

        System.out.printf("%s/%s/%s %s", year, month, day, genderChar);
    }
}