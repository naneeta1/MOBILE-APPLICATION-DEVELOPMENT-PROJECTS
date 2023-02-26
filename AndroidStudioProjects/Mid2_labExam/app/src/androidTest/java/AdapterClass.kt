import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mid2_labexam.R
import com.example.mid2_labexam.pdt


class AdapterClass(context: Context, resource:Int, objects:Array<out pdt> )
    : ArrayAdapter<pdt>(context,resource,objects) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.row,view,false)
        }

        var image = view!!.findViewById<ImageView>(R.id.imageView)
        var name = view!!.findViewById<TextView>(R.id.name1)
        var quantity = view!!.findViewById<TextView>(R.id.quantity1)
        var price = view!!.findViewById<TextView>(R.id.price1)


        val user = getItem(position)
        name.text = user!!.name
        quantity.text = user!!.quantity
        price.text = user!!.price
        image.setImageResource(user!!.img)

        return view!!
    }
}
