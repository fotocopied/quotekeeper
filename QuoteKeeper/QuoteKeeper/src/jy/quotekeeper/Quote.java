package jy.quotekeeper;


import jy.quotekeeper.QuoteAdapter;
import jy.quotekeeper.R;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.AdapterContextMenuInfo;

public class Quote extends ListActivity {
	
	Intent intent;
	private String[]quote; 
	AdapterContextMenuInfo info;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.header);
		quote = getResources().getStringArray(R.array.divergent);
		TextView title = (TextView) findViewById(R.id.header_title);			
		Typeface font = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/ITCKRIST.TTF");
		title.setTypeface(font);
		
		QuoteAdapter adapter = new QuoteAdapter(this, quote);   
        setListAdapter(adapter);
        registerForContextMenu(getListView());
		
	}
	
	
	
	public void addButton (View v){
		Intent intent = new Intent (this, AddQuote.class);
		startActivity(intent);
	}
	

	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);		
		String item = (String) getListAdapter().getItem(position);
		Intent intent = new Intent().setClass(this, ViewQuote.class);
		intent.putExtra("quote", item);
		startActivity(intent);
	}

	 /**
		 * This will be invoked when an item in the listview is long pressed.
		 * @Author JamolaRF
		 */
	   @Override
	    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
	        super.onCreateContextMenu(menu, v, menuInfo);
	        getMenuInflater().inflate(R.menu.actions, menu);
	    }
	 
		 /**
		 * This will be invoked when a menu item is selected.
		 * @Author JamolaRF
		 */
	    @Override
	    public boolean onContextItemSelected(MenuItem item) {
	    	
	    	info = (AdapterContextMenuInfo) item.getMenuInfo();
	        switch(item.getItemId()){
	            case R.id.cnt_mnu_add:
	            	   /*code here for checking if exercise already exist in the FavoritList*/
			                Toast.makeText(this, "Quote added to your Favorites"  , Toast.LENGTH_SHORT).show();		            	            		
	            		break;

	           case R.id.cnt_mnu_open:
		        	   String items = (String) getListAdapter().getItem(info.position);
			       		Intent intent = new Intent().setClass(this, ViewQuote.class);
			       		intent.putExtra("quote", items);
			       		startActivity(intent);
	            		Toast.makeText(this,  "Quote Viewed", Toast.LENGTH_SHORT).show();
	            	
	            	
	            	break;
	        }
	        return true;
	    }
}
