package com.example.paresh.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[]Images={R.drawable.capten_america,R.drawable.hulk_img,R.drawable.spider_man,R.drawable.iron_man,R.drawable.thor_img};
    String[]Names={"Captain America","the Hulk","Spider Man","Iron Man","Thor"};
    String[]Description={"Chris Evans.Actor"," Mark Raffaello.Actor","Tom Holland.Actor"," Actor.Robert Downy Jr.","Chris Hemsworth.Actor"};

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount ( ) {
            return Images.length;
        }

        @Override
        public Object getItem (int i) {
            return null;
        }

        @Override
        public long getItemId (int i) {
            return 0;
        }

        @Override
        public View getView (int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_description=(TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(Images[i]);
            textView_name.setText(Names[i]);
            textView_description.setText(Description[i]);



            return view;
        }
    }
}
