package com.codekul.androidstart;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements View.OnClickListener{

    private EditText edtUserName,editPwd;
    private Button btnOkay,btnTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUserName = (EditText) findViewById(R.id.edtUserName);
        editPwd = (EditText) findViewById(R.id.edtPassword);

        btnOkay = (Button) findViewById(R.id.btnOkay);
        btnTemp = (Button) findViewById(R.id.btnTemp);

        //btnOkay.setOnClickListener(new Click());
        //btnOkay.setOnClickListener(this);
//        btnOkay.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                String userName = edtUserName.getText().toString();
//                edtUserName.setText(userName.toUpperCase());
//            }
//        });

        /*btnOkay.setOnClickListener(v -> {

        });*/

        //loadUiUsingCode();
    }

    private void loadUiUsingCode(){

        ViewGroup.LayoutParams rootLayoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setLayoutParams(rootLayoutParams);

        //ViewGroup.LayoutParams edtLayoutParams = new ViewGroup.LayoutParams(500,150);
        ViewGroup.LayoutParams edtLayoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText edtName = new EditText(this);
        edtName.setHint("User Name");
        edtName.setLayoutParams(edtLayoutParams);
        rootLayout.addView(edtName);

        ViewGroup.LayoutParams btnLayoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Button btnOkay = new Button(this);
        btnOkay.setLayoutParams(btnLayoutParams);
        btnOkay.setText("Okay");
        rootLayout.addView(btnOkay);

        setContentView(rootLayout);
    }

    @Override
    public void onClick(View v) {

    }

    private class Click implements View.OnClickListener {

        @Override
        public void onClick(View v) {

        }
    }

    void clickMe(View v){
//        Log.i("@codekul","clicked");

        if(v.getId() == /*btnOkay.getId()*/ R.id.btnOkay) {
            String userName = edtUserName.getText().toString();
            edtUserName.setText(userName.toUpperCase());
            Log.i("@codekul","Okay Button");
            if(editPwd.getText().toString().equals("123"))
            {
                edtUserName.setTextColor(Color.BLUE);
            }
        }
        else if(v.getId() == R.id.btnTemp){

            btnTemp.setVisibility(View.GONE);

            Log.i("@codekul","Temp Button");

        }
    }
}
