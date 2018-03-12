package com.example.android.testing.notes.notes;

/**
 * Created by garycheng on 2018/2/27.
 */


// https://github.com/sebaslogen/CleanGUITestArchitecture/blob/master/app/src/androidTest/java/com/neoranga55/cleanguitestarchitecture/cucumber/pages/BasePage.java
public class BasePage {

    protected static final String SCREENSHOT_TAG = "invalid-page";

    public <T extends BasePage> T is(Class<T> type) {
        if (type.isInstance(this)) {
            return type.cast(this);
        } else {
            throw new InvalidPageException("Invalid page type. Expected: " + type.getSimpleName() + ", but got: " + this.getClass().getSimpleName());
        }
    }

    public static class InvalidPageException extends RuntimeException {

        public InvalidPageException(final String message) {
            super(message);
        }
    }
}
