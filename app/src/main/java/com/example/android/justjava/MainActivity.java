package com.example.android.justjava;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
public class MainActivity extends AppCompatActivity {
    TextView quantityTxt;
    TextView priceTxt;
    int quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityTxt=(TextView) findViewById(R.id.quantity_txt);
        priceTxt=findViewById(R.id.price_text_view);

    }
    public void submitOrder(View View){
        int quantity= Integer.parseInt(quantityTxt.getText().toString());
        displayPrice(quantity*5);
    }

    private void displayPrice(int number){
        priceTxt.setText("$"+NumberFormat.getInstance().format(number));
    }

    public void incrementNumber(View view) {
        quantity= Integer.parseInt(quantityTxt.getText().toString());
        quantity++;
        quantityTxt.setText(""+quantity);


    }



    public void decrementNumber(View view) {
        quantity= Integer.parseInt(quantityTxt.getText().toString());
        quantity--;
        quantityTxt.setText(""+quantity);

    }
}
