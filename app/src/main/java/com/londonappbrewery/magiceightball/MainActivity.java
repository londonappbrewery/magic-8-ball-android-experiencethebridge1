package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Define variables/assign, cast if needed
         * Linking elements from xml to java activity
         * Create a variable of type ImageView named
         * ballDisplay, declare. */

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        /** Create a variable called ballArray.  Set ballArray to contain the references
         *  to the 5 images in the drawable folder.  Refer to ball pictures using R.drawable.ball1,
         *  etc.
         */

        final ImageView ball1;
        ball1 = findViewById(R.drawable.ball1);

        final ImageView ball2;
        ball2 = findViewById(R.drawable.ball2);

        final ImageView ball3;
        ball3 = findViewById(R.drawable.ball3);

        final ImageView ball4;
        ball4 = findViewById(R.drawable.ball4);

        final ImageView ball5;
        ball5 = findViewById(R.drawable.ball5);


        final int[] ballArray = { R.drawable.ball1,
        R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        /** Link the askButton in the layout to the Java code.
         * Store the button in a variable called myButton **/

        Button myButton;
        myButton = findViewById(R.id.askButton);

        // Set listener
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activates each time the ask button is pressed
                Log.d("magic-8-ball-android-experiencethebridge1", "Ze button has been smashed!");

                // Upon button push, create random number for 8ball images.
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);

                ballDisplay.setImageResource(ballArray[number]);

            }


        });
    }
}
