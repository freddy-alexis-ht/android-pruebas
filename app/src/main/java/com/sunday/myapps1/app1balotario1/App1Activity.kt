package com.sunday.myapps1.app1balotario1

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.viewModels
import com.sunday.myapps1.R
import com.sunday.myapps1.databinding.ActivityApp1Binding

class App1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityApp1Binding
    private val app1VM: App1ViewModel by viewModels()
    private lateinit var state: AppState

    private lateinit var dialog: Dialog
    private lateinit var btnGoBack: Button
    private lateinit var tvAnswer: TextView
    private lateinit var ivAnswer: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApp1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        initComponents()
        app1VM.onCreate()
        state = app1VM.state.value!!
        initListeners()
    }

    private fun initComponents() {
        dialog = Dialog(this)
        dialog.setContentView(R.layout.activity_app1_dialog)
        btnGoBack = dialog.findViewById(R.id.btnGoBack)
        tvAnswer = dialog.findViewById(R.id.tvAnswer)
        ivAnswer = dialog.findViewById(R.id.ivAnswer)
    }

    private fun initListeners() {
        binding.btnSend.setOnClickListener {
            app1VM.onEvent(UiEvent.OnSendAnswer(getRadioButtonText()))
            setAnswerText(state.answer)
            setAnswerImage(state.answer)
            app1VM.onEvent(UiEvent.ShowDialog)
            if(state.isDialogVisible)
                dialog.show()
        }
        btnGoBack.setOnClickListener {
            app1VM.onEvent(UiEvent.HideDialog)
            if(!state.isDialogVisible)
                dialog.hide()
        }
    }

    private fun getRadioButtonText(): String {
        val checkedRadioButtonId = binding.rgAlternatives.checkedRadioButtonId
        val text = binding.rgAlternatives.findViewById<RadioButton>(checkedRadioButtonId).text
        return text.toString()
    }
    private fun setAnswerText(color: String) {
        if(color.uppercase() == "NEGRO") {
            tvAnswer.text = "Correcto .. Domingo es "+color
        }else{
            tvAnswer.text = "Incorrecto .. Domingo no es "+color
        }
    }
    private fun setAnswerImage(color: String) {
        if(color.uppercase() == "NEGRO") {
            ivAnswer.setImageResource(R.drawable.alien)
        }else{
            ivAnswer.setImageResource(R.drawable.luna)
        }
    }

}