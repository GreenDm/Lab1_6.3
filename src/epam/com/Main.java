package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {

    public static void main(String[] args) {


        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};


        for (int i = 0;i <= 3; i++){

            for (int j = 0; j<=3; j++ ){

                System.out.print(arr1 [j][i]+" ");
            }
            System.out.println();
        }
    }
}
