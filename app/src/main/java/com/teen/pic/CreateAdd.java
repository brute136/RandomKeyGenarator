package com.teen.pic;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
public class CreateAdd extends AppCompatActivity {
	EditText obj1, obj2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_createnewaccount);
		obj1 = findViewById(R.id.key1);
		obj2 = findViewById(R.id.value);
	}
    public void add(View v){
		String ob = obj1.getText().toString();
		String obj = obj2.getText().toString();
		if(ob != null && obj != null && ob.endsWith("gmail.com") && ob.indexOf("@") != -1){
			MainActivity.listOfLogin.put(ob, obj);
			Intent object = new Intent(this, MainActivity.class);
			startActivity(object);
		}else{
			obj1.setText(null);
			obj1.setHint("Enter Your Email Again");
			obj2.setText(null);
			obj2.setHint("Enter Your Password Again");
		}
	}
    
}
