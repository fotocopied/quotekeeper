package jy.quotekeeper;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleListAdapter extends ArrayAdapter<String>{

	private final Context context;
	private final String[] values;
	private final int image_author[] = {R.drawable.mitch_albom, R.drawable.jk_rowling, R.drawable.nicholas_sparks, R.drawable.stephen_king, R.drawable.harper_lee, R.drawable.khalid_hosseini, R.drawable.john_green, R.drawable.paulo_coelho};
	
	public SimpleListAdapter(Context context, String[] values){
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
			rowView = inflater.inflate(R.layout.list_with_image, parent, false);			
		} 
		else
			rowView = convertView;	
			
		
		TextView title = (TextView) rowView.findViewById(R.id.title);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
		title.setText(values[position]);	
		imageView.setImageResource(image_author[position]);
		Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/GABRIOLA.TTF");
		title.setTypeface(font);
						
		return rowView;
	}
	
	
	
	
}

