package com.dnar.consumerapp.ui.base

import com.dnar.consumerapp.di.app.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

// Base Application for implements DaggerApplication; Keyword : Base
class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? =
        DaggerAppComponent.builder().application(this).build()

}