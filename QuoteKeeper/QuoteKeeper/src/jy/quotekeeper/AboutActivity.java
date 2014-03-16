package jy.quotekeeper;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        
        TextView about = (TextView) findViewById(R.id.about);
        
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/LHANDW.TTF");
		about.setTypeface(font);	
        about.setText("\tQuote Keeper is an android application that lets you save quotes. \n\n\tYou can add quotes from your favorite author, book, celebrity, song and even from your awesome friend and random people. \n\n\t With Quote Keeper you can share to different social networking sites the quotes you've kept.  ");
        
	}

}
