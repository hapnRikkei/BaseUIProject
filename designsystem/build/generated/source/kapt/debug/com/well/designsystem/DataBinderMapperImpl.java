package com.well.designsystem;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.well.designsystem.databinding.BottomSheetItemGridAdapterBindingImpl;
import com.well.designsystem.databinding.BottomSheetItemLinearAdapterBindingImpl;
import com.well.designsystem.databinding.BottomSheetStyleOptionBindingImpl;
import com.well.designsystem.databinding.BottomSheetViewHeaderBindingImpl;
import com.well.designsystem.databinding.DialogConfirmationBindingImpl;
import com.well.designsystem.databinding.DialogWarningStyle1BindingImpl;
import com.well.designsystem.databinding.ItemMonthPickerBindingImpl;
import com.well.designsystem.databinding.ItemMonthYearPickerBindingImpl;
import com.well.designsystem.databinding.LabelBindingImpl;
import com.well.designsystem.databinding.ListItem2linecontentEndTextIconBindingImpl;
import com.well.designsystem.databinding.ListItem2linecontentStyle1BindingImpl;
import com.well.designsystem.databinding.ListItem2linecontentStyle2BindingImpl;
import com.well.designsystem.databinding.ListItemBottomsheetDropdownDialogBindingImpl;
import com.well.designsystem.databinding.ListItemButtonctaBindingImpl;
import com.well.designsystem.databinding.ListItemIconValueBindingImpl;
import com.well.designsystem.databinding.ListItemIconValueStyle3BindingImpl;
import com.well.designsystem.databinding.ListItemProgress2linecontentStyleBindingImpl;
import com.well.designsystem.databinding.ListItemToggleBindingImpl;
import com.well.designsystem.databinding.ViewBannerModeBindingImpl;
import com.well.designsystem.databinding.ViewBannerNotJointBindingImpl;
import com.well.designsystem.databinding.ViewChooseIntervalBindingImpl;
import com.well.designsystem.databinding.ViewMiniTabFilterBindingImpl;
import com.well.designsystem.databinding.ViewWellTabItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_BOTTOMSHEETITEMGRIDADAPTER = 1;

  private static final int LAYOUT_BOTTOMSHEETITEMLINEARADAPTER = 2;

  private static final int LAYOUT_BOTTOMSHEETSTYLEOPTION = 3;

  private static final int LAYOUT_BOTTOMSHEETVIEWHEADER = 4;

  private static final int LAYOUT_DIALOGCONFIRMATION = 5;

  private static final int LAYOUT_DIALOGWARNINGSTYLE1 = 6;

  private static final int LAYOUT_ITEMMONTHPICKER = 7;

  private static final int LAYOUT_ITEMMONTHYEARPICKER = 8;

  private static final int LAYOUT_LABEL = 9;

  private static final int LAYOUT_LISTITEM2LINECONTENTENDTEXTICON = 10;

  private static final int LAYOUT_LISTITEM2LINECONTENTSTYLE1 = 11;

  private static final int LAYOUT_LISTITEM2LINECONTENTSTYLE2 = 12;

  private static final int LAYOUT_LISTITEMBOTTOMSHEETDROPDOWNDIALOG = 13;

  private static final int LAYOUT_LISTITEMBUTTONCTA = 14;

  private static final int LAYOUT_LISTITEMICONVALUE = 15;

  private static final int LAYOUT_LISTITEMICONVALUESTYLE3 = 16;

  private static final int LAYOUT_LISTITEMPROGRESS2LINECONTENTSTYLE = 17;

  private static final int LAYOUT_LISTITEMTOGGLE = 18;

  private static final int LAYOUT_VIEWBANNERMODE = 19;

  private static final int LAYOUT_VIEWBANNERNOTJOINT = 20;

  private static final int LAYOUT_VIEWCHOOSEINTERVAL = 21;

  private static final int LAYOUT_VIEWMINITABFILTER = 22;

  private static final int LAYOUT_VIEWWELLTABITEM = 23;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(23);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.bottom_sheet_item_grid_adapter, LAYOUT_BOTTOMSHEETITEMGRIDADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.bottom_sheet_item_linear_adapter, LAYOUT_BOTTOMSHEETITEMLINEARADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.bottom_sheet_style_option, LAYOUT_BOTTOMSHEETSTYLEOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.bottom_sheet_view_header, LAYOUT_BOTTOMSHEETVIEWHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.dialog_confirmation, LAYOUT_DIALOGCONFIRMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.dialog_warning_style1, LAYOUT_DIALOGWARNINGSTYLE1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.item_month_picker, LAYOUT_ITEMMONTHPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.item_month_year_picker, LAYOUT_ITEMMONTHYEARPICKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.label, LAYOUT_LABEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_2linecontent_end_text_icon, LAYOUT_LISTITEM2LINECONTENTENDTEXTICON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_2linecontent_style1, LAYOUT_LISTITEM2LINECONTENTSTYLE1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_2linecontent_style2, LAYOUT_LISTITEM2LINECONTENTSTYLE2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_bottomsheet_dropdown_dialog, LAYOUT_LISTITEMBOTTOMSHEETDROPDOWNDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_buttoncta, LAYOUT_LISTITEMBUTTONCTA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_icon_value, LAYOUT_LISTITEMICONVALUE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_icon_value_style3, LAYOUT_LISTITEMICONVALUESTYLE3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_progress_2linecontent_style, LAYOUT_LISTITEMPROGRESS2LINECONTENTSTYLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.list_item_toggle, LAYOUT_LISTITEMTOGGLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.view_banner_mode, LAYOUT_VIEWBANNERMODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.view_banner_not_joint, LAYOUT_VIEWBANNERNOTJOINT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.view_choose_interval, LAYOUT_VIEWCHOOSEINTERVAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.view_mini_tab_filter, LAYOUT_VIEWMINITABFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.well.designsystem.R.layout.view_well_tab_item, LAYOUT_VIEWWELLTABITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_BOTTOMSHEETITEMGRIDADAPTER: {
          if ("layout/bottom_sheet_item_grid_adapter_0".equals(tag)) {
            return new BottomSheetItemGridAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_sheet_item_grid_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_BOTTOMSHEETITEMLINEARADAPTER: {
          if ("layout/bottom_sheet_item_linear_adapter_0".equals(tag)) {
            return new BottomSheetItemLinearAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_sheet_item_linear_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_BOTTOMSHEETSTYLEOPTION: {
          if ("layout/bottom_sheet_style_option_0".equals(tag)) {
            return new BottomSheetStyleOptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_sheet_style_option is invalid. Received: " + tag);
        }
        case  LAYOUT_BOTTOMSHEETVIEWHEADER: {
          if ("layout/bottom_sheet_view_header_0".equals(tag)) {
            return new BottomSheetViewHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_sheet_view_header is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCONFIRMATION: {
          if ("layout/dialog_confirmation_0".equals(tag)) {
            return new DialogConfirmationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_confirmation is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGWARNINGSTYLE1: {
          if ("layout/dialog_warning_style1_0".equals(tag)) {
            return new DialogWarningStyle1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_warning_style1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMONTHPICKER: {
          if ("layout/item_month_picker_0".equals(tag)) {
            return new ItemMonthPickerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_month_picker is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMONTHYEARPICKER: {
          if ("layout/item_month_year_picker_0".equals(tag)) {
            return new ItemMonthYearPickerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_month_year_picker is invalid. Received: " + tag);
        }
        case  LAYOUT_LABEL: {
          if ("layout/label_0".equals(tag)) {
            return new LabelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for label is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEM2LINECONTENTENDTEXTICON: {
          if ("layout/list_item_2linecontent_end_text_icon_0".equals(tag)) {
            return new ListItem2linecontentEndTextIconBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_2linecontent_end_text_icon is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEM2LINECONTENTSTYLE1: {
          if ("layout/list_item_2linecontent_style1_0".equals(tag)) {
            return new ListItem2linecontentStyle1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_2linecontent_style1 is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEM2LINECONTENTSTYLE2: {
          if ("layout/list_item_2linecontent_style2_0".equals(tag)) {
            return new ListItem2linecontentStyle2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_2linecontent_style2 is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMBOTTOMSHEETDROPDOWNDIALOG: {
          if ("layout/list_item_bottomsheet_dropdown_dialog_0".equals(tag)) {
            return new ListItemBottomsheetDropdownDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_bottomsheet_dropdown_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMBUTTONCTA: {
          if ("layout/list_item_buttoncta_0".equals(tag)) {
            return new ListItemButtonctaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_buttoncta is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMICONVALUE: {
          if ("layout/list_item_icon_value_0".equals(tag)) {
            return new ListItemIconValueBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_icon_value is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMICONVALUESTYLE3: {
          if ("layout/list_item_icon_value_style3_0".equals(tag)) {
            return new ListItemIconValueStyle3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_icon_value_style3 is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPROGRESS2LINECONTENTSTYLE: {
          if ("layout/list_item_progress_2linecontent_style_0".equals(tag)) {
            return new ListItemProgress2linecontentStyleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_progress_2linecontent_style is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMTOGGLE: {
          if ("layout/list_item_toggle_0".equals(tag)) {
            return new ListItemToggleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_toggle is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWBANNERMODE: {
          if ("layout/view_banner_mode_0".equals(tag)) {
            return new ViewBannerModeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_banner_mode is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWBANNERNOTJOINT: {
          if ("layout/view_banner_not_joint_0".equals(tag)) {
            return new ViewBannerNotJointBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_banner_not_joint is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWCHOOSEINTERVAL: {
          if ("layout/view_choose_interval_0".equals(tag)) {
            return new ViewChooseIntervalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_choose_interval is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWMINITABFILTER: {
          if ("layout/view_mini_tab_filter_0".equals(tag)) {
            return new ViewMiniTabFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_mini_tab_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWWELLTABITEM: {
          if ("layout/view_well_tab_item_0".equals(tag)) {
            return new ViewWellTabItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_well_tab_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(23);

    static {
      sKeys.put("layout/bottom_sheet_item_grid_adapter_0", com.well.designsystem.R.layout.bottom_sheet_item_grid_adapter);
      sKeys.put("layout/bottom_sheet_item_linear_adapter_0", com.well.designsystem.R.layout.bottom_sheet_item_linear_adapter);
      sKeys.put("layout/bottom_sheet_style_option_0", com.well.designsystem.R.layout.bottom_sheet_style_option);
      sKeys.put("layout/bottom_sheet_view_header_0", com.well.designsystem.R.layout.bottom_sheet_view_header);
      sKeys.put("layout/dialog_confirmation_0", com.well.designsystem.R.layout.dialog_confirmation);
      sKeys.put("layout/dialog_warning_style1_0", com.well.designsystem.R.layout.dialog_warning_style1);
      sKeys.put("layout/item_month_picker_0", com.well.designsystem.R.layout.item_month_picker);
      sKeys.put("layout/item_month_year_picker_0", com.well.designsystem.R.layout.item_month_year_picker);
      sKeys.put("layout/label_0", com.well.designsystem.R.layout.label);
      sKeys.put("layout/list_item_2linecontent_end_text_icon_0", com.well.designsystem.R.layout.list_item_2linecontent_end_text_icon);
      sKeys.put("layout/list_item_2linecontent_style1_0", com.well.designsystem.R.layout.list_item_2linecontent_style1);
      sKeys.put("layout/list_item_2linecontent_style2_0", com.well.designsystem.R.layout.list_item_2linecontent_style2);
      sKeys.put("layout/list_item_bottomsheet_dropdown_dialog_0", com.well.designsystem.R.layout.list_item_bottomsheet_dropdown_dialog);
      sKeys.put("layout/list_item_buttoncta_0", com.well.designsystem.R.layout.list_item_buttoncta);
      sKeys.put("layout/list_item_icon_value_0", com.well.designsystem.R.layout.list_item_icon_value);
      sKeys.put("layout/list_item_icon_value_style3_0", com.well.designsystem.R.layout.list_item_icon_value_style3);
      sKeys.put("layout/list_item_progress_2linecontent_style_0", com.well.designsystem.R.layout.list_item_progress_2linecontent_style);
      sKeys.put("layout/list_item_toggle_0", com.well.designsystem.R.layout.list_item_toggle);
      sKeys.put("layout/view_banner_mode_0", com.well.designsystem.R.layout.view_banner_mode);
      sKeys.put("layout/view_banner_not_joint_0", com.well.designsystem.R.layout.view_banner_not_joint);
      sKeys.put("layout/view_choose_interval_0", com.well.designsystem.R.layout.view_choose_interval);
      sKeys.put("layout/view_mini_tab_filter_0", com.well.designsystem.R.layout.view_mini_tab_filter);
      sKeys.put("layout/view_well_tab_item_0", com.well.designsystem.R.layout.view_well_tab_item);
    }
  }
}
