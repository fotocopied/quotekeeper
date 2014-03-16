package jy.quotekeeper.random;

import jy.quotekeeper.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddRandom extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.random_add);
		
	}
	
	public void addRandom(View view) {
		
		Intent intent = new Intent(getApplicationContext(), Random.class);
		startActivity(intent);
	}
	
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//		
//        if(keyCode == KeyEvent.KEYCODE_BACK)
//        {
//            Intent intent = new Intent(getApplicationContext(), Random.class);
//            startActivity(intent);
//            return true;
//        }
//        return false;
//    }	

}
