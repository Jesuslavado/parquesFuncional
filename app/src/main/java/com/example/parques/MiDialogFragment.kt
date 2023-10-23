package com.example.parques
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
class MiDialogFragment: DialogFragment()  {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Confirmacion"
            val content = "¿Quieres guardar los datos?"
            val builder:AlertDialog.Builder=AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(android.R.string.ok)  {dialog, which ->
                    //Callback para el ok
                }
                .setNegativeButton(android.R.string.cancel) {dialog, which ->
                    //Callback para el Cancel
                }
            //Devuelve un AlertDialog
            //tal y como lo hemos definido en el builder
            return builder.create()} ?: throw IllegalStateException("El fragmento no está asociado a ninguna actividad")
    }
}