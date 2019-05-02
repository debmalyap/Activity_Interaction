package in.qbent.qbentrecruit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendData(View view)
    {
        EditText editText1 = findViewById(R.id.firstName);
        EditText editText2 = findViewById(R.id.lastName);
        EditText editText3 = findViewById(R.id.empAge);
        EditText editText4 = findViewById(R.id.emailAddress);
        EditText editText5 = findViewById(R.id.companyName);

        String ms1 = editText1.getText().toString();
        String ms2 = editText2.getText().toString();
        String ms3 = editText3.getText().toString();
        String ms4 = editText4.getText().toString();
        String ms5 = editText5.getText().toString();


        Intent intent = new Intent(this,ShowData.class);

        intent.putExtra("efname",ms1);
        intent.putExtra("elname",ms2);
        intent.putExtra("epage",ms3);
        intent.putExtra("mail",ms4);
        intent.putExtra("cpname",ms5);

        startActivity(intent);


    }
}
