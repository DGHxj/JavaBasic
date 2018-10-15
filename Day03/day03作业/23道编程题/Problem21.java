package homework.day03;

public class Problem21{
 
    public static void main(String[] args) {
     
        int trial = 0;
         
        double denominator = 1;
        double numerator = 4;
        double PI = 0;
         
        final double LOWER_BOUND = 3.1415926;
        final double UPPER_BOUND = 3.1415927;
         
        while (true) {         
            trial++;
            if (trial % 2 == 0)
                PI -= numerator / denominator;
            else 
                PI += numerator / denominator;
            denominator += 2;
            if (PI >= LOWER_BOUND && PI <= UPPER_BOUND)
                break;
             
        }
         
        System.out.println("π ≈ " + PI);
        System.out.println("计算次数: " + trial + " 次");
         
    }
}