package edu.temple.selectionactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val _dataSet: List<Images>, private val myOnClick: (position: Int) -> Unit) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    class ViewHolder(_imageView: View, private val myOnClick: (position: Int) -> Unit) : RecyclerView.ViewHolder(_imageView), View.OnClickListener {

        val imageView: ImageView = _imageView.findViewById(R.id.adapterImageView)

        init {
            imageView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            myOnClick(position)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_main, parent, false)
        return ViewHolder(view, myOnClick)
    }


    override fun getItemCount() = _dataSet.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(_dataSet[position].resourceId)
    }
}

