/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.notes.notes;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static org.junit.Assert.fail;

/**
 * Tests for the notes screen, the main screen which contains a grid of all notes.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class NotesScreenTest {
    private HomePage app;

    /**
     * {@link ActivityTestRule} is a JUnit {@link Rule @Rule} to launch your activity under test.
     *
     * <p>
     * Rules are interceptors which are executed for each test method and are important building
     * blocks of Junit tests.
     */
    @Rule
    public ActivityTestRule<NotesActivity> mNotesActivityTestRule =
            new ActivityTestRule<>(NotesActivity.class);

    @Before
    public void setUp() {
        app = new HomePage();
    }

    @Test
    public void clickAddNoteButton_opensAddNoteUi() throws Exception {
        fail("Implement step 7");
//        // Click on the add note button
//        onView(withId(R.id.fab_add_notes)).perform(click());
//
//        // Check if the add note screen is displayed
//        onView(withId(R.id.add_note_title)).check(matches(isDisplayed()));
    }

    @Test
    public void addNoteToNotesList() throws Exception {
//        fail("Implement step 7");
        String NoteTitle = "Espresso";
        String NoteDescription = "UI testing for Android";

        app.is(HomePage.class).openNewNote()
           .is(newNotePage.class).createNote(NoteTitle, NoteDescription)
           .is(HomePage.class).checkNoteExist(NoteDescription);
    }

}