package uz.ilhomjon.fragmentdataexchange20.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import uz.ilhomjon.fragmentdataexchange20.R
import uz.ilhomjon.fragmentdataexchange20.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding
    lateinit var secondFragment: SecondFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)

        binding.btnNext.setOnClickListener {
            val matn  = binding.edtName.text.toString()
            secondFragment = SecondFragment()

            val bundel = bundleOf("keyName" to matn)

            secondFragment.arguments = bundel

            parentFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
                .replace(R.id.main, secondFragment)
                .addToBackStack("qoshish")
                .commit()
        }

        return binding.root
    }

}