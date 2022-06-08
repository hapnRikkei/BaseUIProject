package com.example.mvvm

import android.graphics.Color
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.ui.base.BaseActivity
import com.example.mvvm.ui.base.MainViewModel
import com.example.mvvm.ui.base.epoxy.view.spaceEpoxyView
import com.example.mvvm.ui.base.itemErrorNewFeed
import kotlin.coroutines.CoroutineContext

class MainActivity :
    BaseActivity<ActivityMainBinding, MainViewModel>(ActivityMainBinding::inflate) {

    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun setupView() {
        super.setupView()
        setupEpoxyRV()
    }

    private fun setupEpoxyRV() {
        binding.mainEpoxy.withModels {
            spaceEpoxyView {
                id("space1")
                color(Color.BLUE)
            }
            spaceEpoxyView {
                id("s")
                color(Color.RED)
            }
            spaceEpoxyView {
                id("sp")
                color(Color.CYAN)
            }
            spaceEpoxyView {
                id("spa")
                color(Color.BLACK)
            }
            itemErrorNewFeed {
                id("error")
            }
            spaceEpoxyView {
                id("space2")
            }
            itemErrorNewFeed {
                id("error2")
                text("asdasdasd")
            }
        }
        binding.mainEpoxy.requestModelBuild()
    }

    override val coroutineContext: CoroutineContext
        get() = TODO("Not yet implemented")
}