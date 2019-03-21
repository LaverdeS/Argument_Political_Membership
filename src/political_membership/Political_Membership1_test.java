package political_membership;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Political_Membership1_test {


        String py_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\";
        String Pos_In_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\Canadian-Parliament\\Positive_Case\\";
        String Pos_Out_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\output\\Positive\\";
        String Neg_In_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\Canadian-Parliament\\Negative_Case\\";
        String Neg_Out_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\output\\Negative\\";
        String Specific1_In_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\Canadian-Parliament\\Specific_Case1\\";
        String Specific1_Out_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\output\\Specific1\\";
        String Specific2_In_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\Canadian-Parliament\\Specific_Case2\\";
        String Specific2_Out_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\output\\Specific2\\";
        String Specific3_In_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\Canadian-Parliament\\Specific_Case3\\";
        String Specific3_Out_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\output\\Specific3\\";
        String Args_In_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\Canadian-Parliament\\Args_Case\\";
        String Args_Out_PATH = "C:\\Users\\SEBASTIAN LAVERDE\\Documents\\NetBeansProjects\\Political_Membership\\Political_Membership\\output\\Args\\";
        
        System.out.println("\nSimilarity Results\n" + "----------------\n" + "Positive_Case:");
        
        ProcessBuilder pb1 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Pos_In_PATH, "-o", Pos_Out_PATH);
        Process process1 = pb1.start();
        process1.waitFor();

        String st;
        BufferedReader br = new BufferedReader(new InputStreamReader(process1.getErrorStream()));

        while((st = br.readLine())!=null)
            System.out.println(st);
        
        File file1 = new File(Pos_Out_PATH + "answers.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(file1)); 
        
        while ((st = br1.readLine()) != null) 
            System.out.println(st); 

        System.out.println("\nNegative_Case:");
        
        ProcessBuilder pb2 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Neg_In_PATH, "-o", Neg_Out_PATH);
        Process process2 = pb2.start();
        process2.waitFor();
    
        File file2 = new File(Neg_Out_PATH + "answers.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(file2)); 
   
        while ((st = br2.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("----------------");

        ProcessBuilder evaluator = new ProcessBuilder("python", py_PATH + "evaluator.py");
        Process evaluator_process = evaluator.start();
        evaluator_process.waitFor();

        BufferedReader br3 = new BufferedReader(new InputStreamReader(evaluator_process.getInputStream()));
        
        System.out.print("Accuracy:\n");

        while((st = br3.readLine())!=null)
            System.out.println(st);
             
        
        System.out.println("----------------\nSpecific_Case1 (New_Democrat):");

        ProcessBuilder pb3 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Specific1_In_PATH, "-o", Specific1_Out_PATH);
        Process process3 = pb3.start();
        process3.waitFor();

        File file3 = new File(Specific1_Out_PATH + "answers.txt");
        BufferedReader br4 = new BufferedReader(new FileReader(file3)); 
   
        while ((st = br4.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("----------------\nSpecific_Case2 (X):");

        ProcessBuilder pb4 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Specific2_In_PATH, "-o", Specific2_Out_PATH);
        Process process4 = pb4.start();
        process4.waitFor();

        File file4 = new File(Specific2_Out_PATH + "answers.txt");
        BufferedReader br5 = new BufferedReader(new FileReader(file4)); 
   
        while ((st = br5.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("----------------\nArgs_Case (Senator Grafstein):");

        ProcessBuilder pb5 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Args_In_PATH + "Grafstein", "-o", Args_Out_PATH + "Grafstein");
        Process process5 = pb5.start();
        process5.waitFor();

        File file5 = new File(Args_Out_PATH + "Grafstein\\answers.txt");
        BufferedReader br6 = new BufferedReader(new FileReader(file5)); 
   
        while ((st = br6.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("----------------\nArgs_Case (Abortion):");

        ProcessBuilder pb6 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Args_In_PATH + "Abortion", "-o", Args_Out_PATH + "Abortion");
        Process process6 = pb6.start();
        process6.waitFor();

        File file6 = new File(Args_Out_PATH + "Abortion\\answers.txt");
        BufferedReader br7 = new BufferedReader(new FileReader(file6)); 
   
        while ((st = br7.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("----------------\nArgs_Case (Abortion2):");

        ProcessBuilder pb7 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Args_In_PATH + "Abortion2", "-o", Args_Out_PATH + "Abortion2");
        Process process7 = pb7.start();
        process7.waitFor();

        File file7 = new File(Args_Out_PATH + "Abortion2\\answers.txt");
        BufferedReader br8 = new BufferedReader(new FileReader(file7)); 
   
        while ((st = br8.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("----------------\nArgs_Case (Guns_Control):");

        ProcessBuilder pb8 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Args_In_PATH + "Guns_Control", "-o", Args_Out_PATH + "Guns_Control");
        Process process8 = pb8.start();
        process8.waitFor();

        File file8 = new File(Args_Out_PATH + "Guns_Control\\answers.txt");
        BufferedReader br9 = new BufferedReader(new FileReader(file8)); 
   
        while ((st = br9.readLine()) != null) 
            System.out.println(st);
        
        System.out.println("----------------\nArgs_Case (Bloc Quebecois):");

        ProcessBuilder pb9 = new ProcessBuilder("python", py_PATH + "panAV.py", "-i", Specific3_In_PATH, "-o", Specific3_Out_PATH);
        Process process9 = pb9.start();
        process9.waitFor();

        File file9 = new File(Specific3_Out_PATH + "answers.txt");
        BufferedReader br10 = new BufferedReader(new FileReader(file9)); 
   
        while ((st = br10.readLine()) != null) 
            System.out.println(st);
        }
    }

