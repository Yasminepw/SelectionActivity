package edu.temple.selectionactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ImagesViewModel: ViewModel() {
    private val imageObject : MutableLiveData<Images> by lazy {
        MutableLiveData<Images>()
    }

    fun getImageObject() : LiveData<Images> {
        return imageObject
    }

    fun setImageObject(imageObject: Images) {
        this.imageObject.value = imageObject
    }
}
