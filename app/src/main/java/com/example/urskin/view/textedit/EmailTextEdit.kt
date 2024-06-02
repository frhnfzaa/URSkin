package com.example.urskin.view.textedit

import android.content.Context
import android.text.TextWatcher
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import com.example.urskin.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class EmailTextEdit(context: Context, attrs: AttributeSet) : TextInputEditText(context, attrs) {

    private val regexEmail = "^[A-Za-z0-9+_.-]+@(.+)\$".toRegex()
    private lateinit var parentLayout: TextInputLayout

    init {
        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                parentLayout.error = null
                val emailPattern = "[A-Za-z0-9+_.-]+@(.+)\$"
                if (!s.toString().matches(emailPattern.toRegex())) {
                    parentLayout.error = context.getString(R.string.invalid)
                }
            }

            override fun afterTextChanged(s: android.text.Editable?) {
            }
        })
    }
    fun setParentLayout(layout: TextInputLayout) {
        parentLayout = layout
    }
}