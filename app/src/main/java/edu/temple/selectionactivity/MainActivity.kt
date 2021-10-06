package edu.temple.selectionactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val POSITION = "edu.temple.selectionactivity.POSITION"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = getString(R.string.title_selector)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        val adapter = ImageAdapter(photoList()) { position -> myOnClick(position) }

        recyclerView.adapter = adapter

    }

    private fun myOnClick(position: Int) {
        val intent = Intent(this, DisplayActivity::class.java).apply {
            putExtra(POSITION, position)
        }
        startActivity(intent)
    }

}
