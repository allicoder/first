package uk.smarc.android.first;

import android.app.Activity;
import android.os.Bundle;


public class DisplayMessageActivity extends Activity {

  private static final String TAG = "DisplayMessageActivity";

  private TextView mMessageView;

  public DisplayMessageActivity() {

  }

  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.display);

    addUpToActionBar();

    mMessageView = (TextView) findViewById(R.id.display_messageView);

    // Get the intent used to start the activity
    Intent startIntent = getIntent();
    String message = startIntent.getStringExtra(LaunchActivity.EXTRA_MESSAGE);

    // Display the message
    mMessageView.setText(message);
  }

  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case android.r.id.home:
        {
          NavUtils.navigateUpFromSameTask(this);
          return true;
        }
      default:
        {
          return super.onOptionsItemSelected(item);
        }
    }
  }

  private void addUpToActionBar() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
      // After Honeycomb => actionbar api is present
      getActionBar().setDisplayHomeAsUpEnabled(true);
    }
  }

}

