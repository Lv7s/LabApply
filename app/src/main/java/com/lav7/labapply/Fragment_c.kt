package com.lav7.labapply

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main. *
import kotlinx.android.synthetic.main.fragment_c.*

class Fragment_c : Fragment(), View.OnClickListener {
    var VolReq : Float? = null
    var ConcTris : Float? = null
    var ConcNaCl : Float? = null
    var ConcMgCl2 : Float? = null
    var VolGlic : Float? = null
    val TRIS = 121.14
    val NaCl = 58.44
    val Hepes = 238.30
    val MgCl2Anhidro = 95.21
    val MgCl2Hexahidro = 203.31
    val Glicerol = 1.26

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onClick(p0: View?) {
        if  (TextUtils.isEmpty(editTextTextPersonName.text.toString())){
            editTextTextPersonName.error = "Ingresa un numero"
            editTextTextPersonName.requestFocus()
            return
        }else {
            VolReq = editTextTextPersonName.text.toString().toFloat()
        }
        if  (TextUtils.isEmpty(editTextTextPersonName2.text.toString())){
            editTextTextPersonName2.error = "Ingresa un numero"
            editTextTextPersonName2.requestFocus()
            return
        }else {
            ConcTris = editTextTextPersonName2.text.toString().toFloat()
        }
        if  (TextUtils.isEmpty(editTextTextPersonName3.text.toString())){
            editTextTextPersonName3.error = "Ingresa un numero"
            editTextTextPersonName3.requestFocus()
            return
        }else {
            ConcNaCl = editTextTextPersonName3.text.toString().toFloat()
        }
        if  (TextUtils.isEmpty(editTextTextPersonName5.text.toString())){
            editTextTextPersonName5.error = "Ingresa un numero"
            editTextTextPersonName5.requestFocus()
            return
        }else {
            ConcMgCl2 = editTextTextPersonName5.text.toString().toFloat()
        }
        if  (TextUtils.isEmpty(editTextTextPersonName4.text.toString())){
            editTextTextPersonName4.error = "Ingresa un numero"
            editTextTextPersonName4.requestFocus()
            return
        }else {
            VolGlic = editTextTextPersonName4.text.toString().toFloat()
        }
        when(p0?.id){
            R.id.calcularTris -> {
                textView.text=ConcTris!!.times(VolReq!!).times(TRIS).toString()
                textView2.text=ConcNaCl!!.times(VolReq!!).times(NaCl).toString()
                textView3.text=ConcMgCl2!!.times(VolReq!!).times(MgCl2Hexahidro).toString()
                textView8.text=VolGlic!!.times(Glicerol).toString()}
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }
}