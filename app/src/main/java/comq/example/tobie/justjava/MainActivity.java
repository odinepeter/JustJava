package comq.example.tobie.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Currency;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //the method is called when the plus(+) button is clicked
    public void increment(View view){
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    //the method is called when the minus(-) button is clicked
    public void decrement(View view){
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
    //the method is called when the order button is clicked
    public void submitOrder(View view){
        String priceMessage = "Free of charge";
        displayMessage(priceMessage);
    }
    private void displayQuantity(int number){
        TextView quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" +number);
    }
    private void displayPrice(int Number){
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(Number));

    }
    public void displayMessage(String message){
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
