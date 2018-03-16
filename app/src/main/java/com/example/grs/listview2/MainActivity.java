package com.example.grs.listview2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.grs.listview2.adapter.CustomAdapter;
import com.example.grs.listview2.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv_contact);
        ArrayList<Contact> arrayList= new ArrayList<>();

        Contact contact1 = new Contact(R.drawable.vegetables,"Vegetables");
        Contact contact2 = new Contact(R.drawable.fruits,"Fruits");
        Contact contact3 = new Contact(R.drawable.flowerbuds,"Flower Buds");
        Contact contact4 = new Contact(R.drawable.legumes,"Legumes");
        Contact contact5 = new Contact(R.drawable.bulbs,"Bulbs");
        Contact contact6 = new Contact(R.drawable.tubers,"Tubers");
        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_contact,arrayList);
        lvContact.setAdapter(customAdapter);
    }
}
