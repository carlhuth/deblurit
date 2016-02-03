package tk.standy66.deblurit;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        TextView main = (TextView)findViewById(R.id.help_textview);
        main.setText(Html.fromHtml(getResources().getString(R.string.help_message), new Html.ImageGetter() {			
            public Drawable getDrawable(String source) {
                Drawable drawable = getResources().getDrawable(R.drawable.circle);
                drawable.setBounds(0, 0, 50, 50);
                return drawable;
                /*int id = 0;
                if (source.equals("circle"))
                    id = R.drawable.circle;
                if (id == 0)
                    return null;
                Drawable d = getResources().getDrawable(id);
                return d;*/
            }
        }, null));
    }
    
}
