package ExercicioPropostoMap.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> hashMap = new HashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null){
                String[] text = line.split(",");

                if (hashMap.containsKey(text[0])){
                    Integer votes = hashMap.get(text[0]);
                    hashMap.put(text[0], votes + Integer.parseInt(text[1]));
                }
                else {
                    hashMap.put(text[0], Integer.parseInt(text[1]));
                }
                line = br.readLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        for (String key : hashMap.keySet()){
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}
