package Tugas;
import java.util.Scanner;
public class No_1 {
    public static void main(String[]args){
        String data[]= {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Koandres","Tesla"};
        String key;
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan data yang akan dicari: ");
        key = scan.nextLine();
        System.out.println();
        
        System.out.print("Isi data adalah: ");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
           
        
        for(int i=0;i<=data.length;i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("Data "+key+" berada pada index ke - "+i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("***** THANK YOU *****");
    }
}
