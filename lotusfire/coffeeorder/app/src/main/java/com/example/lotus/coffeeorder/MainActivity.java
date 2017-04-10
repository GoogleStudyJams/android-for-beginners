package com.example.lotus.coffeeorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view){
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view){
        if(quantity>0){
            quantity = quantity - 1;
        }
        display(quantity);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int totalPrice = orderPrice();
        CheckBox whippedCream = (CheckBox) findViewById(R.id.is_whipped_cream);
        CheckBox chocolate = (CheckBox) findViewById(R.id.is_chocolate);
        Boolean is_whippedCream = whippedCream.isChecked();
        Boolean is_chocolate = chocolate.isChecked();
        String message = "Name:Lotus";
        message += "\nAdd whipped cream? " + is_whippedCream;
        message += "\nAdd chocolate? " + is_chocolate;
        message += "\nQuantity:"+quantity;
        message += "\nPrice: "+totalPrice;
        message += "\nThank you!!";
        displayMessage(message);
    }

    private int orderPrice(){
        int price = 5;
        return(quantity*price);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }

}
