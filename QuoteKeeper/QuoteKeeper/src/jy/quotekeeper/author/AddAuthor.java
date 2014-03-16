package jy.quotekeeper.author;

import jy.quotekeeper.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddAuthor extends Activity {
	
	EditText author;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.author_add);
		author = (EditText) findViewById(R.id.authorName);
	}
	
	public void addAuthor(View view) {	
		Intent objIntent = new Intent(getApplicationContext(), Author.class);
		startActivity(objIntent);
		Toast.makeText(this, "Author succesfully added"  , Toast.LENGTH_SHORT).show();
	}
	

}
