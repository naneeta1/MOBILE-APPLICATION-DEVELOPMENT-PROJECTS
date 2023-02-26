package com.example.final_project

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class DeviceList : AppCompatActivity() {

    lateinit var LpairedDevices: ListView
    lateinit var LavailableDevices:ListView
    lateinit var adapterPaired:ArrayAdapter<String>
    lateinit var adapterAvailable:ArrayAdapter<String>
    lateinit var bluetoothAdapter:BluetoothAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_list)
    }
    fun init(){
        LpairedDevices = findViewById(R.id.paired_devices)
        LavailableDevices = findViewById(R.id.available_devices)

        adapterPaired = ArrayAdapter(this,R.layout.list_item)
        adapterAvailable = ArrayAdapter(this,R.layout.list_item)

        LpairedDevices.adapter = adapterPaired
        LavailableDevices.adapter = adapterAvailable

        var pDevices = if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.BLUETOOTH_CONNECT
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            bluetoothAdapter.bondedDevices;


        } else {

            return
        }
        if(pDevices!=null && pDevices.size!=0){
            for (device in pDevices) {
                adapterPaired.add(device.name + "\n" + device.address)
            }
        }

    }
}