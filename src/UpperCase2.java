//import java.io.*   ;
//import java.util.Scanner;
//
///*********************************
// CPT163
// Michael Lingsch
// This program will convert a file name
// to Uppercase.
// Created On: 10/1/2018
// Last Modified: 10/1/2018
// *********************************/
//
//public class UpperCase2 {
//
//    public static void main(String[] args) throws IOException {
//
//        //define the variables required for the program and create the scanner
//        String userFileName;
//        Scanner keyboard = new Scanner (System.in);
//        int lines;
//
//        //input the names of the two files
//        System.out.print("How many lines does your file have?");
//        lines = keyboard.nextLine();
//
//        System.out.print("What is the name of the first file? : ");
//        userFileName =keyboard.nextLine();
//
//        File file = new File(userFileName);
//
//        while(!file.exists()){
//            System.out.print(userFileName + " does not exist!");
//            userFileName =keyboard.nextLine();
//            file = new File(userFileName);
//        }
//
//        Scanner fileToRead = new Scanner(file);
//        PrintWriter convertedFile = new PrintWriter("convertedFile.txt");
//
////        while(fileToRead.hasNext()) {
////            convertedFile.println(fileToRead.nextLine().toUpperCase());
////            convertedFile.close();
////            fileToRead.close();
////        }
//
//    }
//
//}
