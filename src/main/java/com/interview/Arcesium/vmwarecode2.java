package com.interview.Arcesium;

import java.io.*;

public class vmwarecode2 {



    public static Boolean createFile(String fileName) throws IOException {
        File file = new File(System.getProperty("user.dir")+"/"+fileName);
        return file.createNewFile();
    }

    public static void writeToFile(String fileName, String content) throws IOException {
        File file = new File(System.getProperty("user.dir")+"/"+fileName);
        if(file.exists() && file.isFile()){
            FileWriter fileWriter = new FileWriter(file);
            try {
                fileWriter.write(content);
            }finally {
                fileWriter.flush();
                fileWriter.close();
            }

        }

    }

    private static StringBuilder readFromFile(String fileName) throws IOException {

        StringBuilder result = new StringBuilder();

        File file = new File(System.getProperty("user.dir")+"/"+fileName);

        if(file.exists() && file.isFile()){
            InputStreamReader fileReader = new FileReader(file);
            try {
                fileReader.read()


            }finally {
                fileReader.close();
            }

        }


        return  result;

    }

    public static void main(String[] args) {

        String content = "{\n" +
                "    \"productsList\": [\n" +
                "        {\n" +
                "            \"productid\": \"23a809f7-fc4f-4664-b5e3-a0a4764b6ae7\",\n" +
                "            \"version\": \"1\",\n" +
                "            \"eulaaccepted\": true,\n" +
                "            \"autoupdate\": false,\n" +
                "            \"maxversions\": 0\n" +
                "        }\n" +
                "    ],\n" +
                "    \"vcddetails\": {\n" +
                "        \"catalogname\": \"onprem_catalog\",\n" +
                "        \"catalogid\": \"\",\n" +
                "        \"orgname\": \"\",\n" +
                "        \"password\": \"\",\n" +
                "        \"username\": \"\",\n" +
                "        \"vcdurl\": \"\",\n" +
                "        \"isProvider\": false,\n" +
                "        \"orgId\": \"\",\n" +
                "        \"token\": \"\"\n" +
                "    },\n" +
                "    \"platform\": \"ONPREM\"\n" +
                "}";

        try {
            createFile("demo.json");
            writeToFile("demo.json", content);
            System.out.println(readFromFile("demo.json").toString());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
