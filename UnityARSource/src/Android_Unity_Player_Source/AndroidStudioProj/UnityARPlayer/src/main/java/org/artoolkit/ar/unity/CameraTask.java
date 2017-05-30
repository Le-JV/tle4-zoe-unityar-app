package org.artoolkit.ar.unity;

import android.os.AsyncTask;

/**
 * Created by JV on 5/30/2017.
 */
private class ControlCameraTask extends AsyncTask<Integer, Void, Void> {

    protected Void doInBackground(Integer... urls) {

        //--
        if (app.mCamera != null) {
            app.mCamera.stopPreview();
            app.mCamera.release();
            app.mCamera = null;
        } else {
            app.mCamera = GetCameraInstance(currentCameraId);
            app.mCamera.setPreviewDisplay(app.mSurfaceHolder);
            app.mCamera.startPreview();
        }

        return null;
    }
}