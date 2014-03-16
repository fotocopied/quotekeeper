package jy.quotekeeper;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Favorites extends ListActivity {
	
	Intent intent;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] fave = getResources().getStringArray(R.array.favorite_quotes);
		
		QuoteAdapter adapter = new QuoteAdapter(this, fave);       
        
        
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String item = (String) getListAdapter().getItem(position);
		Intent intent = new Intent().setClass(this, ViewQuote.class);
		intent.putExtra("message", item);
		startActivity(intent);
	}

}
