package lesson28.HW28Archivator;

import lesson28.HW28Archivator.service.ZipUnzipService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@SpringBootApplication
public class ZipRunner {

    public static void main(String[] args) {

        final ConfigurableApplicationContext appContext = SpringApplication.run(UnzipRunner.class, args);
        final ZipUnzipService dearchivator = appContext.getBean(ZipUnzipService.class);

        boolean isErrorHappened = false;

        do {
            System.out.print("Укажите путь до файла, который необходимо заархивировать: ");
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                String txt = scanner.next();
                System.out.println(txt + " не ялвляется путём до файла, попробуйте ещё раз");
            }
            Path filePath = Paths.get(scanner.next());

            System.out.print("Укажите имя архива: ");
            scanner = new Scanner(System.in);
            String archiveName = scanner.next() + ".zip";

            try {
                dearchivator.zipFile(filePath, archiveName);
                isErrorHappened = false;
            } catch (Exception e) {
                System.out.println("Фаил не найдет или выбрана неверная операция");
                isErrorHappened = true;
            }
        } while (isErrorHappened);
    }
}
