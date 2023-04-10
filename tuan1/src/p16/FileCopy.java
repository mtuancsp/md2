package p16;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Nhập tên tệp muốn sao chép: ");
            String sourceFilePath = reader.readLine();

            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                System.out.println("Tệp nguồn không tồn tại!");
                return;
            }

            System.out.print("Nhập tên tệp đích: ");
            String targetFilePath = reader.readLine();

            File targetFile = new File(targetFilePath);
            if (targetFile.exists()) {
                System.out.println("Tệp đích đã tồn tại!");
                return;
            }

            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(targetFile);

            int c;
            int count = 0;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
                count++;
            }

            inputStream.close();
            outputStream.close();

            System.out.println("Đã sao chép tệp thành công!");
            System.out.println("Tổng số ký tự trong tệp là: " + count);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc hoặc ghi tệp!");
            e.printStackTrace();
        }
    }
}

