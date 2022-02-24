
package uspg.edu.gt.metodoburbuja;

import java.util.Arrays;

/**
 *
 * @author Andrea Erazo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[]{8,10,1,5,9,3,7,2,4,6};
        System.out.println("Arreglo a ordenar: "+Arrays.toString(numeros));
        int[] numerosDesc = metodoBurbujaDesc(numeros);
        System.out.println("Arreglo ordenado descendente: "+Arrays.toString(numerosDesc));
        int[] numerosAsc = metodoBurbujaAsc(numeros);
        System.out.println("Arreglo ordenado ascendente: "+Arrays.toString(numerosAsc));
    }
    
    //Ordenamiento de forma Descendente
     
    public static int[] metodoBurbujaDesc( int [ ] num )
    {
         int i;
         boolean flag = true;
         int temp;
         while ( flag )
         {
                flag = false;  
                for( i=0;  i < num.length -1;  i++ )
                {
                       if ( num[ i ] < num[i+1] )
                       {
                               temp = num[ i ]; 
                               num[ i ] = num[ i+1 ];
                               num[ i+1 ] = temp;
                              flag = true; 
                      } 
                } 
          } 
         return num;
    }
    
    //Ordenamiento de forma Ascendente
    
    public static int[] metodoBurbujaAsc( int [ ] num )
    {
         int i;
         boolean flag = true;
         int temp;
         while ( flag )
         {
                flag = false;   
                for( i=0;  i < num.length -1;  i++ )
                {
                       if ( num[ i ] > num[i+1] )  
                       {
                               temp = num[ i ];
                               num[ i ] = num[ i+1 ];
                               num[ i+1 ] = temp;
                              flag = true; 
                      } 
                } 
          } 
         return num;
    }

    
    
}
