package hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.Adapters.InspPeopleAdapter
import hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.data.PeopleRepository
import hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        //binding za button, zatrebat ce

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        mainBinding.btnSecAct.setOnClickListener{createNewPerson()}
        setContentView(mainBinding.root)
        */

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        mainBinding.csPeopleDisplay.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        mainBinding.csPeopleDisplay.itemAnimator = DefaultItemAnimator()
        mainBinding.csPeopleDisplay.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))
        displayData()
        setContentView(mainBinding.root)

    }


    /*
    //otvaranje novog aktivitija preko buttona

    private fun createNewPerson() {
        val newNoteIntent = Intent(this, inputNewPersonActivity::class.java)
        startActivity(newNoteIntent)
    }
     */

    private fun displayData(){
        mainBinding.csPeopleDisplay.adapter = InspPeopleAdapter(PeopleRepository.people)
    }

}