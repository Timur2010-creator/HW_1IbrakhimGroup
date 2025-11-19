package com.example.hw_1ibrakhimgroup

import android.R.attr.name
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw_1ibrakhimgroup.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: SerialAdapter
    private var listSerial = arrayListOf<SerialModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = SerialAdapter(listSerial,onClick = { model ->
            Log.d("ololo", "onViewCreated: ${model.name}")
            val bundle = Bundle()
            bundle.putSerializable("key",model)
            val detailFragment = DetailFragment()
            detailFragment.arguments = bundle

            findNavController().navigate(R.id.action_mainFragment_to_detailFragment,bundle)
        })
        binding.rvSerial.adapter = adapter
        binding.rvSerial.layoutManager = LinearLayoutManager(requireContext())
    }

    fun loadData() {
        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=f4e16672cbe70033cae0ce4ff5a27724-4034574-images-thumbs&n=13",
                name = "Cars",
                episode = "1 part",
                date = "14 March,2006"
            )
        )


        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=9b85e8fec6caba0df3f15d5cb8fec38c60d1a1b5-4228606-images-thumbs&n=13",
                name = "Friday the 13th",
                episode = "1 part",
                date = "1980"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=3c2e697fec3fbba1d013dd9633f4c051b8a5b6ee-6598320-images-thumbs&n=13",
                name = "Forrest Gump",
                episode = "1 part",
                date = "1994"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=c673cd85d8234d3b9b6325bc336d5a25c036bcb9-5235643-images-thumbs&n=13",
                name = "I am legend",
                episode = "1 part",
                date = "2007"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/get-entity_search/2162801/687369024/S134x201_2x",
                name = "2Pac:Legend",
                episode = "1 part",
                date = "2017"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=3d3a6b5b5189f51623d07b74c0e2a3dd43b7d2d7-5468635-images-thumbs&n=13",
                name = "Lalaland",
                episode = "1 part",
                date = "2016"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=ac96baf18c4eca3a87a70cd3a28890eb101df7b9-5232106-images-thumbs&n=13",
                name = "Green mile",
                episode = "1 part",
                date = "1999"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=9d5bfa0a115c43317627f2a2a732a64312596abb-5859283-images-thumbs&n=13",
                name = "Meow",
                episode = "20 series",
                date = "2023"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=f4e16672cbe70033cae0ce4ff5a27724-4034574-images-thumbs&n=13",
                name = "Cars",
                episode = "1 part",
                date = "14 March,2006"
            )
        )


        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=9b85e8fec6caba0df3f15d5cb8fec38c60d1a1b5-4228606-images-thumbs&n=13",
                name = "Friday the 13th",
                episode = "1 part",
                date = "1980"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=3c2e697fec3fbba1d013dd9633f4c051b8a5b6ee-6598320-images-thumbs&n=13",
                name = "Forrest Gump",
                episode = "1 part",
                date = "1994"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=c673cd85d8234d3b9b6325bc336d5a25c036bcb9-5235643-images-thumbs&n=13",
                name = "I am legend",
                episode = "1 part",
                date = "2007 "
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/get-entity_search/2162801/687369024/S134x201_2x",
                name = "2Pac:Legend",
                episode = "1 part",
                date = "2017"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=3d3a6b5b5189f51623d07b74c0e2a3dd43b7d2d7-5468635-images-thumbs&n=13",
                name = "Lalaland",
                episode = "1 part",
                date = "2016"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=ac96baf18c4eca3a87a70cd3a28890eb101df7b9-5232106-images-thumbs&n=13",
                name = "Green mile",
                episode = "1 part",
                date = "1999"
            )
        )

        listSerial.add(
            SerialModel(
                img = "https://avatars.mds.yandex.net/i?id=9d5bfa0a115c43317627f2a2a732a64312596abb-5859283-images-thumbs&n=13",
                name = "Meow",
                episode = "20 series",
                date = "2023"
            )
        )
    }
}