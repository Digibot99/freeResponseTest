//Output is below
//
//16
//16 32 28 20 
//is diverse
//14 35 36 14 
//not diverse

//Seth Wheeler

package arrays;
public class Arrays {

    public static void main(String[] args) {
        int arr[] = {1,3,2,7,3};
        System.out.println(DiverseArray.arraySum(arr));
        
        int arr2D1[][] = { {1,3,2,7,3},
                           {10,10,4,6,2},
                           {5,3,5,9,6},
                           {7,6,4,2,1}
        };
        int retArray[] = DiverseArray.rowSums(arr2D1);
        for (int value : retArray)
            System.out.print(value + " ");
        System.out.println("");
        
        if (DiverseArray.isDiverse(arr2D1))
            System.out.println("is diverse");
        else
            System.out.println("not diverse");

        
        int arr2D2[][] = {  {1,1,5,3,4},
                           {12,7,6,1,9},
                           {8,11,10,2,5},
                           {3,2,3,0,6}
        };
        retArray = DiverseArray.rowSums(arr2D2);
        for (int value : retArray)
            System.out.print(value + " ");
        System.out.println("");
        
        if (DiverseArray.isDiverse(arr2D2))
            System.out.println("is diverse");
        else
            System.out.println("not diverse");
    }
}


class DiverseArray
{
    public static int arraySum(int [] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return(sum);
    }
    public static int[] rowSums(int [][] arr2D)
    {
       int [] arr = {arraySum(arr2D[0]),arraySum(arr2D[1]),arraySum(arr2D[2]),arraySum(arr2D[3])};
       return(arr);
    }
    public static boolean isDiverse(int [][] arr2D)
    {
        int [] arr = rowSums(arr2D);
        
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (i != j)
                {
                    if (arr[i] == arr[j])
                    {
                        return(false);
                    }
                }
            }
        }
        return(true);
    }
}
