package first;

public class Main {

    public static void main(String[] args) {
        int j,i,k, l, m ,n ;
        for (i=0; i<10; i++) {
            for (j = 0; j < 10; j++) {
                for (k = 0; k < 10; k++) {
                    for (l = 0; l < 10; l++) {
                        for (m = 0; m < 10; m++) {
                            for (n = 0; n < 10; n++)
                                if ((i + j + k) == (l + m + n)) {
                                    System.out.print(i);
                                    System.out.print(j);
                                    System.out.print(k);
                                    System.out.print(l);
                                    System.out.print(m);
                                    System.out.print(n);
                                    System.out.println();
                                }
                        }
                    }
                }
            }
        }
    }
}


//000001 to 999999
