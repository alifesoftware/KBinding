package com.benny.app.sample.ui.extension

import android.content.Context
import android.view.View
import android.view.ViewManager
import com.benny.app.sample.ui.widget.ViewPagerIndicator
import com.facebook.drawee.view.SimpleDraweeView
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.custom.ankoView

/**
 * Created by benny on 12/21/15.
 */

fun ViewManager.simpleDraweeView(init: SimpleDraweeView.() -> Unit): SimpleDraweeView {
    return ankoView({ctx: Context -> SimpleDraweeView(ctx)}) { init() }
}

fun ViewManager.viewPagerIndicator(init: ViewPagerIndicator.() -> Unit): ViewPagerIndicator {
    return ankoView({ctx: Context -> ViewPagerIndicator(ctx)}) { init() }
}

var View.backgroundColorResource: Int
    get() = throw UnsupportedOperationException()
    set(value) { this.backgroundColor = context.resources.getColor(value) }