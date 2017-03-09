package com.example.gio.realmdatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static int id;
    private EditText etName;
    private EditText etLastName;
    private Button bInsert;

    Realm realm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

         realm = Realm.getDefaultInstance();
        RealmResults<Person> result = realm.where(Person.class).findAll();

        if (result.size() == 0) {
            id = -1;
        }


    }

    private void initView() {
        etName = (EditText) findViewById(R.id.etName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        bInsert = (Button) findViewById(R.id.bInsert);

        bInsert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bInsert:
                realm.beginTransaction();
                insertIntoDb(etName.getText().toString(), etLastName.getText().toString());
                break;
        }
    }


    public void insertIntoDb(String name, String lastName){
//        Person p = new Person();
//        p.setName(name);
//        p.setLastName(lastName);
//
//        realm.beginTransaction();
//
//        Person pr=realm.copyFromRealm(p);
//
//        realm.commitTransaction();



        realm.beginTransaction();

        Person p=realm.createObject(Person.class);
        p.setName(name);
        p.setLastName(lastName);
        realm.commitTransaction();


    }

}
