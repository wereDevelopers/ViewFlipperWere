package com.weredev.viewflipperwere

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.ViewFlipper

class ViewFlipperWere : ViewFlipper {
    private var initialPage: Int = 0

    constructor(context: Context) : super(context) {
        initialPage = 0
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        // Attribute initialization
        val a: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.ViewFlipperWere, 0, 0)
        initialPage = a.getInt(R.styleable.ViewFlipperWere_displayedChild, 0)
        a.recycle()
    }

    override fun onAttachedToWindow() {
        displayedChild = initialPage
        super.onAttachedToWindow()
    }



}