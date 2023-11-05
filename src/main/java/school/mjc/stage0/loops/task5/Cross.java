package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {


        if (sideLength % 2 == 0) {
            System.out.println("Size must be odd.");
            return;
        }
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == j || i + j == sideLength - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
