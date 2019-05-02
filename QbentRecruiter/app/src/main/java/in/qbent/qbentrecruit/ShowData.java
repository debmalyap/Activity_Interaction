package in.qbent.qbentrecruit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Intent intent = getIntent();

        String string1 = intent.getStringExtra("efname");
        String string2 = intent.getStringExtra("elname");
        String string3 = intent.getStringExtra("epage");
        String string4 = intent.getStringExtra("mail");
        String string5 = intent.getStringExtra("cpname");

        TextView textView1 = findViewById(R.id.fname);
        TextView textView2 = findViewById(R.id.lname);
        TextView textView3 = findViewById(R.id.eage);
        TextView textView4 = findViewById(R.id.eaddress);
        TextView textView5 = findViewById(R.id.cname);

        textView1.setText(string1);
        textView2.setText(string2);
        textView3.setText(string3);
        textView4.setText(string4);
        textView5.setText(string5);
    }

    public void goPrev(View view)
    {
        Intent backIntent  = new Intent(this, MainActivity.class);
        startActivity(backIntent);
    }
}
