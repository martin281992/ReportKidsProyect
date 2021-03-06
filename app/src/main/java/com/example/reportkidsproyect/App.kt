package com.example.reportkidsproyect

import android.R
import android.app.Application
import com.parse.Parse


class App:Application(){
    override fun onCreate() {
        super.onCreate()
        Parse.initialize(
            Builder(this)
                .applicationId(getString(R.string.back4app_app_id)) // if defined
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()
        )
        ParseInstallation.getCurrentInstallation().saveInBackground();


    }

}