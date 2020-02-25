package ms.zem.mvvm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListNumberAdapter(private val lista : List<Int>?) : RecyclerView.Adapter<ListNumberAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        lista?.let {
            holder.bindView(lista[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() : Int {
        return if (lista.isNullOrEmpty()) 0 else lista.size
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val item = itemView.numero

        fun bindView(numero: Int){
            item.text = numero.toString()
        }
    }

}
