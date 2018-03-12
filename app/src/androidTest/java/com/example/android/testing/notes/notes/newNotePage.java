package com.example.android.testing.notes.notes;

import com.example.android.testing.notes.R;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.Espresso.onView;

/**
 * Created by garycheng on 2018/2/27.
 */

public class newNotePage extends BasePage {

    public HomePage createNote(String newNoteTitle, String newNoteDescription) {
        // Add note title and description
        // Type new note title
        onView(withId(R.id.add_note_title)).perform(typeText(newNoteTitle), closeSoftKeyboard());
        onView(withId(R.id.add_note_description)).perform(typeText(newNoteDescription),
                closeSoftKeyboard()); // Type new note description and close the keyboard

        // Save the note
        onView(withId(R.id.fab_add_notes)).perform(click());

        return new HomePage();
    }
}
