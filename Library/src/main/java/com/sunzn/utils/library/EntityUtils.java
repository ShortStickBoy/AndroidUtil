package com.sunzn.utils.library;

/**
 * Created by sunzn on 2016/12/9.
 */

class EntityUtils {

    private EntityUtils() {
        super();
    }

    static class Screen {

        private int width, height, density;

        Screen(int width, int height, int density) {
            this.width = width;
            this.height = height;
            this.density = density;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getDensity() {
            return density;
        }
    }

}
