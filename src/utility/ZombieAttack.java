package utility;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        // TODO. Write you code below this line.
        int sum = 0;
        for(int each : inhabitants){
            sum+=each;
        }
        int count = 0;

        while(sum > 0){
            System.out.println("Day "+count+" "+ Arrays.toString(inhabitants));
            int[] cities = new int[8];
            for(int i = 0 ; i < inhabitants.length; i++){
                if(inhabitants[i]==0 && cities[i]==0) {
                    if(i==0){
                        inhabitants[i+1] /= 2;
                        cities[i+1] += 1 ;
                    }
                    if(i==inhabitants.length-1){
                        inhabitants[i-1] /= 2;
                        cities[i-1] += 1 ;
                    }
                    if(1 <= i && i<inhabitants.length-1){
                        if(cities[i+1]==0) {
                            inhabitants[i + 1] /= 2;
                            cities[i+1] +=1;
                        } if(cities[i-1]==0){
                            inhabitants[i - 1] /= 2;
                            cities[i-1]+=1;
                        }
                    }
                }
            }
            count++;
            sum = 0;
            for(int each : inhabitants){
                sum+=each;
            }
        }


        System.out.println("Day "+count+" "+ Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");















    }


}
