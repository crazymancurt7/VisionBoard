package com.visionboard.app;

import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

public class WallpaperEngine extends WallpaperService {

    @Override
    public Engine onCreateEngine() {
        return new MyEngine();
    }

    private class MyEngine extends Engine {
        @Override
        public void onCreate(SurfaceHolder surfaceHolder) {
            super.onCreate(surfaceHolder);
        }

        @Override
        public void onVisibilityChanged(boolean visible) {
            super.onVisibilityChanged(visible);
            if (visible) {
                // Corkboard render logic here
            }
        }
    }
}
