package com.example.demo

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

/**
 * LinearLayout 示例程序
 *
 * 展示如何在 Android 中使用 LinearLayout 进行线性布局
 * LinearLayout 是最常用的布局之一，它按照水平或垂直方向依次排列子视图
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 创建根布局 - 使用 ConstraintLayout
        val rootLayout = ConstraintLayout(this).apply {
            layoutParams = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
            )
        }

        // 创建垂直方向的 LinearLayout 作为容器
        val linearLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL  // 设置为垂直方向
            layoutParams = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                topToTop = ConstraintLayout.LayoutParams.PARENT_ID
                bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
                leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID
                rightToRight = ConstraintLayout.LayoutParams.PARENT_ID
                topMargin = 16
                bottomMargin = 16
                leftMargin = 16
                rightMargin = 16
            }
            // 设置内边距
            setPadding(16, 16, 16, 16)
        }

        // 创建标题 TextView
        val titleText = TextView(this).apply {
            text = "LinearLayout 示例"
            textSize = 24f
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 24
            }
        }

        // 创建第一个按钮
        val button1 = Button(this).apply {
            text = "按钮 1"
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 12
            }
        }

        // 创建第二个按钮
        val button2 = Button(this).apply {
            text = "按钮 2"
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 12
            }
        }

        // 创建第三个按钮
        val button3 = Button(this).apply {
            text = "按钮 3"
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 12
            }
        }

        // 创建说明文字
        val descriptionText = TextView(this).apply {
            text = "LinearLayout 会按照垂直或水平方向依次排列子视图。这是 Android 中最基本的布局方式。"
            textSize = 14f
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        }

        // 将所有子视图添加到 LinearLayout
        linearLayout.addView(titleText)
        linearLayout.addView(button1)
        linearLayout.addView(button2)
        linearLayout.addView(button3)
        linearLayout.addView(descriptionText)

        // 将 LinearLayout 添加到根布局
        rootLayout.addView(linearLayout)

        // 设置内容视图
        setContentView(rootLayout)
    }
}
