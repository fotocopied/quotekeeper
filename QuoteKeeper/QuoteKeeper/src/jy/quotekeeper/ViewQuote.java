package jy.quotekeeper;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewQuote extends Activity{
	@Override
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_edit_quote);
		
		TextView quote = (TextView)findViewById(R.id.quote);
		
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/GABRIOLA.TTF");
        quote.setTypeface(custom_font);	
       
	}
	
	public void editButton (View v){
		setContentView(R.layout.view_quote);
		TextView quote = (TextView)findViewById(R.id.textView1);
		
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/GABRIOLA.TTF");
        quote.setTypeface(custom_font);	
	}
	
	public void saveButton (View v){
		setContentView(R.layout.view_edit_quote);
		TextView quote = (TextView)findViewById(R.id.quote);
		
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/GABRIOLA.TTF");
        quote.setTypeface(custom_font);	
	}
	
	public void cancelButton (View v){
		setContentView(R.layout.view_edit_quote);
		TextView quote = (TextView)findViewById(R.id.quote);
		
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/GABRIOLA.TTF");
        quote.setTypeface(custom_font);	
	}
	
	
	
}
