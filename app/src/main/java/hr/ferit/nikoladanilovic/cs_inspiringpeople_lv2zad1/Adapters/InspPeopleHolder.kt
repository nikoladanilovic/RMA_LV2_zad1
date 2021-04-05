package hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.Adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.Model.InspiringPerson
import hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.R
import hr.ferit.nikoladanilovic.cs_inspiringpeople_lv2zad1.databinding.ItemInspiringPersonBinding

class InspPeopleHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(person: InspiringPerson) {
        val itemBinding = ItemInspiringPersonBinding.bind(itemView)
        Picasso.get()
            .load(person.cover)
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .error(android.R.drawable.stat_notify_error)
            .into(itemBinding.imvInspPersonImg)
        itemBinding.tvDates.text = person.dateOfBirth + person.dateOfDeath
        itemBinding.tvPersonDesc.text = person.description
    }
}