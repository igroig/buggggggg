package com.example.gio.realmdatabase;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Gio on 3/9/2017.
 */

public class Appss  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // The Realm file will be located in Context.getFilesDir() with name "default.realm"
//        Realm.init(this);
//        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
//                .name(Realm.DEFAULT_REALM_NAME)
//                .schemaVersion(0)
//                .deleteRealmIfMigrationNeeded()
//                .build();
//        Realm.setDefaultConfiguration(realmConfiguration);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this).name("a").build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}
