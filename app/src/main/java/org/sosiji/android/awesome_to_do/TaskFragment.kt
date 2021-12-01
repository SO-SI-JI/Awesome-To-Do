package org.sosiji.android.awesome_to_do

import android.os.Bundle
import androidx.fragment.app.Fragment

class TaskFragment : Fragment() {

    private lateinit var task: Task

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        task = Task()
    }
}