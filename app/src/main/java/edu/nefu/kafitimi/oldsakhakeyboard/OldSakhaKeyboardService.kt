package edu.nefu.kafitimi.oldsakhakeyboard

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.Button

class OldSakhaKeyboardService : InputMethodService() {

    override fun onCreateInputView(): View {
        return layoutInflater.inflate(R.layout.input, null).apply {
            findViewById<Button>(R.id.button_q).setOnClickListener {
                currentInputConnection.commitText("q", 1)
            }
            findViewById<Button>(R.id.button_w).setOnClickListener {
                currentInputConnection.commitText("w", 1)
            }
            findViewById<Button>(R.id.button_e).setOnClickListener {
                currentInputConnection.commitText("e", 1)
            }
            findViewById<Button>(R.id.button_r).setOnClickListener {
                currentInputConnection.commitText("r", 1)
            }
            findViewById<Button>(R.id.button_t).setOnClickListener {
                currentInputConnection.commitText("t", 1)
            }
            findViewById<Button>(R.id.button_y).setOnClickListener {
                currentInputConnection.commitText("y", 1)
            }
            findViewById<Button>(R.id.button_u).setOnClickListener {
                currentInputConnection.commitText("u", 1)
            }
            findViewById<Button>(R.id.button_i).setOnClickListener {
                currentInputConnection.commitText("i", 1)
            }
            findViewById<Button>(R.id.button_o).setOnClickListener {
                currentInputConnection.commitText("ɔ", 1)
            }
            findViewById<Button>(R.id.button_p).setOnClickListener {
                currentInputConnection.commitText("p", 1)
            }
            findViewById<Button>(R.id.button_lambda).setOnClickListener {
                currentInputConnection.commitText("ʎ", 1)
            }
            findViewById<Button>(R.id.button_epsilon).setOnClickListener {
                currentInputConnection.commitText("з", 1)
            }
            findViewById<Button>(R.id.button_integral).setOnClickListener {
                currentInputConnection.commitText("ʃ", 1)
            }

            findViewById<Button>(R.id.button_a).setOnClickListener {
                currentInputConnection.commitText("a", 1)
            }
            findViewById<Button>(R.id.button_s).setOnClickListener {
                currentInputConnection.commitText("s", 1)
            }
            findViewById<Button>(R.id.button_d).setOnClickListener {
                currentInputConnection.commitText("d", 1)
            }
            findViewById<Button>(R.id.button_f).setOnClickListener {
                currentInputConnection.commitText("ɟ", 1)
            }
            findViewById<Button>(R.id.button_g).setOnClickListener {
                currentInputConnection.commitText("g", 1)
            }
            findViewById<Button>(R.id.button_h).setOnClickListener {
                currentInputConnection.commitText("h", 1)
            }
            findViewById<Button>(R.id.button_j).setOnClickListener {
                currentInputConnection.commitText("j", 1)
            }
            findViewById<Button>(R.id.button_k).setOnClickListener {
                currentInputConnection.commitText("k", 1)
            }
            findViewById<Button>(R.id.button_l).setOnClickListener {
                currentInputConnection.commitText("l", 1)
            }
            findViewById<Button>(R.id.button_omega).setOnClickListener {
                currentInputConnection.commitText("ɯ", 1)
            }
            findViewById<Button>(R.id.button_ie).setOnClickListener {
                currentInputConnection.commitText("ꭡ", 1)
            }

            findViewById<Button>(R.id.button_oe).setOnClickListener {
                currentInputConnection.commitText("ꭢ", 1)
            }
            findViewById<Button>(R.id.button_uo).setOnClickListener {
                currentInputConnection.commitText("ꭣ", 1)
            }
            findViewById<Button>(R.id.button_c).setOnClickListener {
                currentInputConnection.commitText("c", 1)
            }
            findViewById<Button>(R.id.button_v).setOnClickListener {
                currentInputConnection.commitText("ɲ", 1)
            }
            findViewById<Button>(R.id.button_b).setOnClickListener {
                currentInputConnection.commitText("b", 1)
            }
            findViewById<Button>(R.id.button_n).setOnClickListener {
                currentInputConnection.commitText("n", 1)
            }
            findViewById<Button>(R.id.button_m).setOnClickListener {
                currentInputConnection.commitText("m", 1)
            }
            findViewById<Button>(R.id.button_nj).setOnClickListener {
                currentInputConnection.commitText("ŋ", 1)
            }
            findViewById<Button>(R.id.button_ib).setOnClickListener {
                currentInputConnection.commitText("ҧ", 1)
            }
            findViewById<Button>(R.id.button_dot).setOnClickListener {
                currentInputConnection.commitText(".", 1)
            }
            findViewById<Button>(R.id.button_back).setOnClickListener {
                currentInputConnection.deleteSurroundingText(1, 0);
            }
        }
    }
}