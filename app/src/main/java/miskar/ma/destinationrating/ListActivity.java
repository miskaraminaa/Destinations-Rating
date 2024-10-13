package miskar.ma.destinationrating;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ShareCompat;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import miskar.ma.destinationrating.R;
import miskar.ma.destinationrating.adapter.StarAdapter;
import miskar.ma.destinationrating.beans.Star;
import miskar.ma.destinationrating.service.StarService;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private List<Star> stars;
    private RecyclerView recyclerView;
    private StarService service;
    private StarAdapter starAdapter = null;
    private Toolbar myToolbar;

    public ListActivity() {
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("RateScape");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gold)));

        stars = new ArrayList<>();
        service = StarService.getInstance();
        init();
        recyclerView = findViewById(R.id.recycle_view);
        stars = service.findAll();
        starAdapter = new StarAdapter(this, stars);
        recyclerView.setAdapter(starAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void filterList(String s) {
        List<Star> filtredList = new ArrayList<>();
        for (Star star : stars) {
            if (star.getName().toLowerCase().startsWith(s.toLowerCase().trim())) {
                filtredList.add(star);
            }

            starAdapter.setFiltredList(filtredList);
        }
    }

    public void init() {
        service.create(new Star("Hassan II Mosque", "https://i.pinimg.com/originals/86/7c/e9/867ce91f62feb7ba78329d7b0fd9812c.jpg", 0f, R.mipmap.morocco));
        service.create(new Star("Big Ben", "https://www.grunge.com/img/gallery/the-untold-truth-of-big-ben/l-intro-1662495790.jpg", 0f, R.mipmap.uk));
        service.create(new Star("Tower of London", "https://www.tripsavvy.com/thmb/MX80EDRwvfnnd0qOwVuYXC5c9bc=/3862x2578/filters:fill(auto,1)/uk--london--tower-of-london-152890712-5b0b4fd23418c6003845a59c.jpg", 4.5f, R.mipmap.uk));
        service.create(new Star("Eiffel Tower", "https://upload.wikimedia.org/wikipedia/commons/a/a8/Tour_Eiffel_Wikimedia_Commons.jpg", 0f, R.mipmap.france));
        service.create(new Star("Mount Rushmore", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Mount_Rushmore_detail_view_%28100MP%29.jpg/1200px-Mount_Rushmore_detail_view_%28100MP%29.jpg", 4.6f, R.mipmap.usa));
        service.create(new Star("Great Wall of China", "https://i.pinimg.com/736x/c6/ea/e6/c6eae696ac775bf416a99d2cf6c722d2.jpg", 1f, R.mipmap.china));
        service.create(new Star("Machu Picchu", "https://www.mapiperutravel.com/wp-content/uploads/2013/02/machupicchu-shop.jpg", 0f, R.mipmap.peru));
        service.create(new Star("Colosseum", "https://www.pngall.com/wp-content/uploads/12/Colosseum-Ancient-Rome-PNG-Image.png", 0f, R.mipmap.italy));
        service.create(new Star("Sydney Opera House", "https://lh6.googleusercontent.com/-SyT7KYU5t4c/TXD44T1knPI/AAAAAAAAAp8/RYRhdVnrmBg/s1600/Sydney+Opera+House..jpg", 1.5f, R.mipmap.australia));
        service.create(new Star("Santorini", "https://www.ugoceiphotography.com/wp-content/uploads/2017/12/20160905-DSCF2743-HDR.jpg", 0f, R.mipmap.greece));
        service.create(new Star("Statue of Liberty", "https://www.agitano.com/wp-content/uploads/2023/04/agitano-new-york-besuchen-freiheitsstatue.jpg", 4.4f, R.mipmap.usa));
        service.create(new Star("Taj Mahal", "https://upload.wikimedia.org/wikipedia/commons/d/da/Taj-Mahal.jpg", 1.9f, R.mipmap.india));
        service.create(new Star("Christ the Redeemer", "https://i.pinimg.com/originals/35/03/26/3503267f6c720bdd843141db92e90f48.jpg", 0.8f, R.mipmap.brazil));
        service.create(new Star("Pyramids of Giza", "https://upload.wikimedia.org/wikipedia/commons/e/e3/Kheops-Pyramid.jpg", 1.7f, R.mipmap.egypt));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.app_bar_search).getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (starAdapter != null){
                    starAdapter.getFilter().filter(newText);
                }
                return true;
            }
        });
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.share){
            String txt = "Stars";
            String mimeType = "text/plain";
            ShareCompat.IntentBuilder
                    .from(this)
                    .setType(mimeType)
                    .setChooserTitle("Stars")
                    .setText(txt)
                    .startChooser();
        }
        return super.onOptionsItemSelected(item);
    }
}