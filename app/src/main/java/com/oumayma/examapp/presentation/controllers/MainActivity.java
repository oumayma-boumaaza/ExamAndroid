package com.oumayma.examapp.presentation.controllers;
        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Spinner;

        import com.oumayma.examapp.R;
        import com.oumayma.examapp.utils.MyContext;

        import static com.oumayma.examapp.R.*;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Button button;
    private EditText ste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        spinner = (Spinner) findViewById(id.spinner);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item,
                        ((MyContext)getApplicationContext()).getServices().getVillesNames());
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        button = (Button) findViewById(id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
    }
    public void sendData(){
        ((MyContext)getApplicationContext()).getServices().CalculatePrice());
        Intent intent = new Intent (MainActivity.this,SecondPageActivity.class);
        intent.putExtra("total",12);

        startActivity(intent); }


}