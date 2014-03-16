package jy.quotekeeper.random;

import jy.quotekeeper.QuoteAdapter;
import jy.quotekeeper.R;
import jy.quotekeeper.ViewQuote;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class Random extends ListActivity {

	
	Intent intent;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.header);	
		QuoteAdapter adapter = new QuoteAdapter(this, getResources().getStringArray(R.array.random));       
		TextView header = (TextView) findViewById(R.id.header_title);			
		Typeface font = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/ITCKRIST.TTF");
		header.setText("Random");
		header.setTypeface(font);
		setListAdapter(adapter);
		
	}
	
	
	
	public void addButton (View v){
		Intent intent = new Intent (this, AddRandom.class);
		startActivity(intent);
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);		
		String item = (String) getListAdapter().getItem(position);
		Intent intent = new Intent().setClass(this, ViewQuote.class);
		intent.putExtra("quote", item);
		startActivity(intent);
	}
//	public boolean onKeyDown(int keyCode, KeyEvent event) {		
//        if(keyCode == KeyEvent.KEYCODE_BACK){
//            Intent intent = new Intent(getApplicationContext(), TabsActivity.class);
//                      
//            startActivity(intent);
//            return true;
//        }
//        return false;
//	}


}
