 package jy.quotekeeper;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class TabsActivity extends TabActivity{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        
        TabHost tabHost = getTabHost();
        
        // ABOUT_TAB
        TabSpec aboutSpec = tabHost.newTabSpec("About");
        aboutSpec.setIndicator("", getResources().getDrawable(R.drawable.info));
        Intent photosIntent = new Intent(this, AboutActivity.class);
        aboutSpec.setContent(photosIntent);
        
        // HOME_TAB
        TabSpec homeSpec = tabHost.newTabSpec("Home");
        // setting Title and Icon for the Tab
        homeSpec.setIndicator("", getResources().getDrawable(R.drawable.home));
        Intent songsIntent = new Intent(this, HomeActivity.class);
        homeSpec.setContent(songsIntent);
        
        // FAVORITES_TAB
        TabSpec faveSpec = tabHost.newTabSpec("Favorites");
        faveSpec.setIndicator("", getResources().getDrawable(R.drawable.star));
        Intent videosIntent = new Intent(this, Favorites.class);
        faveSpec.setContent(videosIntent);
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(aboutSpec); // Adding photos tab
        tabHost.addTab(homeSpec); // Adding songs tab
        tabHost.addTab(faveSpec); // Adding videos tab
        
        tabHost.setCurrentTab(1);
        
    }
}
