package com.example.mvvm.ui.base.epoxy.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.example.mvvm.R

@ModelView(defaultLayout = R.layout.space_epoxy_view)
class SpaceEpoxyView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    @JvmOverloads
    @ModelProp
    fun color(@SuppressLint("ResourceAsColor") @ColorInt color: Int = ContextCompat.getColor(context, R.color.black)) {
        setBackgroundColor(color)
    }

    @ModelProp
    fun height(dimenId: Int?) {
        if (dimenId == null) return
        layoutParams.height = context.resources.getDimensionPixelSize(dimenId)
    }
}
