/*
 * Copyright (C) 2018, Umbrella CompanyLimited All rights reserved.
 * Project：BRV
 * Author：Drake
 * Date：5/5/20 9:12 PM
 */

package com.drake.brv.animation

import android.animation.ObjectAnimator
import android.view.View


class SlideRightItemAnimation : ItemAnimation {

    override fun onItemEnterAnimation(view: View) {
        ObjectAnimator.ofFloat(view, "translationX", view.rootView.width.toFloat(), 0F)
                .setDuration(300)
                .start()
    }
}
