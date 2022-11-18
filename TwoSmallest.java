/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {
        Double.parseDouble(args[0]);
        Double first = Double.MAX_VALUE;
        Double second = Double.MAX_VALUE;
        for(int i = 0; i < args.length ; i++){
            double a = Double.parseDouble(args[i]);
            if(a <= first){
                second = first;
                first = a;
            }
            else if (a < second && a != first){
                second = a;
            }

            
        }
        System.out.println(first);
        System.out.println(second);

	// WRITE YOUR CODE HERE
    }

}

