package lesson26.HW26TeachersVersion.service;

import java.math.BigDecimal;

public interface ValuteFetcher {

    BigDecimal getValueByCode(String code);
}
