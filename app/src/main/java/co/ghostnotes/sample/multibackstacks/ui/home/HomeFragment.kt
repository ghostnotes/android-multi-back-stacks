package co.ghostnotes.sample.multibackstacks.ui.home

import android.os.Bundle
import android.view.View
import co.ghostnotes.sample.multibackstacks.R
import co.ghostnotes.sample.multibackstacks.databinding.FragmentHomeBinding
import co.ghostnotes.sample.multibackstacks.extensions.navigate
import co.ghostnotes.sample.multibackstacks.ui.BaseFragment
import timber.log.Timber

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val layoutId: Int = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            Timber.d("### onClick()")
            navigate(HomeFragmentDirections.actionHomeScreenToHomeDetailScreen())
        }
    }
}
