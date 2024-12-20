// Generated by view binder compiler. Do not edit!
package com.cometchat.kotlinsampleapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cometchat.chatuikit.shared.views.CometChatVideoBubble.CometChatVideoBubble;
import com.cometchat.kotlinsampleapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVideoBubbleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CometChatVideoBubble videoBubble;

  private FragmentVideoBubbleBinding(@NonNull LinearLayout rootView,
      @NonNull CometChatVideoBubble videoBubble) {
    this.rootView = rootView;
    this.videoBubble = videoBubble;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVideoBubbleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVideoBubbleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_video_bubble, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVideoBubbleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.video_bubble;
      CometChatVideoBubble videoBubble = ViewBindings.findChildViewById(rootView, id);
      if (videoBubble == null) {
        break missingId;
      }

      return new FragmentVideoBubbleBinding((LinearLayout) rootView, videoBubble);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
