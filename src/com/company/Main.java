package com.company;

import java.io.File;
import java.io.*;

public class Main {
    public static void main (String[] args){
        File file = new File ("takimlar.txt");

        try{
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\n");
            bufferedWriter.write("Başakşehir FK");
            bufferedWriter.write("\n");
            bufferedWriter.write("Gazişehir FK");
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String contextLine = null;
            int line =1;
            while ((contextLine=bufferedReader.readLine())!=null){
                System.out.println(line +". satır: "+contextLine);
                line++;
            }
            bufferedReader.close();
            fileReader.close();

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
