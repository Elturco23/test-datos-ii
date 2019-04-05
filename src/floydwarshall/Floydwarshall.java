/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydwarshall;


public class Floydwarshall {
static int INF=999;
static int  [][]M={
    {0, INF,9,2,INF},
    {2,0,INF,INF,3},
    {INF,2,0,2,3},
    {1,INF,INF,0,4},
    {INF,2,INF,INF,0},


};
    
    static void Floy(int grafo[][]){
    int n= grafo.length, tmp;
    //crear matriz de camino
    int caminos[][]= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                caminos[i][j]=j;
            }
        }
        //ejecutar el metodo floy
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    tmp= grafo[i][k]+grafo[k][j];
                    if(tmp<grafo[i][j]){
                    grafo[i][j]=tmp;
                    caminos[i][j]=k;
                    }
                }
            }
        }
         System.out.println("La matriz de distancia es");
    print(grafo);
        System.out.println("La matriz de camino es");
        print(caminos);
    }
    static void print (int grafo[][]){
        for (int i = 0; i < grafo.length; i++) {
            for (int j = 0; j < grafo.length; j++) {
                System.out.print(grafo[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
   
        Floy (M);
        
        
    }
    
}
