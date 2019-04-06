/*
 * Copyright (C) 2019 Wiktor Nizio
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * If you like this program, consider donating bitcoin: bc1qncxh5xs6erq6w4qz3a7xl7f50agrgn3w58dsfp
 */

package pl.org.seva.mvvm

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule
import pl.org.seva.mvvm.action.DelayAction
import pl.org.seva.mvvm.view.MainActivity

@RunWith(AndroidJUnit4::class)
class ActivityRecognitionTest {

    @Suppress("unused", "BooleanLiteralArgument")
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, true)

    private fun delay(millis: Long) = onView(isRoot()).perform(DelayAction.delay(millis))

    @Test
    fun testActivityRecognition() {
        delay(INITIAL_DELAY)
    }

    companion object {
        private const val INITIAL_DELAY = 5000L
        private const val SECOND_MS = 1000L
    }
}
