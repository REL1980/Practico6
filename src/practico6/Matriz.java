package practico6;
public class Matriz 
{
    public void armar()
    {
        int arreglo[][] = new int[4][];
        
        arreglo[0] = new int[4];
        arreglo[1] = new int[3];
        arreglo[2] = new int[5];
        arreglo[3] = new int[2];
        System.out.println("----------------------");
        System.out.println("Arreglo bidimensional");
        int contador = 3;
        for (int fila=0;fila<arreglo.length;fila++) 
        {
            for (int columna = 0; columna < arreglo[fila].length; columna++) 
            {
                System.out.print((arreglo[fila][columna] = contador) + " ");
                contador = contador + 3;
                
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        System.out.println("Solo los pares:");             
        for (int[] arr : arreglo) 
        {
            for (int col = 0; col < arr.length; col++) 
            {
                if(arr[col]%2 == 0)
                {
                    System.out.print(arr[col] + " ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
