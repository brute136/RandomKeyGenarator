package com.teen.pic;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.Toast;
import java.util.HashMap;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    ImageView ob;
	public static String str = null;
	public static String str2 = null;
	FrameLayout objjjj;
	EditText num,num1;
	static HashMap<String ,String> listOfLogin = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		ob = findViewById(R.id.image);
		num = findViewById(R.id.username);
		num1 = findViewById(R.id.password);
		objjjj = findViewById(R.id.frame);
	}
	
	//onClick Button
    public void login1(View v){
		//Toast.makeText(this, "Work",1).show();
		Log.i("macaz", "buton work");
		String number = num.getText().toString();
		String number1 = num1.getText().toString();
		str = number;
		str2 = number1;
		listOfLogin.put("nishantanath@nikita.gmail.com", "OOOOO12345");
		listOfLogin.put("hitesh@nathn.gmail.com", "OOOOO12345");
		if (number != null && number1 != null){
			if(number.endsWith("gmail.com") && number.indexOf("@") != -1 && listOfLogin.containsKey(number) && listOfLogin.get(number).equals(number1)){
				fragments ob = new fragments();
				Log.i("frag", "obj work");
				FragmentManager frag = getSupportFragmentManager();
				Log.i("frag", "work 1");
				FragmentTransaction frag1 = frag.beginTransaction();
				Log.i("frag", "work 2");
				frag1.replace(R.id.frame,ob);
				Log.i("frag", "work 3");
				frag1.commit();
				
		}
		else{
			num.setText(null);
			num.setHint("Enter Your Email Again");
			num1.setText(null);
			num1.setHint("Enter Password Again");
		}
		}
	}
	public void intent(View v){
		Intent o = new Intent(this, CreateAdd.class);
		startActivity(o);
	}
}
