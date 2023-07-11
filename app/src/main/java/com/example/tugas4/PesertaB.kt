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

        detailList.add(Detail("Ruby","fefesf","teknik informatika","4","https://logos-download.com/wp-content/uploads/2016/09/Ruby_logo-700x700.png"))
        detailList.add(Detail("C","fefethfsf","teknik informatika","7","https://clipground.com/images/c-icon-clipart-4.png"))
        detailList.add(Detail("Raptor","fetfhfesf","teknik informatika","9","https://4.bp.blogspot.com/-7Alc0RKZTWA/Wql1kVRUO-I/AAAAAAAAAV4/UlZCu1pJKskpT-GOie2i99ZA4zuTCM9OACLcBGAs/s1600/raptor.gif"))
        detailList.add(Detail("Android","fefesthff","teknik informatika","4","https://www.hdwallpaperspulse.com/wp-content/uploads/2016/08/08/boot-android-logo-image.jpg"))
        detailList.add(Detail("Apple","feww3twtfesf","teknik informatika","5","https://purepng.com/public/uploads/large/purepng.com-apple-logologobrand-logoiconslogos-251519938788qhgdl.png"))

    }

}