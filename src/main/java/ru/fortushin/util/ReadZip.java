package ru.fortushin.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadZip {

    public static Map<String, Integer> getZipMap() {
        File file = new File("src/main/resources/zip.csv");
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String s1 = s.replace("\t", " ");
                String[] arr = s1.split(" ");
                for (int i = 0; i < arr.length - 2; i++){
                    sb.append(arr[i]);
                    sb.append(" ");
                }
                map.put(String.valueOf(sb), Integer.parseInt(arr[arr.length-1]));
                sb = new StringBuilder();
            }
        }catch (FileNotFoundException e){
            System.out.println(file + " not found");
        }



    return map;
    }
}
