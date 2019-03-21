package political_membership;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Political_Membership {

    public static void main(String[] args) throws IOException, InterruptedException {

        String py_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\";
        String Abortion_In_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\Canadian-Parliament\\Abortion\\";
        String Abortion_Out_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\output\\Abortion\\";
        
        System.out.println("\nSimilarity Results\n" + "----------------\n" + "Topic: Abortion\n(400 words)");
        
        ProcessBuilder pb1 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Abortion_In_PATH + "400\\", "-o", Abortion_Out_PATH + "400\\");
        Process process1 = pb1.start();
        process1.waitFor();

        String st;
        BufferedReader br = new BufferedReader(new InputStreamReader(process1.getErrorStream()));

        while((st = br.readLine())!=null)
            System.out.println(st);
        
        File file1 = new File(Abortion_Out_PATH + "400\\answers.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(file1)); 
        
        while ((st = br1.readLine()) != null) 
            System.out.println(st); 

        System.out.println("\n(800 words)");
        
        ProcessBuilder pb2 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Abortion_In_PATH + "800\\", "-o", Abortion_Out_PATH + "800\\");
        Process process2 = pb2.start();
        process2.waitFor();
    
        File file2 = new File(Abortion_Out_PATH + "800\\answers.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(file2)); 
   
        while ((st = br2.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("\n(1200 words)");

        ProcessBuilder pb3 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Abortion_In_PATH + "1200\\", "-o", Abortion_Out_PATH + "1200\\");
        Process process3 = pb3.start();
        process3.waitFor();

        File file3 = new File(Abortion_Out_PATH + "1200\\answers.txt");
        BufferedReader br4 = new BufferedReader(new FileReader(file3)); 
   
        while ((st = br4.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("\n(1600 words)");

        ProcessBuilder pb4 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Abortion_In_PATH + "1600\\", "-o", Abortion_Out_PATH + "1600\\");
        Process process4 = pb4.start();
        process4.waitFor();

        File file4 = new File(Abortion_Out_PATH + "1600\\answers.txt");
        BufferedReader br5 = new BufferedReader(new FileReader(file4)); 
   
        while ((st = br5.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("\n(2000 words)");

        ProcessBuilder pb5 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Abortion_In_PATH + "2000\\", "-o", Abortion_Out_PATH + "2000\\");
        Process process5 = pb5.start();
        process5.waitFor();

        File file5 = new File(Abortion_Out_PATH + "2000\\answers.txt");
        BufferedReader br6 = new BufferedReader(new FileReader(file5)); 
   
        while ((st = br6.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("\n(3000 words)");

        ProcessBuilder pb6 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Abortion_In_PATH + "3000\\", "-o", Abortion_Out_PATH + "3000\\");
        Process process6 = pb6.start();
        process6.waitFor();

        File file6 = new File(Abortion_Out_PATH + "3000\\answers.txt");
        BufferedReader br7 = new BufferedReader(new FileReader(file6)); 
   
        while ((st = br7.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("\n(4000 words)");

        ProcessBuilder pb7 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Abortion_In_PATH + "4000\\", "-o", Abortion_Out_PATH + "4000\\");
        Process process7 = pb7.start();
        process7.waitFor();

        File file7 = new File(Abortion_Out_PATH + "4000\\answers.txt");
        BufferedReader br8 = new BufferedReader(new FileReader(file7)); 
   
        while ((st = br8.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("\n(5000 words)");

        ProcessBuilder pb8 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Abortion_In_PATH + "5000\\", "-o", Abortion_Out_PATH + "5000\\");
        Process process8 = pb8.start();
        process8.waitFor();

        File file8 = new File(Abortion_Out_PATH + "5000\\answers.txt");
        BufferedReader br9 = new BufferedReader(new FileReader(file8)); 
   
        while ((st = br9.readLine()) != null) 
            System.out.println(st);
        }
    }

