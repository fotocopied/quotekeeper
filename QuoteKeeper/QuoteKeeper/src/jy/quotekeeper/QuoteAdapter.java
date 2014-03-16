package jy.quotekeeper;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class QuoteAdapter extends ArrayAdapter<String>{

	private final Context context;
	private final String[] values;
	
	
	public QuoteAdapter(Context context, String[] values){
		super(context, R.layout.list_with_image, values);
		this.context = context;
		this.values = values;
		
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView;
		if(convertView == null){
			rowView = inflater.inflate(R.layout.list_quote, parent, false);
			
		} else{
			rowView = convertView;	
		}	
		
		
		TextView title = (TextView) rowView.findViewById(R.id.quote);			
		Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/GABRIOLA.TTF");
		
		title.setTypeface(font);
		title.setText(values[position]);		
		
		
		return rowView;
	}
	
	
	
	
}

