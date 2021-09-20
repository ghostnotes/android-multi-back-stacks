package co.ghostnotes.sample.multibackstacks.ui.subscriptions

import android.os.Bundle
import android.view.View
import co.ghostnotes.sample.multibackstacks.R
import co.ghostnotes.sample.multibackstacks.databinding.FragmentSubscriptionsBinding
import co.ghostnotes.sample.multibackstacks.extensions.navigate
import co.ghostnotes.sample.multibackstacks.ui.BaseFragment

class SubscriptionsFragment : BaseFragment<FragmentSubscriptionsBinding>() {

    override val layoutId: Int = R.layout.fragment_subscriptions

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            navigate(SubscriptionsFragmentDirections.actionSubscriptionsScreenToSubscriptionsDetailScreen())
        }
    }
}
