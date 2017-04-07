package com.lingfengchen.justjava;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    int quantity =0;


    public void increment(View view){

        display(++quantity);
    }
    public void decrement(View view){

        display(--quantity);

    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

//2A
//        display(1);
//        displayPrice(2*5);

//        int numberOfCoffees = 2;
//        display(numberOfCoffees);
//        displayPrice(numberOfCoffees*5);

//2B
//        display(quantity);
//        displayPrice(quantity*5);

//        String priceMessage = "Amount due " + NumberFormat.getCurrencyInstance().format(quantity*5);
//        String priceMessage = "That would be " + NumberFormat.getCurrencyInstance().format(quantity*5) +" please";
//        String priceMessage = "You owe  " + quantity +" bucks,dude!" ;
//        String priceMessage =  NumberFormat.getCurrencyInstance().format(quantity) + " for " + quantity +" cups of coffee.Pay up.";
        String priceMessage = "Total : " + NumberFormat.getCurrencyInstance().format(quantity*5);


        displayMessage(priceMessage);


    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
