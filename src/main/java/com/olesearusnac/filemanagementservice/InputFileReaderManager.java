package com.olesearusnac.filemanagementservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class InputFileReaderManager {
    public static void printDataFromFile(File file) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int character;
            while ((character = fileReader.read()) != -1) {
                //It processes each character from file
                System.out.println((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printDataFromFileUsingBufferReader(File file) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //It processed each line of the file
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printDataFromFileUsingFiles(File file) {
        try {
            System.out.println(Files.readString(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}