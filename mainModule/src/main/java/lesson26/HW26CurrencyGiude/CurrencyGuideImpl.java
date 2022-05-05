package lesson26.HW26CurrencyGiude;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Service
@RequiredArgsConstructor
public class CurrencyGuideImpl implements CurrencyGuide {

    @SneakyThrows
    private static String readFromURI() { // используем метод private, так как доступ извне не нужен.
        StringBuilder currencyInfo = new StringBuilder();
        URL currencyURL = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
        URLConnection urlConnection = currencyURL.openConnection();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));) {
            while ((line = bufferedReader.readLine()) != null) {
                currencyInfo.append(line + "\n");
            }
        }
        return String.valueOf(currencyInfo);
    }

    @Override
    public String getCurrencyByName(String name) {
        JSONObject jObject = new JSONObject(readFromURI());
        return "1 " + jObject.getJSONObject("Valute").getJSONObject(name).getString("Name") + " = " +
                jObject.getJSONObject("Valute").getJSONObject(name).getLong("Value") + " рубль(ей)";
    }
}
