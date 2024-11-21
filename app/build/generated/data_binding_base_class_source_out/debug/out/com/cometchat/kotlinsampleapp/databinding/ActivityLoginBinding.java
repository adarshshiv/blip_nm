// Generated by view binder compiler. Do not edit!
package com.cometchat.kotlinsampleapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cometchat.kotlinsampleapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final LinearLayout bottom;

  @NonNull
  public final MaterialTextView createUser;

  @NonNull
  public final TextInputEditText etUID;

  @NonNull
  public final TextInputLayout inputUID;

  @NonNull
  public final ProgressBar loginProgress;

  @NonNull
  public final RelativeLayout parentView;

  @NonNull
  public final MaterialTextView tvDes1;

  @NonNull
  public final MaterialTextView tvDes2;

  @NonNull
  public final AppCompatButton tvSignIn;

  @NonNull
  public final TextView tvTitle;

  private ActivityLoginBinding(@NonNull ScrollView rootView, @NonNull LinearLayout bottom,
      @NonNull MaterialTextView createUser, @NonNull TextInputEditText etUID,
      @NonNull TextInputLayout inputUID, @NonNull ProgressBar loginProgress,
      @NonNull RelativeLayout parentView, @NonNull MaterialTextView tvDes1,
      @NonNull MaterialTextView tvDes2, @NonNull AppCompatButton tvSignIn,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.bottom = bottom;
    this.createUser = createUser;
    this.etUID = etUID;
    this.inputUID = inputUID;
    this.loginProgress = loginProgress;
    this.parentView = parentView;
    this.tvDes1 = tvDes1;
    this.tvDes2 = tvDes2;
    this.tvSignIn = tvSignIn;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom;
      LinearLayout bottom = ViewBindings.findChildViewById(rootView, id);
      if (bottom == null) {
        break missingId;
      }

      id = R.id.create_user;
      MaterialTextView createUser = ViewBindings.findChildViewById(rootView, id);
      if (createUser == null) {
        break missingId;
      }

      id = R.id.etUID;
      TextInputEditText etUID = ViewBindings.findChildViewById(rootView, id);
      if (etUID == null) {
        break missingId;
      }

      id = R.id.inputUID;
      TextInputLayout inputUID = ViewBindings.findChildViewById(rootView, id);
      if (inputUID == null) {
        break missingId;
      }

      id = R.id.loginProgress;
      ProgressBar loginProgress = ViewBindings.findChildViewById(rootView, id);
      if (loginProgress == null) {
        break missingId;
      }

      id = R.id.parent_view;
      RelativeLayout parentView = ViewBindings.findChildViewById(rootView, id);
      if (parentView == null) {
        break missingId;
      }

      id = R.id.tvDes1;
      MaterialTextView tvDes1 = ViewBindings.findChildViewById(rootView, id);
      if (tvDes1 == null) {
        break missingId;
      }

      id = R.id.tvDes2;
      MaterialTextView tvDes2 = ViewBindings.findChildViewById(rootView, id);
      if (tvDes2 == null) {
        break missingId;
      }

      id = R.id.tvSignIn;
      AppCompatButton tvSignIn = ViewBindings.findChildViewById(rootView, id);
      if (tvSignIn == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ScrollView) rootView, bottom, createUser, etUID, inputUID,
          loginProgress, parentView, tvDes1, tvDes2, tvSignIn, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}