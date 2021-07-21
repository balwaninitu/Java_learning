package com.nitu.learningfilereader;

//import java.io.File;
//import java.io.FileReader;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        File file = new File("myfile1.txt");

        //in java7 features if there is resources like file in block of catch it will close automatically
        //it wont work in java6 but only java7 onwards
        try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader  = new BufferedReader(fileReader);){

            String line = bufferedReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading the file" +file.getName());

        }


        }

    }


