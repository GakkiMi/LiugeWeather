package com.liuge.liugeweather.behavior;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;

/**
 * 文 件 名：Demo1Behavior
 * 描   述：TODO
 */
public class Demo1Behavior extends CoordinatorLayout.Behavior<View> {


    private boolean isTopAreaExpand = true;
    private ObjectAnimator animator = new ObjectAnimator();
    private boolean canAnimator = false;


    public Demo1Behavior() {
        super();
    }

    public Demo1Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }


    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        return dependency instanceof AppBarLayout;
    }


    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        /*
         *这里获取dependency的top值,也就是AppBarLayout的top,因为AppBarLayout
         *在是向上滚出界面的,我们的因为是和AppBarLayout相反,所以取绝对值.
         */


        float translationY = Math.abs(dependency.getTop());
        if (translationY == 0) {
            isTopAreaExpand = true;
            canAnimator = true;
        } else if (translationY == child.getHeight()) {
            isTopAreaExpand = false;
            canAnimator = true;
        }
        float offsetY;
        if (isTopAreaExpand) {
            offsetY = translationY;
        } else {
            offsetY = child.getHeight() - translationY;
        }

        String status = isTopAreaExpand ? "去收缩" : "去展开";

        Log.i("Demo1Behavior", "----偏移量：" + offsetY + "---" + status + "---------tranY：" + translationY + "--00:" + dependency.getTop());

        float childHeight = child.getHeight();

        if (offsetY > 30) {
            if (canAnimator) {
                if (isTopAreaExpand) {
                    if (child.getTranslationY() == 0) {
                        animator.setTarget(child);
                        animator.setFloatValues(0f, childHeight);
                        animator.setPropertyName("translationY");
                        animator.setDuration(500);
                        animator.start();
                        canAnimator = false;
                    }
                } else {
                    if (child.getTranslationY() == childHeight) {
                        animator.setTarget(child);
                        animator.setPropertyName("translationY");
                        animator.setFloatValues(childHeight, 0f);
                        animator.setDuration(500);
                        animator.start();
                        canAnimator = false;
                    }
                }
            }
        } else if (offsetY == 0) {
            if (canAnimator) {
                if (isTopAreaExpand) {
                    if (child.getTranslationY() == childHeight) {
                        animator.setTarget(child);
                        animator.setPropertyName("translationY");
                        animator.setFloatValues(childHeight, 0f);
                        animator.setDuration(500);
                        animator.start();
                    }
                }
            }
        }
//        child.setTranslationY(translationY);
        return true;
    }
}
