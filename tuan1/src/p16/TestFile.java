package p16;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        try {
            File f = new File("foo.txt");

            File dir = new File("Books");
            dir.mkdir();

            if (dir.isDirectory()) {
                String [] dirContents = dir.list();
                assert dirContents != null;
                for (String dirContent : dirContents) {
                    System.out.println(dirContent);
                }
            }

            System.out.println(dir.getAbsolutePath());

            boolean isDeleted = f.delete();
            System.out.println(isDeleted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
