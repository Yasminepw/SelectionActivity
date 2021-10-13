package edu.temple.selectionactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import edu.temple.selectionactivity.MainActivity.Companion.IMAGE_OBJECT


class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Set title of activity.
        supportActionBar?.title = getString(R.string.title_display_er)
        val textView = findViewById<TextView>(R.id.displayerTextView)
        val imageView = findViewById<ImageView>(R.id.displayerImageView)
        val imageObject = intent.getParcelableExtra<Images>(IMAGE_OBJECT)

        if (imageObject != null) {
            textView.text = imageObject.title.toString()
            imageView.setImageResource(imageObject.resourceId)
        }

    }
}