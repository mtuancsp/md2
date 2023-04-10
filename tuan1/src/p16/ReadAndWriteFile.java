package p16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String path) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc tệp!");
        }
        return numbers;
    }

    public void writeFile(String path, int max) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(path, true))) {
            writer.printf("Giá trị lớn nhất là: %d%n", max);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi tệp!");
        }
    }

    public static int findMax(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Danh sách trống!");
        }
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("output.txt");
        int max = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", max);
    }
}
