package com.example.worldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 - Adapter View: List view

        listView = findViewById(R.id.listView)

        //2 -Data Source: Array Of Strings


        // 3 - Adaptor

        var adapter = MyAdapter(this,generateData())

        listView?.adapter = adapter

adapter?.notifyDataSetChanged()



        }
    fun generateData(): ArrayList<CountryModel> {

        var countriesList = ArrayList<CountryModel>()

        val country1 = CountryModel("Germany", "4", R.drawable.germany)
        countriesList.add(country1)

        val country2 = CountryModel("Brazil", "5", R.drawable.brazil)
        countriesList.add(country2)

// Continue this pattern for country3 to country15
        val country3 = CountryModel("Argentina", "2", R.drawable.argentina)
        countriesList.add(country3)

        val country4 = CountryModel("France", "2", R.drawable.france)
        countriesList.add(country4)

        val country5 = CountryModel("England", "1", R.drawable.england)
        countriesList.add(country5)

        val country6 = CountryModel("Spain", "1", R.drawable.spain)
        countriesList.add(country6)

        val country7 = CountryModel("Belgium", "0", R.drawable.belgium)
        countriesList.add(country7)

        val country8 = CountryModel("Netherlands", "0", R.drawable.netherlands)
        countriesList.add(country8)

        val country9 = CountryModel("Portugal", "0", R.drawable.portugal)
        countriesList.add(country9)

        val country10 = CountryModel("Denmark", "0", R.drawable.denmark)
        countriesList.add(country10)

        val country11 = CountryModel("Uruguay", "2", R.drawable.uruguay)
        countriesList.add(country11)

        val country12 = CountryModel("Switzerland", "0", R.drawable.switzerland)
        countriesList.add(country12)

        val country13 = CountryModel("Croatia", "0", R.drawable.croatia)
        countriesList.add(country13)

        val country14 = CountryModel("Senegal", "0", R.drawable.senegal)
        countriesList.add(country14)

        val country15 = CountryModel("Serbia", "0", R.drawable.serbia)
        countriesList.add(country15)

        val country16 = CountryModel("Poland", "0", R.drawable.poland)
        countriesList.add(country16)

        val country17 = CountryModel("Morocco", "0", R.drawable.morocco)
        countriesList.add(country17)

        val country18 = CountryModel("Cameroon", "0", R.drawable.cameroon)
        countriesList.add(country18)

        val country19 = CountryModel("Ghana", "0", R.drawable.ghana)
        countriesList.add(country19)

        val country20 = CountryModel("Canada", "0", R.drawable.canada)
        countriesList.add(country20)

        val country21 = CountryModel("Qatar", "0", R.drawable.qatar)
        countriesList.add(country21)

        val country22 = CountryModel("Ecuador", "0", R.drawable.ecuador)
        countriesList.add(country22)

        val country23 = CountryModel("Saudi Arabia", "0", R.drawable.saudi_arabia)
        countriesList.add(country23)

        val country24 = CountryModel("Iran", "0", R.drawable.iran)
        countriesList.add(country24)

        val country25 = CountryModel("Japan", "2", R.drawable.japan)
        countriesList.add(country25)

        val country26 = CountryModel("South Korea", "0", R.drawable.south_korea)
        countriesList.add(country26)

        val country27 = CountryModel("China", "0", R.drawable.china)
        countriesList.add(country27)

        val country28 = CountryModel("Tunisia","0",R.drawable.tunisia)
        countriesList.add(country28)

        val country29 = CountryModel("Australia", "0", R.drawable.australia)
        countriesList.add(country29)

        val country30 = CountryModel("Wales", "0", R.drawable.wales)
        countriesList.add(country30)

        val country31 = CountryModel("Costa Rica", "0", R.drawable.costa_rica)
        countriesList.add(country31)

        val country32 = CountryModel("New Zealand", "0", R.drawable.new_zealand)
        countriesList.add(country32)



        return countriesList
    }


}
