package com.example.bek005.cse110_lab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
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

        EditText num1 = (EditText) mainActivity.findViewById(R.id.EditText3);
        String number = num1.getText().toString();
        int one = Integer.parseInt(number);

        EditText num2 = (EditText) mainActivity.findViewById(R.id.EditText3);
        String number2 = num2.getText().toString();
        int two = Integer.parseInt(number2);

        assertEquals(mainActivity.sum(one, two), 3);
    }
}
