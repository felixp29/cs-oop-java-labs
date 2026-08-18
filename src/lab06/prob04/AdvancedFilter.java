package lab06.prob04;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Vector;

public class AdvancedFilter implements FilenameFilter {

    private Vector<String> acceptedExtensions;
    private Vector<String> acceptedWords;

    public AdvancedFilter(Vector<String> extensions, Vector<String> words) {
        this.acceptedExtensions = extensions;
        this.acceptedWords = words;
    }

    public boolean matchesExtension(String fileName) {
        for (int i = 0; i < acceptedExtensions.size(); i++) {
            String ext = acceptedExtensions.get(i);
            String suffix = ext.startsWith(".") ? ext : "." + ext;
            if (fileName.endsWith(suffix)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesWord(String fileName) {
        for (int i = 0; i < acceptedWords.size(); i++) {
            if (fileName.contains(acceptedWords.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File dir, String fileName) {
        return matchesExtension(fileName) || matchesWord(fileName);
    }
}