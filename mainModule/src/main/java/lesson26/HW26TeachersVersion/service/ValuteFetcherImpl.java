package lesson26.HW26TeachersVersion.service;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import lombok.SneakyThrows;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ValuteFetcherImpl implements ValuteFetcher {

    private Map<String, BigDecimal> dictionaryValutes = Collections.emptyMap();

    @SneakyThrows
    void init () {
        final DocumentContext context = JsonPath.parse(new URL("https://www.cbr-xml-daily.ru/daily_json.js"));
        final List<Map<String, Object>> valutes = context.read("$.Valute.*", List.class);// здесь значит, что будут читаться значения из поля "Valute" в JSON, а *- означает
// все вложенные в Valute поля.
        dictionaryValutes = valutes.stream() // здесь создаётся поток с маппой в которую входят названия валют по чар коду (AUD, USD, EUR)
                // и их значения и собираем все полученные данные при помощи collect в маппу.
                .map(it -> Pair.of(it.get("CharCode").toString(), new BigDecimal(it.get("Value").toString())))
                .collect(Collectors.toMap(Pair::getLeft, Pair::getRight));
    }

    // получаем информацию по валюте
    @Override
    public BigDecimal getValueByCode(String code) {
        return dictionaryValutes.get(code);
    }
}
