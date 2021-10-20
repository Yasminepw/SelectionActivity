package edu.temple.selectionactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_display, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ViewModelProvider(requireActivity())
            .get(ImagesViewModel::class.java)
            .getImageObject()
            .observe(requireActivity(), {updateImageDetails(it)})
    }

    private fun updateImageDetails(imageObject: Images) {
        view?.findViewById<TextView>(R.id.displayTextView)?.text = imageObject.title.toString()
        view?.findViewById<ImageView>(R.id.displayImageView)
            ?.setImageResource(imageObject.resourceId)
    }

}