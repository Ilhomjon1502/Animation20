package uz.ilhomjon.fragmentdataexchange20.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.ilhomjon.fragmentdataexchange20.R
import uz.ilhomjon.fragmentdataexchange20.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)

        binding.tvName.text = arguments?.getString("keyName")

        return binding.root
    }

}