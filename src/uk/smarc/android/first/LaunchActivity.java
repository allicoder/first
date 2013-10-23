package uk.smarc.android.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LaunchActivity extends Activity {

  private static final String TAG = "LaunchActivity";

  public static final String EXTRA_MESSAGE = "uk.smarc.android.first.MESSAGE";

  private EditText mMessageField;
  private String mMessageContent;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    mMessageField = (EditText) findViewById(R.id.main_messageField);

    Log.d(TAG, "onCreate");
  }

  public void onMessageSend(View v) {
    Log.d(TAG, "Finding message...");
    mMessageContent = mMessageField.getText().toString();
    Log.d(TAG, "Message reads: " + mMessageContent);
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    intent.putExtra(EXTRA_MESSAGE, mMessageContent);
    startActivity(intent);
    toast("Message sent!");
  }

  private void toast(String s) {
    Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
  }


}
