package ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import algonquin.cst2335.ghat0035.R;
import data.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private MainViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        model = new ViewModelProvider(this).get(MainViewModel.class);
        setContentView(R.layout.activity_main);
        TextView mytext = findViewById(R.id.textview);
        EditText myedit = findViewById(R.id.myedittext);
        Button btn = findViewById(R.id.mybutton);
        Switch s1 = findViewById(R.id.mySwitch);
        CheckBox c1=findViewById(R.id.mycheckbox);
        RadioButton r1=findViewById(R.id.myRadiobutton);
        ImageButton imgbtn=findViewById(R.id.myimagebutton);
        ImageView imgviw=findViewById(R.id.myImageView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editString = myedit.getText().toString();
                mytext.setText( "Your edit text has: " + editString);
            }
        });
        s1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            model.isSelected.postValue(isChecked);
        });
        c1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            model.isSelected.postValue(isChecked);
        });
        r1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            model.isSelected.postValue(isChecked);
        });
        model.isSelected.observe(this, selected ->{
            s1.setChecked(selected);
            c1.setChecked(selected);
            r1.setChecked(selected);
            Toast.makeText(getApplicationContext(),"The value is now: isChecked", Toast.LENGTH_SHORT).show();
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int width = imgbtn.getWidth();
                int height = imgbtn.getHeight();
                Toast.makeText(getApplicationContext(),"The width: "+width+" and Height: "+height, Toast.LENGTH_SHORT).show();
            }
        });
    }
}