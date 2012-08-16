package edu.diego.sampleapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
    
    public void signInClick(View view){
    	TextView textView = (TextView)findViewById(R.id.textView1);
    	EditText userName = (EditText)findViewById(R.id.editText1);
    	
    	textView.setText("Hello "+userName.getText()+", Thanks for signing IN");
    }
}
