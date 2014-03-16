package jy.quotekeeper.book;

import jy.quotekeeper.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class AddBook extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.book_add);
		
	}
	
	public void addBook(View view) {
		
		Intent intent = new Intent(getApplicationContext(), Book.class);
		startActivity(intent);
	}
	
	
    public boolean onKeyDown(int keyCode, KeyEvent event) {
		
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            Intent intent = new Intent(getApplicationContext(), Book.class);
           // intent.addCategory(Intent.CATEGORY_HOME);
           // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return true;
        }
        return false;
    }	

}
