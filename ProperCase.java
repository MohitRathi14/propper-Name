import java.util.Scanner;

public class propercase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        name = name.toLowerCase();
        name = name.trim().replaceAll("\\s+", " ");

        System.out.println(name);

        StringBuilder sb = new StringBuilder(name);
        boolean capitalizeNext = true;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                capitalizeNext = false;
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
