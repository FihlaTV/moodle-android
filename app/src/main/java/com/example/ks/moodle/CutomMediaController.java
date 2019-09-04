package com.example.ks.moodle;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.MediaController;

public class CutomMediaController extends MediaController implements MediaController.MediaPlayerControl {

    public CutomMediaController(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CutomMediaController(Context context, boolean useFastForward) {
        super(context, useFastForward);
    }

    public CutomMediaController(Context context) {
        super(context);
    }

    @Override
    public void start() {
        Log.d("ks","daying");


    }

    @Override
    public void pause() {

    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public int getCurrentPosition() {
        return 0;
    }

    @Override
    public void seekTo(int i) {

    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public int getBufferPercentage() {
        return 0;
    }

    @Override
    public boolean canPause() {
        return false;
    }

    @Override
    public boolean canSeekBackward() {
        return false;
    }

    @Override
    public boolean canSeekForward() {
        return false;
    }

    @Override
    public int getAudioSessionId() {
        return 0;
    }
}
