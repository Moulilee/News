package e.hp.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] news1={"Massive search On Air Craft","Morgan Stanley Sees Recession","Indian pilots spot 5 bodies","Jasprit Bumrah undergoes doping test"};
    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls=(ListView)this.findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,news1);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent goto1 = new Intent(MainActivity.this, new1.class);
                        startActivity(goto1);
                        break;
                    case 1:
                        Intent goto2 = new Intent(MainActivity.this, new2.class);
                        startActivity(goto2);
                        break;
                    case 2:
                        Intent goto3 = new Intent(MainActivity.this, new3.class);
                        startActivity(goto3);
                        break;
                    case 3:
                        Intent goto4 = new Intent(MainActivity.this, new4.class);
                        startActivity(goto4);
                        break;

                }
            }
        });
    }
}
