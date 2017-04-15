package com.example.lotus.coffeeorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

import static android.R.attr.duration;
import static android.R.attr.name;


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
        }else{
            Toast.makeText(getApplicationContext(), "At least 1 cup should be ordered, Thanks!",Toast.LENGTH_LONG).show();
        }
        display(quantity);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox whippedCream = (CheckBox) findViewById(R.id.is_whipped_cream);
        CheckBox chocolate = (CheckBox) findViewById(R.id.is_chocolate);
        Boolean is_whippedCream = whippedCream.isChecked();
        Boolean is_chocolate = chocolate.isChecked();
        int totalPrice = orderPrice(is_whippedCream,is_chocolate);
        EditText nameField = (EditText) findViewById(R.id.Name_field);
        String name = nameField.getText().toString();
        displayMessage(orderSummary(name,is_whippedCream,is_chocolate,totalPrice));
    }

    private String orderSummary(String Name, Boolean is_whippedCream, Boolean is_chocolate, int totalPrice){
        String message = "Name: "+Name;
        message += "\nAdd whipped cream? " + is_whippedCream;
        message += "\nAdd chocolate? " + is_chocolate;
        message += "\nQuantity:"+quantity;
        message += "\nPrice: "+totalPrice;
        message += "\nThank you!!";
        return(message);
    }

    private int orderPrice(Boolean is_whippedCream, Boolean is_chocolate){
        int price = 5;
        price+=(is_whippedCream)?1:0;
        price+=(is_chocolate)?2:0;
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
