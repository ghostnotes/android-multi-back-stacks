package co.ghostnotes.sample.multibackstacks.ui.shorts

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import co.ghostnotes.sample.multibackstacks.R
import co.ghostnotes.sample.multibackstacks.databinding.FragmentShortsBinding
import co.ghostnotes.sample.multibackstacks.extensions.navigate
import co.ghostnotes.sample.multibackstacks.ui.BaseFragment

class ShortsFragment : BaseFragment<FragmentShortsBinding>() {
    override val layoutId: Int = R.layout.fragment_shorts

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            navigate(ShortsFragmentDirections.actionShortsScreenToShortsDetailScreen())
        }
    }
}
