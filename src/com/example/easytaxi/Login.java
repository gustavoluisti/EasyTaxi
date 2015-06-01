package com.example.easytaxi;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity{
	
	 	private TextView lblGotoRegister;
	    private Button btnLogin;
	    private EditText inputUsuario;
	    private EditText inputPassword;
	    private TextView loginErrorMsg;
	    
	   
        @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login);
	        inputUsuario = (EditText) findViewById(R.id.usuario);
	        inputPassword = (EditText) findViewById(R.id.password);
	        btnLogin = (Button) findViewById(R.id.btnLogin);
	        loginErrorMsg = (TextView) findViewById(R.id.login_error);
	        
	    }
	    public void Login(View vista){
	    	
    	 Intent nv=new Intent(this, MainActivity.class);
    	 startActivity(nv);
    }
}
