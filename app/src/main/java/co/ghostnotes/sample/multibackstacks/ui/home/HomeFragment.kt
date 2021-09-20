package co.ghostnotes.sample.multibackstacks.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import co.ghostnotes.sample.multibackstacks.R
import co.ghostnotes.sample.multibackstacks.databinding.FragmentHomeBinding
import co.ghostnotes.sample.multibackstacks.extensions.navigate
import co.ghostnotes.sample.multibackstacks.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val layoutId: Int = R.layout.fragment_home

    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel

        setUpViewModel()
    }

    private fun setUpViewModel() {
        lifecycleScope.launchWhenStarted {
            viewModel.navigateToDetail.collect { navigate ->
                if (navigate) {
                    navigate(HomeFragmentDirections.actionHomeScreenToHomeDetailScreen())
                }
            }
        }
    }
}
