package uk.smarc.android.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

  private static final String TAG = "DisplayMessageActivity";

  private String mNewLine;
  private TextView mMessageView;

  public DisplayMessageActivity() {
    mNewLine = System.getProperty("line.separator");
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
    mMessageView.setText("Received a message!" + mNewLine + message);
  }

//  public boolean onOptionsItemSelected(MenuItem item) {
//    switch (item.getItemId()) {
//      case android.r.id.home:
//        {
//          NavUtils.navigateUpFromSameTask(this);
//          return true;
//        }
//      default:
//        {
//          return super.onOptionsItemSelected(item);
//        }
//    }
//  }

  private void addUpToActionBar() {
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//      // After Honeycomb => actionbar api is present
//      getActionBar().setDisplayHomeAsUpEnabled(true);
//    }
  }

}

