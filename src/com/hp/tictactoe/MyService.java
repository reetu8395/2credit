package com.hp.tictactoe;
import com.hp.tictactoe.R.raw;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.IBinder;
import android.widget.Toast;


public class MyService extends Service implements OnCompletionListener
{
   MediaPlayer mp;
   

@Override
public IBinder onBind(Intent intent) 
{
	// TODO Auto-generated method stub
	return null;
}

@Override
	public int onStartCommand(Intent intent, int flags, int startId)
{
		// TODO Auto-generated method stub
	     mp=MediaPlayer.create(this,raw.extreme_ways);
	if(!mp.isPlaying())
	{
		mp.start();
	}
	else
	{
		Toast.makeText(this,"song already played",Toast.LENGTH_LONG).show();
	}
	return START_STICKY;
		//return super.onStartCommand(intent, flags, startId);
	}
@Override
	public void onDestroy() 
    {
		// TODO Auto-generated method stub
		//super.onDestroy();
		mp.stop();
	}

public void onCompletion(MediaPlayer mp) {
	// TODO Auto-generated method stub
	stopSelf();
	
}
}
