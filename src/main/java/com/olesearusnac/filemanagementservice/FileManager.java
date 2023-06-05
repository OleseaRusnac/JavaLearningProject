package com.olesearusnac.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createTheFileIfItDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file doesn't exist.");
        }
    }

    public static void printTheFileName(File file) {
        String fileName = file.getName();
        System.out.println("The name of file is: " + fileName + ".");
    }

    public static void printTheFileAbsolutePath(File file) {
        String absolutePath = file.getAbsolutePath();
        System.out.println("The absolute path of the file is:" + absolutePath + ".");
    }

    public static void printIfTheFileIsADirectory(File file) {
        if (file.isFile()) {
            System.out.println("The object File is a file.");
        } else {
            System.out.println("The object File is a directory.");
        }
    }

    public static void deleteTheFileIfExists(File file) {
        if (file.delete()) {
            System.out.println("The file was deleted.");
        } else {
            System.out.println("The file couldn't be deleted.");
        }
    }
}


