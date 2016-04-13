package com.example.bek005.cse110_lab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.bek005.cse110_lab3.MainActivity;
import com.example.bek005.cse110_lab3.R;

/**
 * Created by bek005 on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_sum() {
        mainActivity = getActivity();

        TextView num1 = (TextView) mainActivity.findViewById(R.id.textView2);
        String number = num1.getText().toString();
        int one = Integer.parseInt(number);

        TextView num2 = (TextView) mainActivity.findViewById(R.id.textView2);
        String number2 = num2.getText().toString();
        int two = Integer.parseInt(number2);

        assertEquals(mainActivity.sum(one, two), 3);
    }
}
