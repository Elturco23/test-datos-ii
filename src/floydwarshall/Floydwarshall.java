/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydwarshall;


public class Floydwarshall {

    static void Floy(int grafo[][]){
    int n= grafo.length, tmp;
    //crear matriz de distancia
    int distancias[][]= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distancias[i][j]=j;
            }
        }
        //ejecutar el metodo floy
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tmp= grafo[i][k]+grafo[k][j];
                    if(tmp<grafo[i][j]){
                    grafo[i][j]=tmp;
                    distancias[i][j]=k;
                    }
                }
            }
        }
    
    }
    static void print (int grafo[][]){
        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo.length; j++) {
                System.out.print(grafo[i][j]+"  ");
            }
        }
    }
    public static void main(String[] args) {
    
    }
    
}
