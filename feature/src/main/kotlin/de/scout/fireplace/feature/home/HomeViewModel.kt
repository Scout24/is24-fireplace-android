package de.scout.fireplace.feature.home

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableBoolean
import javax.inject.Inject

internal class HomeViewModel @Inject constructor(application: Application) : AndroidViewModel(application) {

  val rent = ObservableBoolean(true)
}
