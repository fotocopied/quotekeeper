package jy.quotekeeper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddQuote extends Activity {
	
	EditText quote;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_quote);
	
	}
	
		public void addQuote(View view) {
			
			Intent intent = new Intent(getApplicationContext(), Quote.class);			
			startActivity(intent);
			Toast.makeText(this, "Author succesfully added"  , Toast.LENGTH_SHORT).show();
		}
		

}
