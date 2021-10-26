package com.teen.pic;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class fragments extends Fragment {
	public static String vvar = null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v=inflater.inflate(R.layout.detailsfrag, container, false);
		TextView ob = v.findViewById(R.id.key);
		TextView ob1 = v.findViewById(R.id.key_is);
		ob1.setText("Your Key Is ");
		ob.setText(randkeygen(MainActivity.str, MainActivity.str2));
		return v;
	}

	/*@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		EditText objjj = view.findViewById(R.id.key);
		String key = randkeygen(MainActivity.str, MainActivity.str2);
		objjj.setText("hello");
		//objjj.setTextColor(R.color.abc_primary_text_material_dark);*/
	
	
	/*@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(getContext(), "Working", Toast.LENGTH_LONG).show();
		EditText o = getView().findViewById(R.id.key);
		String key = randkeygen(MainActivity.str, MainActivity.str2);
		o.setText(key);
	}*/
    
    public String randkeygen(String stringa ,String stringani){
		String Final_res = null;
		if (stringa != null && stringani != null){
			ArrayList<Integer> ob = new ArrayList<>();
			String a = "abcdefghigklmnopqrstuvwxyz";
			String b = "123456789";
			Random Num = new Random();
			for (int i=0;i<a.length();i++){
				int num = Num.nextInt(a.length());
				ob.add(num);
			}
			Final_res= null;
			for (int i=0;i<a.length();i++){
				if (Final_res == null){
					Final_res = Character.toString(a.charAt(ob.get(i)));
				}else if (i == 4 && i == 5 && i==8 && i==9){
					Final_res += Character.toString(b.charAt(ob.get(i)));
				}else{
					Final_res += Character.toString(a.charAt(ob.get(i)));
				}
			}
			//return Final_res;
		}
		
		return Final_res;
		}
	/*public void clicked(View v){
		TextView ob = getActivity().findViewById(R.id.key);
		TextView ob1 = getView().findViewById(R.id.key_is);
		ob1.setText("Your Key Is ");
		ob.setText("Jsjsksjskkdjdjd");
	}*/
}
