package pl.org.seva.myapplication.main

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.*
import pl.org.seva.myapplication.R
import pl.org.seva.myapplication.main.extension.inflate

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflate(R.layout.fragment_main, container)

    suspend fun a() {

        delay(10L)

        coroutineScope {

            val a = launch { "2" }
        }
    }

    @SuppressLint("SetTextI18n", "CheckResult")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var a: Deferred<Int>



        GlobalScope.launch {
            a = async { 1 }
            a.onAwait

            val bocian = async { 1 }

            Schedulers.io()
            coroutineScope {
                val zaba = async { 2 }

            }

        }
    }

}
