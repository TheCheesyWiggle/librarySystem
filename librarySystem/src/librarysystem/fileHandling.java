/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


public class fileHandling {
    
    public static String folderDirectory = System.getProperty("user.dir") + "\\Booklist.txt";
    
    public static void writeFile(ArrayList<Book> Booklist) {

        try {
            FileWriter writeToFile = new FileWriter(folderDirectory, false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < Booklist.size(); i++) {
                printToFile.println(Booklist.get(i).toString());
            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public static ArrayList<Book> readFile() {

        ArrayList<Book> Booklist = new ArrayList<>();
        String lineFromFile;
         
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while ((lineFromFile = read.readLine()) != null) {
                String[] BookDetails = lineFromFile.split(", ");
                //String name, String ISBN, String author, double price, String releaseDate, String genre
                Book myBook = new Book(BookDetails[0],BookDetails[1],BookDetails[2],Double.parseDouble(BookDetails[3]),BookDetails[4],BookDetails[5]);
                Booklist.add(myBook);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return Booklist;
    }
}
