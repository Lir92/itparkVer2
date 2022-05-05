package lesson18.HW18;

import lombok.SneakyThrows;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {

        String fileToRead = "/file.txt";
        String filePathForName = "D:\\test\\.txt";

        new Thread(() -> Runner.
                writeToFile(Runner.class.getResourceAsStream(fileToRead), filePathForName)).start();
    }

    @SneakyThrows
    public static void writeToFile(InputStream is, String readyFile) {
        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(is))) {
            String[] pathForNewFiles = readyFile.split("\\."); // здесь помещаем название файла в массив и разделяем его "." точкой
            // на 2 части: [0] - тест до разделителя, [1] - текст после разделителя. Таким образом мы получаем возможность создавать номерные файлы

            int counter = 1;
            while (br.ready()) {
                String heading = Arrays.toString(createFileName());
                FileWriter fileWriter = new FileWriter(pathForNewFiles[0] + " " + heading + " " + counter + "." + pathForNewFiles[1]); // тут создаём новый файл с именем по первой строке в файле
                fileWriter.write(br.readLine());
                fileWriter.close();
                counter ++;
            }

//            while (br.ready()) {
//                FileWriter fileWriter = new FileWriter("New file" + counter + ".txt"); // создаём файл с префиксом "New file" и расширением "txt"
//                fileWriter.write(br.readLine());
//                fileWriter.close();
//                counter ++;
//            }
        }
    }

    @SneakyThrows
    public static String[] createFileName() {
        String path = "D:\\test\\test.txt";
        StringBuilder sb = new StringBuilder();
        try (Scanner scan = new Scanner(new File(path))) {
            sb.append(scan.nextLine());
            scan.useDelimiter("!");
        }
//        String[] array = sb.toString().split("\n"); // тоже, что и ниже
//        return array;

        return sb.toString().split("\n");
    }
}