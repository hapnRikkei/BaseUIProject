// Generated by data binding compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.well.designsystem.R;
import com.well.designsystem.view.CustomTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItem2linecontentEndTextIconBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivEndIcon;

  @NonNull
  public final CustomTextView tvDescription;

  @NonNull
  public final CustomTextView tvTitle;

  @NonNull
  public final CustomTextView tvValue;

  protected ListItem2linecontentEndTextIconBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView ivEndIcon, CustomTextView tvDescription,
      CustomTextView tvTitle, CustomTextView tvValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivEndIcon = ivEndIcon;
    this.tvDescription = tvDescription;
    this.tvTitle = tvTitle;
    this.tvValue = tvValue;
  }

  @NonNull
  public static ListItem2linecontentEndTextIconBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_2linecontent_end_text_icon, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItem2linecontentEndTextIconBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItem2linecontentEndTextIconBinding>inflateInternal(inflater, R.layout.list_item_2linecontent_end_text_icon, root, attachToRoot, component);
  }

  @NonNull
  public static ListItem2linecontentEndTextIconBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_2linecontent_end_text_icon, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItem2linecontentEndTextIconBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItem2linecontentEndTextIconBinding>inflateInternal(inflater, R.layout.list_item_2linecontent_end_text_icon, null, false, component);
  }

  public static ListItem2linecontentEndTextIconBinding bind(@NonNull View view) {
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
  public static ListItem2linecontentEndTextIconBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ListItem2linecontentEndTextIconBinding)bind(component, view, R.layout.list_item_2linecontent_end_text_icon);
  }
}
