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
import com.cometchat.chatuikit.shared.views.CometChatTextBubble.CometChatTextBubble;
import com.cometchat.kotlinsampleapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTextBubbleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CometChatTextBubble receiverBubble;

  @NonNull
  public final CometChatTextBubble senderBubble;

  private FragmentTextBubbleBinding(@NonNull LinearLayout rootView,
      @NonNull CometChatTextBubble receiverBubble, @NonNull CometChatTextBubble senderBubble) {
    this.rootView = rootView;
    this.receiverBubble = receiverBubble;
    this.senderBubble = senderBubble;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTextBubbleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTextBubbleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_text_bubble, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTextBubbleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.receiver_bubble;
      CometChatTextBubble receiverBubble = ViewBindings.findChildViewById(rootView, id);
      if (receiverBubble == null) {
        break missingId;
      }

      id = R.id.sender_bubble;
      CometChatTextBubble senderBubble = ViewBindings.findChildViewById(rootView, id);
      if (senderBubble == null) {
        break missingId;
      }

      return new FragmentTextBubbleBinding((LinearLayout) rootView, receiverBubble, senderBubble);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
