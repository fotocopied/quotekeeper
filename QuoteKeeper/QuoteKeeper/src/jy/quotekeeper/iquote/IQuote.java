package jy.quotekeeper.iquote;

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

public class IQuote extends ListActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.header);	
		QuoteAdapter adapter = new QuoteAdapter(this, getResources().getStringArray(R.array.iquote));       
		TextView header = (TextView) findViewById(R.id.header_title);			
		Typeface font = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/ITCKRIST.TTF");
		header.setText("iQuotes");
		header.setTypeface(font);
		setListAdapter(adapter);
		
	}
	
	public void addButton (View v){
		Intent intent = new Intent (this, AddIQuote.class);
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

//	
//	public boolean onKeyDown(int keyCode, KeyEvent event) {		
//        if(keyCode == KeyEvent.KEYCODE_BACK){
//            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
//                      
//            startActivity(intent);
//            return true;
//        }
//        return false;
//	}
	
	
}
