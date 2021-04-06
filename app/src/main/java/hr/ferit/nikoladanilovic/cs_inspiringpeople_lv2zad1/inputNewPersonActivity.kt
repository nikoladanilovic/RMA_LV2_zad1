package hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.Model.InspiringPerson
import hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.databinding.ActivityInputNewPersonBinding

class inputNewPersonActivity : AppCompatActivity() {

    private lateinit var inputBinding : ActivityInputNewPersonBinding
    //var newPerson = InspiringPerson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        inputBinding = ActivityInputNewPersonBinding.inflate(layoutInflater)
        inputBinding.btnInputAddPerson.setOnClickListener { addNewPersonToRecyclerView() }
        setContentView(inputBinding.root)

    }

    private fun addNewPersonToRecyclerView() {

        val newPerson = InspiringPerson(inputBinding.etInputFullName.text.toString()
                ,inputBinding.etInputDateOfBirth.text.toString()
                ,inputBinding.etInputDateOfDeath.text.toString()
                ,inputBinding.etInputPersonDesc.text.toString()
                ,inputBinding.etInputImageURL.text.toString())

        val intentToMain = Intent(this, MainActivity::class.java)
        intentToMain.putExtra("inputToMain", newPerson)
        startActivity(intentToMain)
    }
}