package com.cryoss.whereismything;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by Burak Can KOCAK on 01-Apr-18.
 */

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Button button_login,button_register;
    private EditText editText_username,editText_password;
    private CheckBox checkBox_rememberMe;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        initialViewContent();
    }

    private void initialViewContent() {
    button_login = (Button)findViewById(R.id.bLogin);
    button_register=(Button)findViewById(R.id.bRegister);
    editText_username=(EditText)findViewById(R.id.etUsername);
    editText_password=(EditText)findViewById(R.id.etPassword);
    checkBox_rememberMe=(CheckBox)findViewById(R.id.cbRememberMe);

    button_login.setOnClickListener(this);
    button_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.bLogin:
                break;
            case R.id.bRegister:
                break;
        }
    }
}
