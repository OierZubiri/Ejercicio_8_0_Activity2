package com.example.ejercicio_8_0_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void lanzarAcercaDe(View view){
		Intent i = new Intent(this, AcercaDeActivity.class);
		startActivity(i);
		System.out.println("Prueba");
	}


}