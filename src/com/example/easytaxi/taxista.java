package com.example.easytaxi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class taxista extends Activity {

		private Button BotonTaxi; 
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.detalle_taxi);
	        
	       
	        
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
	    public void pedirgps(View vista){
	    	BotonTaxi = (Button) findViewById(R.id.btngps);
	    	 //Intent nv=new Intent(this.taxista.class);
	    	 //startActivity(nv);
	    }
	    
	}
