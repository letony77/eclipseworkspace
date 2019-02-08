package matrice;

import java.util.Scanner;



public class Matrice{
    public static void main(String[] args){

        int[][] matrice = new int[2][2];
        for(int i = 0; i < matrice.length; i++){
            matrice[i] = new int[2];
        }
 

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir vos valeurs ");
        
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
               
                matrice[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){


            	System.out.print(matrice[i][j] + " ");
            }	
            System.out.println();
        }
    }
}