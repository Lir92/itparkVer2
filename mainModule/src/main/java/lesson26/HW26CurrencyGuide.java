package lesson26;

import lombok.SneakyThrows;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HW26CurrencyGuide {

    public static void main(String[] args) {
        String currencyName = getCurrency();
//        long quantity = getQuantity();
        String uriAPI = "https://www.cbr-xml-daily.ru/daily_json.js";
        String currencyInfo = readFromURI(uriAPI);
        System.out.println(currencyInfo);
        JSONObject jObject = new JSONObject(currencyInfo);
        System.out.println("1 " + jObject.getJSONObject("Valute").getJSONObject(currencyName).getString("Name") + " = " +
                jObject.getJSONObject("Valute").getJSONObject(currencyName).getLong("Value") + " рубль(ей)");
    }

    @SneakyThrows
    private static String readFromURI (String uriAPI) {
        StringBuilder weatherInfo = new StringBuilder();
        URL weatherURL = new URL(uriAPI);
        URLConnection urlConnection = weatherURL.openConnection();
        String line;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        while ((line = bufferedReader.readLine()) != null) {
            weatherInfo.append(line + "\n");
        }
        bufferedReader.close();
        return String.valueOf(weatherInfo);
    }

    private static String getCurrency() {
        System.out.print("Введите валюту: ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            String number = scanner.next();
            System.out.println(number + " - вы ввели число, а не название города");
        }
        return scanner.next();
    }

//    private static long getQuantity() {
//        System.out.print("Введите число для конвертирования: ");
//        Scanner scanner = new Scanner(System.in);
//        while (!scanner.hasNextInt()) {
//            String number = scanner.next();
//            System.out.println(number + " - вы ввели не число");
//        }
//        return scanner.nextLong();
//    }
}