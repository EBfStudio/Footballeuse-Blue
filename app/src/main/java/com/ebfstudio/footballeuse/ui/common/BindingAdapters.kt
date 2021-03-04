package com.ebfstudio.footballeuse.ui.common

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

/**
 * Created by Vince on 21/09/2020
 */
object BindingAdapters {

    @JvmStatic
    @BindingAdapter("visibleGone")
    fun showHide(view: View, show: Boolean) {
        view.visibility = if (show) View.VISIBLE else View.GONE
    }

    @JvmStatic
    @BindingAdapter("visibleInvisible")
    fun showHide2(view: View, show: Boolean) {
        view.visibility = if (show) View.VISIBLE else View.INVISIBLE
    }

    @JvmStatic
    @BindingAdapter("imageUrl")
    fun bindImage(imageView: ImageView, url: String?) {

        Glide.with(imageView.context)
            .load(url)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(imageView)

    }

}