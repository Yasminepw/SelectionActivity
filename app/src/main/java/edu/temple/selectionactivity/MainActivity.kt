package edu.temple.selectionactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

    class MainActivity : AppCompatActivity() {
        // Save const string for put extra tag.
        companion object {
            const val IMAGE_OBJECT = "edu.temple.selectionactivity.IMAGES"
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Set title of activity.
            supportActionBar?.title = getString(R.string.title_selector)

            // Assign RecyclerView and set to grid layout.
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
            recyclerView.layoutManager = GridLayoutManager(this, 3)

        }
    }
