package com.example.challeng_abdul

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast



class OnBoardImageOneFragment : Fragment(), MainActivity.OnSendDataToFragment {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        (activity as MainActivity).listener = this

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_on_board_image, container, false)
    }


    override fun onDataSend(input: String) {
        Toast.makeText(requireContext(), "data : $input", Toast.LENGTH_SHORT).show()
    }

}