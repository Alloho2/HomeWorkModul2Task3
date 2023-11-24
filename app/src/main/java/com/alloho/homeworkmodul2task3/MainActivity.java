package com.alloho.homeworkmodul2task3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int priceRobot = 45000;
    private int bankAccount = 700;
    private int percentPerYear = 9;
    private int cashReceipts = 1700;
    private int amountMonth = 0;

    private int bank(int account, int percent, int month) {
        return (account + (account * percent / 100 / 12));
    }

    private void refillBankAccount() {
        bankAccount = bankAccount + cashReceipts;
    }

    private TextView textOut;

    private void calculation() {
        for (int i = 0; i <= priceRobot; i++) {
            i = bank(bankAccount, percentPerYear, amountMonth);
            refillBankAccount();
            amountMonth++;

        }


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        textOut = findViewById(R.id.textOut);
        calculation();
        textOut.setText("Для накопления необходимо месяцев: " + amountMonth);

    }
}
