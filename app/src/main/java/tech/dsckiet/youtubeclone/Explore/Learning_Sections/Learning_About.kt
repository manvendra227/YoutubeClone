package tech.dsckiet.youtubeclone.Explore.Learning_Sections

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tech.dsckiet.youtubeclone.R

/**
 * A simple [Fragment] subclass.
 */
class Learning_About : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_learning__about, container, false)
    }

}
