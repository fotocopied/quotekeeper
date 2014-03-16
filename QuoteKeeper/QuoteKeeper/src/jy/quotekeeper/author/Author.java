package jy.quotekeeper.author;

import jy.quotekeeper.R;
import jy.quotekeeper.SimpleListAdapter;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import jy.quotekeeper.Quote;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;


public class Author extends ListActivity  {
	
	Intent intent;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.header);
		TextView header = (TextView) findViewById(R.id.header_title);			
		Typeface font = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/ITCKRIST.TTF");
		header.setText("Famous Authors");
		header.setTypeface(font);
		
		
		
		String[] author = getResources().getStringArray(R.array.authors);		
		SimpleListAdapter adapter = new SimpleListAdapter(this, author);           
		setListAdapter(adapter);
		
	}
	
	
	public void addButton (View v){
		Intent intent = new Intent (this, AddAuthor.class);
		startActivity(intent);
	}
	


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String item = (String) getListAdapter().getItem(position);
		Intent intent = new Intent().setClass(this, Quote.class);
		intent.putExtra("message", item);
		startActivity(intent);
	}
	
	

}
