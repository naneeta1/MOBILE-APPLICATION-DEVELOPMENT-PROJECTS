package com.example.workmanagerexample

import android.content.Context
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(context: Context, workerParams:WorkerParameters): Worker(context,workerParams) {
    override fun doWork(): Result {

        val url : String? = inputData.getString("url")?: return Result.failure()

        //download sata from internet
        //uploading
        //synchronizing
        val outputData:Data = Data.Builder()
            .putString("Progress","Download Successful")
            .build()

        //do some task
        return Result.success(outputData)
    }

}