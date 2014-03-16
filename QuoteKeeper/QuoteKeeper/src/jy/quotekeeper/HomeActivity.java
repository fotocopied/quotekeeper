package jy.quotekeeper;

import jy.quotekeeper.author.Author;
import jy.quotekeeper.book.Book;
import jy.quotekeeper.iquote.IQuote;
import jy.quotekeeper.random.Random;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeActivity  extends Activity{

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);   
        Button txt = (Button) findViewById(R.id.author); 
        Button txtBook = (Button) findViewById(R.id.book);
        Button txtiQuote = (Button) findViewById(R.id.iquote);
        Button txtRandom = (Button) findViewById(R.id.random);
        Typeface font = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/GABRIOLA.TTF");  
        txt.setTypeface(font);
        txtBook.setTypeface(font);
        txtiQuote.setTypeface(font);
        txtRandom.setTypeface(font);

    }
    
    
    public void onClickAuthor(View v){
    	
    	Intent intent =  new Intent(this, Author.class);
		startActivity(intent);
    }
    
    
    public void onClickBook(View v){
    	
    	Intent intent =  new Intent(this, Book.class);
		startActivity(intent);
    }
    
    
    public void onClickQuote(View v){
    	
    	Intent intent =  new Intent(this, IQuote.class);
		startActivity(intent);
    }
    
    
    public void onClickRandom(View v){
    	
    	Intent intent =  new Intent(this, Random.class);
		startActivity(intent);
    }
    


    
    
}
