package enterprise.sample.com.show_popup_within_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    PopupMenu popupmenu ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                PopMenuDisplay();

            }
        });
    }

    public void PopMenuDisplay() {

        popupmenu = new PopupMenu(MainActivity.this, button);

        popupmenu.getMenuInflater().inflate(R.menu.pop_up_menu, popupmenu.getMenu());

        popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

            public boolean onMenuItemClick(MenuItem item) {

                Toast.makeText(MainActivity.this, item.getTitle(),Toast.LENGTH_LONG).show();

                return true;
            }
        });

        popupmenu.show();

    }
}
