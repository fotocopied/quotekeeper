package jy.quotekeeper.iquote;

import jy.quotekeeper.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddIQuote extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iquote_add);
		
	}

	public void addAuthor(View view) {
		
		Intent intent = new Intent(getApplicationContext(), IQuote.class);
		startActivity(intent);
	}
	
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//		
//        if(keyCode == KeyEvent.KEYCODE_BACK)
//        {
//            Intent intent = new Intent(getApplicationContext(), IQuote.class);
//            startActivity(intent);
//            return true;
//        }
//        return false;
//    }	
}
