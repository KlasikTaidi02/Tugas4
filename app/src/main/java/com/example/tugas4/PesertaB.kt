package com.example.tugas4

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PesertaB.newInstance] factory method to
 * create an instance of this fragment.
 */
class PesertaB : Fragment() {

    private lateinit var  detailList: ArrayList<Detail>
    private lateinit var  detailadapter: RecyclerAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_peserta_a, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postToList()

        recyclerView = view.findViewById(R.id.rv_recyclerViewa)
        recyclerView.layoutManager = LinearLayoutManager(context)
        detailadapter = RecyclerAdapter(detailList)
        recyclerView.adapter =  detailadapter

        detailadapter.onItemClick = {

            val i = Intent(context, DetailActivity::class.java)
            i.putExtra("detail", it )

            startActivity(i)
        }

    }



    private fun postToList() {

        detailList = ArrayList()

        detailList.add(Detail("Klasik","fefesf","teknik informatika","4","https://media.licdn.com/dms/image/D5603AQH8T5ratqKmgg/profile-displayphoto-shrink_800_800/0/1680367893780?e=1694649600&v=beta&t=mUtVJLOMDcV0QDgXrZE96LmX7wneAYQs83ViW2F8_VE"))
        detailList.add(Detail("Pentaho","fefethfsf","teknik informatika","7","https://images.ctfassets.net/kkvmdunnrywi/2VrHtCTnpPXS1xByCl8Gme/ca3c0cd5bde9923a40714addfa76756f/pentaho.png?w=1280&h=853&q=50&fit=fill"))
        detailList.add(Detail("Tableu","fetfhfesf","teknik informatika","9","https://financeandbusiness.ucdavis.edu/sites/g/files/dgvnsk4871/files/styles/sf_landscape_16x9/public/images/article/tableau_logo.png?h=c673cd1c&itok=aomysVvE"))
        detailList.add(Detail("Phyton","fefesthff","teknik informatika","4","https://logos-download.com/wp-content/uploads/2016/10/Python_logo_icon-700x697.png"))
        detailList.add(Detail("Java","feww3twtfesf","teknik informatika","5","https://www.theindianwire.com/wp-content/uploads/2018/06/java-logo.png"))

    }

}