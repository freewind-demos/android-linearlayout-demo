# android-linearlayout-demo

## 简介

本 demo 展示了如何在 Android 应用中使用 LinearLayout 进行线性布局。LinearLayout 是 Android 中最基本也是最常用的布局方式，它按照水平或垂直方向依次排列子视图。

## 基本原理

LinearLayout 是一种简单的布局方式，它将子视图按照单一方向（水平或垂直）排列：

- **orientation 属性**：设置排列方向
  - `vertical`：垂直排列
  - **horizontal**：水平排列（默认）

- **weight（权重）**：通过 `layout_weight` 属性分配剩余空间
- **gravity（重力）**：控制子视图在容器中的对齐方式

## 启动和使用

### 环境要求
- Android Studio Arctic Fox 或更高版本
- JDK 11 或更高版本
- Android SDK 34

### 安装和运行
1. 使用 Android Studio 打开本项目
2. 连接 Android 设备或启动模拟器
3. 点击 Run 按钮运行应用

## 教程

### 什么是 LinearLayout？

LinearLayout 是 Android 最基本的布局组件，它将子视图排列成一行或一列。它的优点是简单易用，缺点是难以实现复杂的布局。

### 核心属性

1. **orientation**：排列方向
   - `android:orientation="vertical"`：垂直排列
   - `android:orientation="horizontal"`：水平排列

2. **gravity**：子视图对齐方式
   - `top`、`bottom`、`center_vertical`
   - `left`、`right`、`center_horizontal`
   - 可以组合使用：`center`

3. **layout_weight**：权重
   - 用于分配剩余空间
   - 值越大，分配的比例越高

### 使用示例

1. 垂直线性布局：
```xml
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <TextView
        android:text="第一项"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <TextView
        android:text="第二项"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

</LinearLayout>
```

2. 使用权重分配空间：
```xml
<LinearLayout
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <Button
        android:text="左边"
        android:layout_width="0dp"
        android:layout_weight="1"
        android:layout_height="wrap_content" />

    <Button
        android:text="右边"
        android:layout_width="0dp"
        android:layout_weight="1"
        android:layout_height="wrap_content" />

</LinearLayout>
```

### 注意事项

1. **性能**：LinearLayout 嵌套过多会影响性能，建议使用 ConstraintLayout
2. **权重**：使用权重时，将宽度/高度设为 0dp 以获得最佳效果
3. **基准线**：对于水平布局，可以使用 `baselineAligned` 使文本基线对齐
