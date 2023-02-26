package com.example.workmanagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.work.*

class MainActivity : AppCompatActivity() {

    lateinit var workManager:WorkManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startWork(view: View){


        val constraints: Constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.UNMETERED)
            .setRequiresBatteryNotLow(true)
            .build()

        var inputData:Data = Data.Builder()
            .putString("url","www.google.com")
            .build()

        val workRequest = OneTimeWorkRequestBuilder<MyWorker>()
            .setConstraints(constraints)
            .setInputData(inputData)
            .build()

        workManager = WorkManager.getInstance(this)
        val result = workManager.enqueue(workRequest)


        workManager.getWorkInfoByIdLiveData(workRequest.id).observe(this, Observer {
            if(it!= null && it.state.isFinished){
                val output = it.outputData.getString("Progress")
                Toast.makeText(this,output.toString(),Toast.LENGTH_SHORT).show()
            }
        })



    }


}

