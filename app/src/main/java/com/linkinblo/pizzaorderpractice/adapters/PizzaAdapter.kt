package com.linkinblo.pizzaorderpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.linkinblo.pizzaorderpractice.R
import com.linkinblo.pizzaorderpractice.datas.Store
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.pizza_store_list_item.view.*

class PizzaAdapter(
    val mContext: Context,
    val resId:Int,
    val mList: ArrayList<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.pizza_store_list_item, null)
        }
        val row = tempRow!!

        val pizzaData = mList[position]

        val firstImg = row.findViewById<CircleImageView>(R.id.firstImg)
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)


        nameTxt.text = pizzaData.name

        return row
    }


}