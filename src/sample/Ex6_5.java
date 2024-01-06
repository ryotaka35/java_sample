package sample;

public class Ex6_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("-");
                } else if (i == 1 && j == 5) {
                    System.out.print("|");
                } else if (i == 2 && (j == 5 || j == 6 || j == 7)) {
                    System.out.print("-");
                } else if (i == 3 && (j == 2 || j == 5)) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
