package com.lav7.labapply

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main. *
import kotlinx.android.synthetic.main.fragment_c.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_c.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_c : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
            calcularTris.setOnClickListener { this }
            arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
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
            R.id.calcularTris -> {textView.text=ConcTris!!.times(VolReq!!).times(TRIS).toString()}
            R.id.calcularTris -> {textView2.text=ConcNaCl!!.times(VolReq!!).times(NaCl).toString()}
            R.id.calcularTris -> {textView3.text=ConcMgCl2!!.times(VolReq!!).times(MgCl2Hexahidro).toString()}
            R.id.calcularTris -> {textView8.text=VolGlic!!.times(Glicerol).toString()}
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment_c.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment_c().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}