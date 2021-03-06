@file:JvmName("LayoutManagerUtil")

package com.trading212.diverserecycleradapter.layoutmanager

import androidx.recyclerview.widget.RecyclerView

/**
 *Call this method in [RecyclerView.LayoutManager.onAttachedToWindow]
 */
fun delegateRecyclerViewAttachedToWindow(recyclerView: RecyclerView) {

    val childCount = recyclerView.childCount
    (0 until childCount)
            .asSequence()
            .mapNotNull { recyclerView.getChildAt(it) }
            .mapNotNull { recyclerView.getChildViewHolder(it) }
            .forEach { recyclerView.adapter?.onViewAttachedToWindow(it) }
}

/**
 *Call this method in [RecyclerView.LayoutManager.onDetachedFromWindow]
 */
fun delegateRecyclerViewDetachedFromWindow(recyclerView: RecyclerView) {

    val childCount = recyclerView.childCount
    (0 until childCount)
            .asSequence()
            .mapNotNull { recyclerView.getChildAt(it) }
            .mapNotNull { recyclerView.getChildViewHolder(it) }
            .forEach { recyclerView.adapter?.onViewDetachedFromWindow(it) }
}