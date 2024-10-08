package Accenture;

import java.util.Scanner;

public class ip_check{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print(check(s));
    }

    public static boolean check(String s) {
        if (s.length() < 7 || s.length() > 15) {
            return false;
        }

        int dotCount = 0;
        int segmentValue = 0;
        int segmentLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '.') {
                dotCount++;
                if (dotCount > 3 || segmentLength == 0 || segmentValue > 255) {
                    return false;
                }
                segmentValue = 0;
                segmentLength = 0;
            } else if (Character.isDigit(ch)) {
                segmentValue = segmentValue * 10 + (ch - '0');
                segmentLength++;
                if (segmentLength > 3) {
                    return false;
                }
            } else {
                return false;
            }
        }

        if (dotCount != 3 || segmentLength == 0 || segmentValue > 255) {
            return false;
        }

        return true;
    }
}
