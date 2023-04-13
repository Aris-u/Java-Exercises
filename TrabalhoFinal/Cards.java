package TrabalhoFinal;

import java.util.*;

public class Cards {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] cards = new int[5];
            for (int i = 0; i < 5; i++) {
                cards[i] = sc.nextInt();
            }
            if (isIncreasing(cards)) {
                System.out.println("C");
            } else if (isDecreasing(cards)) {
                System.out.println("D");
            } else {
                System.out.println("N");
            }
           sc.close();
        }
    
        public static boolean isIncreasing(int[] cards) {
            for (int i = 0; i < 4; i++) {
                if (cards[i] >= cards[i+1]) {
                    return false;
                }
            }
            return true;
        }
    
        public static boolean isDecreasing(int[] cards) {
            for (int i = 0; i < 4; i++) {
                if (cards[i] <= cards[i+1]) {
                    return false;
                }
            }
            return true;
            
        }
        
    }
    

