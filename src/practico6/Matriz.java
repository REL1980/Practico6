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
        
        arreglo[0][0] = 3;
        arreglo[0][1] = 6;
        arreglo[0][2] = 9;
        arreglo[0][3] = 12;
        
        arreglo[1][0] = 15;
        arreglo[1][1] = 18;
        arreglo[1][2] = 21;
        
        arreglo[2][0] = 24;
        arreglo[2][1] = 27;
        arreglo[2][2] = 30;
        arreglo[2][3] = 33;
        arreglo[2][4] = 36;
        
        arreglo[3][0] = 39;
        arreglo[3][1] = 42;
        
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
