// Generated by view binder compiler. Do not edit!
package com.cometchat.kotlinsampleapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cometchat.chatuikit.shared.views.CometChatReceipt.CometChatReceipt;
import com.cometchat.kotlinsampleapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMessageReceiptBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView deliverText;

  @NonNull
  public final TextView errorText;

  @NonNull
  public final TextView messageReceiptText;

  @NonNull
  public final TextView messageReceiptTextDesc;

  @NonNull
  public final LinearLayout parentView;

  @NonNull
  public final TextView progressText;

  @NonNull
  public final TextView readText;

  @NonNull
  public final CometChatReceipt receiptDeliver;

  @NonNull
  public final CometChatReceipt receiptError;

  @NonNull
  public final CometChatReceipt receiptProgress;

  @NonNull
  public final CometChatReceipt receiptRead;

  @NonNull
  public final CometChatReceipt receiptSent;

  @NonNull
  public final TextView sentText;

  private FragmentMessageReceiptBinding(@NonNull LinearLayout rootView,
      @NonNull TextView deliverText, @NonNull TextView errorText,
      @NonNull TextView messageReceiptText, @NonNull TextView messageReceiptTextDesc,
      @NonNull LinearLayout parentView, @NonNull TextView progressText, @NonNull TextView readText,
      @NonNull CometChatReceipt receiptDeliver, @NonNull CometChatReceipt receiptError,
      @NonNull CometChatReceipt receiptProgress, @NonNull CometChatReceipt receiptRead,
      @NonNull CometChatReceipt receiptSent, @NonNull TextView sentText) {
    this.rootView = rootView;
    this.deliverText = deliverText;
    this.errorText = errorText;
    this.messageReceiptText = messageReceiptText;
    this.messageReceiptTextDesc = messageReceiptTextDesc;
    this.parentView = parentView;
    this.progressText = progressText;
    this.readText = readText;
    this.receiptDeliver = receiptDeliver;
    this.receiptError = receiptError;
    this.receiptProgress = receiptProgress;
    this.receiptRead = receiptRead;
    this.receiptSent = receiptSent;
    this.sentText = sentText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMessageReceiptBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMessageReceiptBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_message_receipt, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMessageReceiptBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deliver_text;
      TextView deliverText = ViewBindings.findChildViewById(rootView, id);
      if (deliverText == null) {
        break missingId;
      }

      id = R.id.error_text;
      TextView errorText = ViewBindings.findChildViewById(rootView, id);
      if (errorText == null) {
        break missingId;
      }

      id = R.id.message_receipt_text;
      TextView messageReceiptText = ViewBindings.findChildViewById(rootView, id);
      if (messageReceiptText == null) {
        break missingId;
      }

      id = R.id.message_receipt_text_desc;
      TextView messageReceiptTextDesc = ViewBindings.findChildViewById(rootView, id);
      if (messageReceiptTextDesc == null) {
        break missingId;
      }

      LinearLayout parentView = (LinearLayout) rootView;

      id = R.id.progress_text;
      TextView progressText = ViewBindings.findChildViewById(rootView, id);
      if (progressText == null) {
        break missingId;
      }

      id = R.id.read_text;
      TextView readText = ViewBindings.findChildViewById(rootView, id);
      if (readText == null) {
        break missingId;
      }

      id = R.id.receiptDeliver;
      CometChatReceipt receiptDeliver = ViewBindings.findChildViewById(rootView, id);
      if (receiptDeliver == null) {
        break missingId;
      }

      id = R.id.receiptError;
      CometChatReceipt receiptError = ViewBindings.findChildViewById(rootView, id);
      if (receiptError == null) {
        break missingId;
      }

      id = R.id.receiptProgress;
      CometChatReceipt receiptProgress = ViewBindings.findChildViewById(rootView, id);
      if (receiptProgress == null) {
        break missingId;
      }

      id = R.id.receiptRead;
      CometChatReceipt receiptRead = ViewBindings.findChildViewById(rootView, id);
      if (receiptRead == null) {
        break missingId;
      }

      id = R.id.receiptSent;
      CometChatReceipt receiptSent = ViewBindings.findChildViewById(rootView, id);
      if (receiptSent == null) {
        break missingId;
      }

      id = R.id.sent_text;
      TextView sentText = ViewBindings.findChildViewById(rootView, id);
      if (sentText == null) {
        break missingId;
      }

      return new FragmentMessageReceiptBinding((LinearLayout) rootView, deliverText, errorText,
          messageReceiptText, messageReceiptTextDesc, parentView, progressText, readText,
          receiptDeliver, receiptError, receiptProgress, receiptRead, receiptSent, sentText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
