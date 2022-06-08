package com.example.mvvm.ui.base

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.example.mvvm.databinding.ViewErrorNewFeedBinding

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class ItemErrorNewFeed @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    private var binding: ViewErrorNewFeedBinding

    init {
        val inflater =
            getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        this.binding = ViewErrorNewFeedBinding.inflate(inflater, this)
    }

    @ModelProp
    fun setText(text: String?) {
        text?.run { binding.txtError.text = text }
    }
}