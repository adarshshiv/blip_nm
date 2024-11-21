// Generated by view binder compiler. Do not edit!
package com.cometchat.kotlinsampleapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cometchat.chatuikit.shared.views.CometChatStatusIndicator.CometChatStatusIndicator;
import com.cometchat.kotlinsampleapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStatusIndicatorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RadioButton offline;

  @NonNull
  public final RadioButton online;

  @NonNull
  public final LinearLayout parentView;

  @NonNull
  public final TextView statusDesc;

  @NonNull
  public final CometChatStatusIndicator statusIndicator;

  @NonNull
  public final TextView statusIndicatorText;

  @NonNull
  public final TextView statusTitle;

  @NonNull
  public final RadioGroup toggle;

  private FragmentStatusIndicatorBinding(@NonNull LinearLayout rootView,
      @NonNull RadioButton offline, @NonNull RadioButton online, @NonNull LinearLayout parentView,
      @NonNull TextView statusDesc, @NonNull CometChatStatusIndicator statusIndicator,
      @NonNull TextView statusIndicatorText, @NonNull TextView statusTitle,
      @NonNull RadioGroup toggle) {
    this.rootView = rootView;
    this.offline = offline;
    this.online = online;
    this.parentView = parentView;
    this.statusDesc = statusDesc;
    this.statusIndicator = statusIndicator;
    this.statusIndicatorText = statusIndicatorText;
    this.statusTitle = statusTitle;
    this.toggle = toggle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStatusIndicatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStatusIndicatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_status_indicator, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStatusIndicatorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.offline;
      RadioButton offline = ViewBindings.findChildViewById(rootView, id);
      if (offline == null) {
        break missingId;
      }

      id = R.id.online;
      RadioButton online = ViewBindings.findChildViewById(rootView, id);
      if (online == null) {
        break missingId;
      }

      LinearLayout parentView = (LinearLayout) rootView;

      id = R.id.status_desc;
      TextView statusDesc = ViewBindings.findChildViewById(rootView, id);
      if (statusDesc == null) {
        break missingId;
      }

      id = R.id.statusIndicator;
      CometChatStatusIndicator statusIndicator = ViewBindings.findChildViewById(rootView, id);
      if (statusIndicator == null) {
        break missingId;
      }

      id = R.id.status_indicator_text;
      TextView statusIndicatorText = ViewBindings.findChildViewById(rootView, id);
      if (statusIndicatorText == null) {
        break missingId;
      }

      id = R.id.status_title;
      TextView statusTitle = ViewBindings.findChildViewById(rootView, id);
      if (statusTitle == null) {
        break missingId;
      }

      id = R.id.toggle;
      RadioGroup toggle = ViewBindings.findChildViewById(rootView, id);
      if (toggle == null) {
        break missingId;
      }

      return new FragmentStatusIndicatorBinding((LinearLayout) rootView, offline, online,
          parentView, statusDesc, statusIndicator, statusIndicatorText, statusTitle, toggle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}