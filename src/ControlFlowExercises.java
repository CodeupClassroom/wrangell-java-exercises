public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i<=15) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
//        int j = 100;
//        do {
////            if (j%2==0) {
////                System.out.println(j);
////            }
////            j++;
////            System.out.println(j);
//            j-=5;
//        } while (j>=-10);
        for (int j=100;j>=-10;j-=5) {
            System.out.println(j);
        }

//        long k = 2;
//        do {
//            System.out.println(k);
//            k = (long)Math.pow(k,2);
////            k*=k;
//        } while (k<1000000);

        for (long k=2;k<1000000L;k*=k) {
            System.out.println(k);
        }

    }
}
