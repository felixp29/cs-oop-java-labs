package lab06.prob04;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            String extensionsPath = "solutions/src/lab06/extension.in";
            String wordsPath = "solutions/src/lab06/words.in";
            String startDirectoryPath = "solutions/src/director";

            // 1. Read extensions and words using RandomAccessFile into separate vectors
            Vector<String> acceptedExtensions = readFileLines(extensionsPath);
            Vector<String> acceptedWords = readFileLines(wordsPath);

            System.out.println("Extensions loaded: " + acceptedExtensions);
            System.out.println("Words loaded: " + acceptedWords);

            // 2. Initialize the filter
            AdvancedFilter filter = new AdvancedFilter(acceptedExtensions, acceptedWords);

            // 3. Separate output vectors to store matched files
            Vector<String> filesMatchedByExtension = new Vector<>();
            Vector<String> filesMatchedByWord = new Vector<>();

            // 4. Traverse the directory recursively
            File rootDirectory = new File(startDirectoryPath);
            collectFilesRecursively(rootDirectory, filter, filesMatchedByExtension, filesMatchedByWord);

            // 5. Display the two distinct lists
            System.out.println("\n--- Files matching extensions from extension.in ---");
            for (int i = 0; i < filesMatchedByExtension.size(); i++) {
                System.out.println(filesMatchedByExtension.get(i));
            }

            System.out.println("\n--- Files matching words from words.in ---");
            for (int i = 0; i < filesMatchedByWord.size(); i++) {
                System.out.println(filesMatchedByWord.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Vector<String> readFileLines(String filePath) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filePath, "r");
        Vector<String> lines = new Vector<>();
        String line;

        while ((line = raf.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
                lines.add(line);
            }
        }
        raf.close();
        return lines;
    }

    // Recursive method
    public static void collectFilesRecursively(File currentDirectory,
                                               AdvancedFilter filter,
                                               Vector<String> extensionResults,
                                               Vector<String> wordResults) {
        File[] fileList = currentDirectory.listFiles();
        if (fileList == null) {
            return;
        }

        for (int i = 0; i < fileList.length; i++) {
            File currentItem = fileList[i];

            if (currentItem.isDirectory()) {
                collectFilesRecursively(currentItem, filter, extensionResults, wordResults);
            } else {
                String fileName = currentItem.getName();
                String filePathInfo = fileName + " (" + currentItem.getPath() + ")";

                // Check and store separately
                if (filter.matchesExtension(fileName)) {
                    extensionResults.add(filePathInfo);
                }

                if (filter.matchesWord(fileName)) {
                    wordResults.add(filePathInfo);
                }
            }
        }
    }
}
