package com.example.myupdatetestapp

import android.content.Context
import com.github.javiersantos.appupdater.AppUpdater
import com.github.javiersantos.appupdater.enums.Display
import com.github.javiersantos.appupdater.enums.UpdateFrom

class AppUpdater(val context: Context) {

    fun checkForUpdates() {
        val appUpdater = AppUpdater(context)
//            .setUpdateFrom(UpdateFrom.GITHUB)
//            .setGitHubUserAndRepo("chumbam", "MyTestUpdateRepo")
            .setUpdateFrom(UpdateFrom.JSON)
            .setUpdateJSON("https://raw.githubusercontent.com/chumbam/MyTestUpdateRepo/master/app/update.json")
            .setDisplay(Display.DIALOG)
            .setCancelable(false)
            .showAppUpdated(true)
        appUpdater.start()
    }
}