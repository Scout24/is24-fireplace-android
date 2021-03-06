package de.scout.fireplace.feature.inject

import android.app.Application
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import de.scout.fireplace.feature.network.SchedulingStrategy
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module
internal class ApplicationModule {

  @Provides
  fun preferences(application: Application) = PreferenceManager.getDefaultSharedPreferences(application)

  @Provides
  fun strategy() = SchedulingStrategy(Schedulers.io(), AndroidSchedulers.mainThread())
}
