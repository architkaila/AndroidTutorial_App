package com.example.archit.androidtutorial;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    String []items = { "History","Life Cycle", "Orientation","Log Class","Event Handling",
                        "Button","Toast","Context","Dimensions","View & View Group","Layout Inflator",
                        "Margin","Padding","Text View","Edit Text","AutoComplete TextView",
                        "Check Box","Radio Button",
                        "Layouts","Linear Layout","Relative Layout","Table Layout","Grid Layout","Frame Layout",
                        "Dialog Box","Alert Dialog","DatePicker Dialog","TimePicker Dialog",
                        "Adaptor View","List View","Intent"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


/*
        ArrayAdapter<String> adptr = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,items);
        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(adptr);
*/
        MyAdapter adptr = new MyAdapter(this,items);
        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(adptr);


//        final TextView tv1 = (TextView) findViewById(R.id.tv1);
//        final TextView tv2 = (TextView) findViewById(R.id.tv2);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                tv1.setText(items[position]);
//                tv2.setText(info[position]);

                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                i.putExtra("position",position);
                startActivity(i);


            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.my_menu,menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.logout){
            SharedPreferences sp = getSharedPreferences("My_Sp",MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.clear();
            e.commit();
            startActivity(new Intent(FirstActivity.this,LoginActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}

class MyAdapter extends ArrayAdapter<String> {

    Context conf_ref;
    String []items;

    public MyAdapter(@NonNull Context context, String[] items) {
        super(context, R.layout.custom_layout, R.id.num,items);
        conf_ref = context;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater l = (LayoutInflater) conf_ref.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = l.inflate(R.layout.custom_layout,parent,false);

        TextView num = (TextView) v.findViewById(R.id.num);
        TextView text = (TextView) v.findViewById(R.id.text);
        String number =  String.valueOf(position);

        num.setText(number);
        text.setText(items[position]);
        
        return v;
    }
}