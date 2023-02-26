package com.example.final_project

import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    lateinit var bluetoothAdapter:BluetoothAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Bluetooth()
    }

    private fun checkPermission(){
        if(ContextCompat.checkSelfPermission(
                this@MainActivity,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            )!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this@MainActivity,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),102)
        }
        else{
            val intent = Intent(this, DeviceList::class.java)
            startActivityForResult(intent, 102)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if(requestCode==102){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                startActivity(Intent(this,DeviceList::class.java));

            }
            else{
                val builder = AlertDialog.Builder(this)
                    builder.setTitle("Bluetooth check")
                    builder.setMessage("Location permission is provided")
                    builder.setPositiveButton("Grant"){ _, _ ->checkPermission()}
                    builder.setNegativeButton("Deny"){_,_->this.finish()}
                    val dialog = builder.create()
                    dialog.setCancelable(false)
                    dialog.show()
            }
        }else{
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
    fun Bluetooth(){
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
        if(bluetoothAdapter==null){
            Toast.makeText(this,"No bluetooth Found",Toast.LENGTH_SHORT).show()
        }
    }

    fun enableBluetooth(){
        if(!bluetoothAdapter.isEnabled){
            if (ActivityCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.BLUETOOTH_CONNECT
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                bluetoothAdapter.enable();
                return
            }

        }
        if (bluetoothAdapter.scanMode != BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
            val discoveryIntent = Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE)
            discoveryIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300)
            startActivity(discoveryIntent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.Bluetooth-> {
                enableBluetooth()
            }
            R.id.addPerson->{
                checkPermission()
            }
        }
        return true

        }
    }

