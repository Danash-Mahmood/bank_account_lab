import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;



    @BeforeEach
    public void setUp() {

        bankAccount = new BankAccount("John", "Smith", "04/08/2001", 1234, 0,"Savings",0);

    }


    @Test
    public void checkSetFirstName() {
        bankAccount.setFirstName("Danash");
        assertThat(bankAccount.getFirstName()).isEqualTo("Danash");
    }

    @Test
    public void checkSetLastName(){
        bankAccount.setLastName("Mahmood");
        assertThat(bankAccount.getLastName()).isEqualTo("Mahmood");

    }

    @Test
    public void checkGetFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("John");
    }

    @Test
    public void checkGetLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Smith");
    }

    @Test
    public void checkGetDateOfBirth(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("04/08/2001");
    }

    @Test

    public void checkSetDateOfBirth(){
        bankAccount.setDateOfBirth("04/08/1990");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("04/08/1990");
    }

    @Test

    public void checkGetAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(1234);
    }

    @Test
    // this method isn't working

    public void checkSetAccountNumber(){
        bankAccount.setAccountNumber(3123);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(3123);
    }

    @Test
    public void checkGetBalance(){
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test

    public void checkDeposit(){
        bankAccount.deposit(134.50);
        assertThat(bankAccount.getBalance()).isEqualTo(134.50);
    }

    @Test

    public void checkWithdraw(){
        bankAccount.withdraw(10);
        assertThat(bankAccount.getBalance()).isEqualTo(-10);
    }

    @Test
    public void checkPayInterest(){
        bankAccount.deposit(100.0);
        bankAccount.payInterest(0.05);
        assertThat(bankAccount.getBalance()).isEqualTo(105.0);
    }

    @Test

    public void checkGetAccountType(){
        assertThat(bankAccount.getAccountType()).isEqualTo("Savings");
    }

    @Test

    public void checkSetAccountType(){
        bankAccount.setAccountType("Current");
        assertThat(bankAccount.getAccountType()).isEqualTo("Current");

    }

    @Test
    public void checkGetOverdraft(){
        assertThat(bankAccount.getOverdraft()).isEqualTo(0);
    }










}






















