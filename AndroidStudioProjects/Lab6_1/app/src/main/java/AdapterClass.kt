import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.lab6_1.R
import com.example.lab6_1.user

class AdapterClass(context: Context,resource:Int,objects:Array<out user> )
    :ArrayAdapter<user>(context,resource,objects) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

            var view = convertView
            if(view==null){
                view = LayoutInflater.from(context).inflate(R.layout.row,view,false)
            }

            var image = view!!.findViewById<ImageView>(R.id.image)
            var name = view!!.findViewById<TextView>(R.id.Name)
            var email = view!!.findViewById<TextView>(R.id.email)
            var phone = view!!.findViewById<TextView>(R.id.phone)

            val user = getItem(position)
            name.text = user!!.name
            email.text = user!!.email
            phone.text = user!!.phone
            image.setImageResource(user!!.img)

            return view!!
    }
}


