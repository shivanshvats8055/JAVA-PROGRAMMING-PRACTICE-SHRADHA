// import java.util.*;

// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
        
        

//         for(int i = 0;i<size;i++){
//             numbers[i] = sc.nextInt();
//         }
//         int x = sc.nextInt();

//         for(int i = 0;i<numbers.length;i++){
//             if(numbers[i]== x){
//                 System.out.println("x found at index " + i);
//             }
//         }
//     }
// }

// Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        // array intitialization
        String Names[] = new String[size];
        for(int i = 0;i<size;i++){
            Names[i] = sc.next();
        }
        for(int i = 0; i<Names.length;i++){
            System.out.println(Names[i]);
        }
    }
}




