// Generated by data binding compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.well.designsystem.R;
import com.well.designsystem.view.CustomTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMonthYearPickerBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextView tvContent;

  @NonNull
  public final RelativeLayout viewRoot;

  protected ItemMonthYearPickerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextView tvContent, RelativeLayout viewRoot) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvContent = tvContent;
    this.viewRoot = viewRoot;
  }

  @NonNull
  public static ItemMonthYearPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_month_year_picker, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMonthYearPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMonthYearPickerBinding>inflateInternal(inflater, R.layout.item_month_year_picker, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMonthYearPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_month_year_picker, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMonthYearPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMonthYearPickerBinding>inflateInternal(inflater, R.layout.item_month_year_picker, null, false, component);
  }

  public static ItemMonthYearPickerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemMonthYearPickerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMonthYearPickerBinding)bind(component, view, R.layout.item_month_year_picker);
  }
}
