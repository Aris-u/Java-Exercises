package TrabalhoFinal;

import java.util.*;

public class BarbecuesAtYuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            List<Meat> meats = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String name = sc.next();
                int days = sc.nextInt();
                meats.add(new Meat(name, days));
            }

            Collections.sort(meats);

            for (int i = 0; i < n; i++) {
                System.out.print(meats.get(i).name);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static class Meat implements Comparable<Meat> {
        String name;
        int days;

        public Meat(String name, int days) {
            this.name = name;
            this.days = days;
        }

        @Override
        public int compareTo(Meat other) {
            return Integer.compare(this.days, other.days);
        }
    }
}
