package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {


        if (height % 2 == 0) {
            System.out.println("Size must be odd.");
            return;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == j || i + j == height - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < height; j++) {
                if (i == j || i + j == height - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
