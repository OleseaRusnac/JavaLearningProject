package com.olesearusnac.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File fileObject = new File("src/main/java/com/olesearusnac/readwritefileservice/test.txt");

        FileManager.createTheFileIfItDoesNotExist(fileObject);
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.printTheFileAbsolutePath(fileObject);
        FileManager.printIfTheFileIsADirectory(fileObject);
        FileManager.deleteTheFileIfExists(fileObject);

        String filePath = "src/main/java/com/olesearusnac/readwritefileservice/testOutput.txt";
        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(filePath, "First Content");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(filePath, "Second Content");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReaderManager.printDataFromFile(fileObjectUsedForReading);
        InputFileReaderManager.printDataFromFileUsingBufferReader(fileObjectUsedForReading);
        InputFileReaderManager.printDataFromFileUsingFiles(fileObjectUsedForReading);
    }
}