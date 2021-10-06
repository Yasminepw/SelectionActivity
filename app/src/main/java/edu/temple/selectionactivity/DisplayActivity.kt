package edu.temple.selectionactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        title = getString(R.string.title_display_er)
        val textView = findViewById<TextView>(R.id.displayerTextView)
        val imageView = findViewById<ImageView>(R.id.displayerImageView)
        val position = intent.getIntExtra(POSITION, 0)

        // Set both views to the corresponding clicked item from image list.
        textView.text = photoList()[position].title
        imageView.setImageResource(photoList()[position].resourceId)

    }
}