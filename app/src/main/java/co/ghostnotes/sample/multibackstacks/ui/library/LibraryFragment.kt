package co.ghostnotes.sample.multibackstacks.ui.library

import android.os.Bundle
import android.view.View
import co.ghostnotes.sample.multibackstacks.R
import co.ghostnotes.sample.multibackstacks.databinding.FragmentLibraryBinding
import co.ghostnotes.sample.multibackstacks.extensions.navigate
import co.ghostnotes.sample.multibackstacks.ui.BaseFragment

class LibraryFragment : BaseFragment<FragmentLibraryBinding>() {
    override val layoutId: Int = R.layout.fragment_library

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            navigate(LibraryFragmentDirections.actionLibraryScreenToLibraryDetailScreen())
        }
    }
}
