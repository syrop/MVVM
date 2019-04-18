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

package pl.org.seva.mvvm.mock

import kotlinx.coroutines.*
import pl.org.seva.mvvm.model.ActivityDesc
import pl.org.seva.mvvm.model.ActivityRecognitionObservable

class MockActivityRecognitionObservable : ActivityRecognitionObservable() {

    init {
        GlobalScope.launch(Dispatchers.IO) {
            repeat(Int.MAX_VALUE) {
                delay(1000)
                channel.offer(if (it % 2L == 0L) ACT1 else ACT2)
            }
        }
    }

    companion object {
        const val DESC1 = "on foot"
        const val CONF1 = 50
        const val DESC2 = "in vehicle"
        const val CONF2 = 100

        private val ACT1 = ActivityDesc(DESC1, CONF1)
        private val ACT2 = ActivityDesc(DESC2, CONF2)
    }
}
