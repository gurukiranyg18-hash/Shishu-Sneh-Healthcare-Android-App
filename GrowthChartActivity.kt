package com.shishusneh.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.shishusneh.R

class GrowthChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_growth_chart)

        val chart =
            findViewById<LineChart>(R.id.lineChart)

        val entries = ArrayList<Entry>()

        entries.add(Entry(1f, 3f))
        entries.add(Entry(2f, 4f))
        entries.add(Entry(3f, 5f))
        entries.add(Entry(4f, 6f))

        val dataSet =
            LineDataSet(entries, "Weight Progress")

        val lineData = LineData(dataSet)

        chart.data = lineData

        chart.invalidate()
    }
}
