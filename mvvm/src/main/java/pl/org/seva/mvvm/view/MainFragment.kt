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

package pl.org.seva.mvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fr_main.*
import pl.org.seva.mvvm.R
import pl.org.seva.mvvm.viewmodel.ActivityDescViewModel
import pl.org.seva.mvvm.main.extension.invoke
import pl.org.seva.mvvm.main.extension.getViewModel

class MainFragment : Fragment(R.layout.fr_main) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val vm = getViewModel<ActivityDescViewModel>()
        vm.activityDesc(this) {
            activity_desc.text = it.desc
            activity_conf.text = it.conf.toString()
        }
    }
}
