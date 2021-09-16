package id.gits.si.tugas12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvProgramMSIB: RecyclerView
    private val list = ArrayList<ProgramMSIB>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProgramMSIB = findViewById(R.id.mRV)
        rvProgramMSIB.setHasFixedSize(true)

        list.addAll(DataMSIB.listData)
        showRecyclerView()
    }

    private fun showRecyclerView() {
        rvProgramMSIB.layoutManager = LinearLayoutManager(this)
        val listProgramMSIBAdapter = ProgramMSIBAdapter(list)
        rvProgramMSIB.adapter = listProgramMSIBAdapter
    }
}