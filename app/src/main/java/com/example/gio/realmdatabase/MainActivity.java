package com.example.gio.realmdatabase;

import android.app.PendingIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    Realm realm;
    public static int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm realm = Realm.getDefaultInstance();
        RealmResults<Person> result = realm.where(Person.class).findAll();

        if (result.size() == 0) {
            Toast.makeText(this, "naa", Toast.LENGTH_SHORT).show();
        }
    }
}
