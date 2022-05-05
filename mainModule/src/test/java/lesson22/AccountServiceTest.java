package lesson22;

import lesson22.dto.Account;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.List;

public class AccountServiceTest {

    @Test
    public void shouldGetMaxBalance() {
        AccountService accountService = new AccountService();
        AccountDao mock = Mockito.mock(AccountDao.class);
        Mockito.when(mock.getAccounts()).thenReturn(
                List.of(Account.builder()
                        .balance(BigDecimal.valueOf(1000))
                        .build()));
        // Mockito.verify(mock, Mockito.times(1)).getAccounts(); // проверяет на то сколько раз класс был вызван.
        Assert.assertEquals(BigDecimal.valueOf(1000), accountService.getMaxBalance(mock));
    }
}
