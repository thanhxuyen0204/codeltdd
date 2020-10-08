package com.thanhxuyen.tuan4customlist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[]= {"Bạc Phận", "Sóng Gió", "Em Gì Ơi","Hoa Hải Đường","Hồng Nhan","Sao Em Vô Tình"};
    String mDescription[]={"324.261.271 view","350.461.314 view","252.481.976 view","100.214.521 view","231.764.531 view","123.421.731 view"};
    int images[]={R.drawable.bacphan,R.drawable.mvsonggio,R.drawable.emgioi,R.drawable.hoahaiduong,R.drawable.hongnhan,R.drawable.saoemvotinh};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.ListView);

        MyAdapter adapter = new MyAdapter( this, mTitle,mDescription,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this, "324.261.271 view", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Toast.makeText(MainActivity.this, "350.461.314 view", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(MainActivity.this, "252.481.976 view", Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                    Toast.makeText(MainActivity.this, "100.214.521 view", Toast.LENGTH_SHORT).show();
                }
                if(position==4){
                    Toast.makeText(MainActivity.this, "231.764.531 view", Toast.LENGTH_SHORT).show();
                }
                if(position==5){
                    Toast.makeText(MainActivity.this, "123.421.731 view", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        MyAdapter (Context c, String title[],String description[],int imgs[] ){
            super(c,R.layout.row, R.id.textview1,title);
            this.context =c;
            this.rTitle=title;
            this.rDescription=description;
            this.rImgs=imgs;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent, false);
            ImageView images= row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textview1);
            TextView myDescription = row.findViewById(R.id.textview2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }

    }

}