package com.example.mike.myapplication;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class PianoBookSurfaceView extends Activity {

    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }

    class MyGLSurfaceView extends GLSurfaceView{

        private final MyGLRenderer mRenderer;

        public MyGLSurfaceView(Context context) {
            super(context);

//        Create an openGL ES 2.0 context
            setEGLContextClientVersion(2);

            mRenderer = new MyGLRenderer();

//        Set the Renderer for drawing on the GLSurfaceView
            setRenderer(mRenderer);
        }
    }

}
