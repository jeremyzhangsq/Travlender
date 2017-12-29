package cs309.travlender.Remainder;

import android.app.Activity;
import android.os.Bundle;
import cs309.travelender.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_remainder);
		//Start polling service
		System.out.println("Start polling service...");
		PollingUtils.startPollingService(this, 1, RemindService.class, RemindService.ACTION);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		//Stop polling service
		System.out.println("Stop polling service...");
		PollingUtils.stopPollingService(this, RemindService.class, RemindService.ACTION);
	}

}
