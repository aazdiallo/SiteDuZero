import java.util.Scanner;

/**
 * Created by ghadhakanka on 3/12/17.
 */
public class Nadhel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int n = 0; // length of the table
        int tab[] = new int[9];
        System.out.println("Program for entering values in a table");
        //System.out.println("Please enter the length of the table you want.");
        //n = sc.nextInt();
        System.out.println("Enter the elements of the table of 9 integers");
        for (int i = 0; i < 9; i++){
            tab[i] = sc.nextInt();
            //System.out.println(n);
            System.out.println("Tab["+ (i+1) +"]=: "+ tab[i]);
        }
        //////////////Printing table contents//////////
        System.out.println("\n");
        System.out.println("Table content before sort:");
         for (int i = 0; i < 9; i++){
            System.out.println("Tab["+ (i+1) +"]=: "+ tab[i]);
        }
        ////////////Sorting table contents in croissant order//////////////
        int temp = tab[0], index = 0; //temporary variable for change
        int tableLength = tab.length;

        do { // searching the larger # in the table
            for (int j = 0; j < tableLength ; j++){
                if (tab[j] > temp) {
                    temp = tab[j];   // Putting the larger number into the temporary variable
                    index = j;      // Getting the index of the larger number
                }
            }
            // exchanging the variables in the table
            int temporary = tab[(tableLength)-1]; // Assigning the last value of the table to this variable;
            tab[(tableLength)-1] = temp;         // Assigning the larger value of the table to the last column;
            tab[index] = temporary;             // Assigning the value of the last column to temporary variable;
            tableLength--;                     /* Reducing the size of the table by one unit so that next iteration
                                                 of the "do while" loop won't go up to the last element/column */
            temp = 0;                        // Reinitializing the maximum value of the table to 0
                                            // This reinitialization prevent the program from keeping the same value
        }while (tableLength > 0 );         // Run the loop until the table length is greater than 0.

        //////////////Printing table contents after the sort//////////
        System.out.println("\n");
        System.out.println("Table content after sort:");
         for (int i = 0; i < 9; i++){
            System.out.println("Tab["+ (i+1) +"]=: "+ tab[i]);
        }
    
        }
    }