package edu.temple.selectionactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val ARG_PARAM1 = "param1"

class SelectionFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    lateinit var images: ArrayList<Images>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        images = arguments?.getParcelableArrayList<Images>(ARG_PARAM1) as ArrayList<Images>
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val layout = inflater.inflate(R.layout.fragment_selection, container, false)
        layout.findViewById<TextView>(R.id.textView).text = getString(R.string.click_an_image)
        recyclerView = layout.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(layout.context, 3)

        // Set adapter and click listener.
        val adapter = ImageAdapter(photoList(resources)) {
                position -> myOnClick(position)
        }

        recyclerView.adapter = adapter

        return layout
    }

    companion object {

        fun getInstance (imageList: ArrayList<Images>) : SelectionFragment {
            val fragment = SelectionFragment()
            val bundle = Bundle()

            bundle.putParcelableArrayList(ARG_PARAM1, imageList)
            fragment.arguments = bundle
            return fragment
        }
    }

    private fun myOnClick(position: Int) {
        val imagesViewModel = ViewModelProvider(requireActivity()).get(ImagesViewModel::class.java)
        imagesViewModel.setImageObject(images[position])
    }

}