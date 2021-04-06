package com.ayush;

import java.io.*;
import java.util.HashMap;

public class cleartax {

    static final String PYTHON = ".py";
    static final String JAVA = ".java";
    static final String RUBY = ".rb";
    static final String GO = ".go";

    public static void main(String[] args){
        int blankLines = 0;
        int commentLines = 0;
        int c = 0;
        HashMap<String, String> languageMetaMap = new HashMap<>();
        languageMetaMap.put(PYTHON, "#");
        languageMetaMap.put(JAVA, "//");
        languageMetaMap.put(RUBY, "//");
        languageMetaMap.put(GO, "^");
        try {
            File folder = new File("/Users/akalani/Downloads/ct/");
            File[] arr = folder.listFiles();

            for(int i =0; i<arr.length;i++){
                String language = "";
                for(String fType :  languageMetaMap.keySet()){
                    if(arr[i].getName().endsWith(fType)) language = fType;
                    else{
                        // throw LanguageNotFound;
                    }
                }
                BufferedReader br = new BufferedReader(new FileReader(arr[i]));
                String line;
                while((line = br.readLine()) != null) {
                    c++;
                    if(line.trim().isEmpty()){
                        blankLines++;
                    }
                    if(line.trim().startsWith(languageMetaMap.get(language))) {
                        commentLines++;
                    }
                }
            }

        }
        catch(FileNotFoundException k){
            k.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("blankLines " + blankLines);
        System.out.println(c - (blankLines + commentLines));
        System.out.println("commentLines "  + commentLines);
    }
}
