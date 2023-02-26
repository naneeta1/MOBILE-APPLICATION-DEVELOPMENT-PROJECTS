package com.example.lab6_4

import android.content.ContentValues
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.File
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var ids: ArrayList<Int>
    lateinit var stories: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var rand = Random(5)
        val words = arrayOf(
            arrayOf("<job>", "<adjective>"),
            arrayOf(
                "<adjective",
                "plural-noun",
                "noun",
                "adjective",
                "place",
                "plural-noun",
                "noun",
                "funny-noise",
                "adjective",
                "noun",
                "adjective",
                "plural-noun",
                "<person's-name>"
            ),
            arrayOf(
                "<adjective>",
                "<plural-noun>",
                "<plural-noun>",
                "<plural-noun>",
                "<adjective>",
                "<adjective>",
                "<plural-noun>",
                "<number>",
                "<noun>",
                "<plural-noun>",
                "<adjective>",
                "<job-title>",
                "<job-title>",
                "<noun>",
                "<plural-noun>",
                "<adjective>"
            ),
            arrayOf(
                "<Male-Name>",
                "<adjective>",
                "<CITY>",
                "<adjective>",
                "<unusual-adjective>",
                "<plural-noun>",
                "<plural-noun>",
                "<plural-noun>",
                "<plural-noun>",
                "<Color!>",
                "<adjective>",
                "<Exciting-adjective>",
                "<plural-noun>",
                "<Interesting-Adjective>"
            ),
            arrayOf(
                "<aDvErB>",
                "<NUMBER>",
                "<Plural-Noun>",
                "<verb>",
                "<body-part>",
                "<verb>",
                "<adverb>",
                "<pluRAL-nOUN>",
                "<plural-noun>",
                "<plural-noun>",
                "<FUNNY-noise>",
                "<verb>",
                "<Number>",
                "<verB>"
            )
        )

        val arr = arrayOf(
            "I wannabe a <job> when I grow up.\n" +
                    "Just like my dad.\n" +
                    "Life is <adjective> like that!",
            ("One of the most <adjective> characters in fiction is named\n" +
                    "\"Tarzan of the <plural-noun> .\" Tarzan was raised by a/an\n" +
                    "<noun> and lives in the <adjective> jungle in the\n" +
                    "heart of darkest <place> . He spends most of his time\n" +
                    "eating <plural-noun> and swinging from tree to <noun> .\n" +
                    "Whenever he gets angry, he beats on his chest and says,\n" +
                    "\" <funny-noise> !\" This is his war cry. Tarzan always dresses in\n" +
                    "<adjective> shorts made from the skin of a/an <noun>\n" +
                    "and his best friend is a/an <adjective> chimpanzee named\n" +
                    "Cheetah. He is supposed to be able to speak to elephants and\n" +
                    "<plural-noun> . In the movies, Tarzan is played by <person's-name> ."),
            ("Our American universities offer students many <adjective>\n" +
                    "courses that will prepare them to become professional <plural-noun> .\n" +
                    "You can get a degree as a Bachelor of <plural-noun> or take a\n" +
                    "regular liberal <plural-noun> course. Or, if you want to become\n" +
                    "a/an <adjective> engineer, you can study <adjective> mathematics\n" +
                    "and differential <plural-noun> . Then, after <number> years, if\n" +
                    "you want to continue your studies you can write a/an <noun> and\n" +
                    "become a Doctor of <plural-noun> . \n" +
                    "\n" +
                    "When you get out into the <adjective> world, if you have a diploma \n" +
                    "from a university, you will be able to get a job easily as a/an <job-title> \n" +
                    "or even a/an <job-title> . If you don't have a diploma, you may have to take\n" +
                    "a job as a <noun> . \n" +
                    "\n" +
                    "Remember, it's important that you study hard in high school so you are able \n" +
                    "to do well on your college entrance <plural-noun> . It is true that \"a little \n" +
                    "learning is a/an <adjective> thing.\""),
            ("<Male-Name> has announced that his <adjective>\n" +
                    "clothing store in the heart of downtown <CITY> is having\n" +
                    "a/an <adjective> sale of all merchandise, including\n" +
                    "<unusual-adjective> suits and slightly irregular <plural-noun>\n" +
                    "available. Men's cable-knit <plural-noun> , only $15.99.\n" +
                    "Hand-woven Italian <plural-noun> , 1/2-price. Double-\n" +
                    "breasted cashmere <plural-noun> , $50.00. Genuine imported\n" +
                    "<Color!> <adjective> shoes, <Exciting-adjective> handerchiefs,\n" +
                    "and women's embroidered <plural-noun> , all at rock-bottom prices.\n" +
                    "This is a chance to get some really <Interesting-Adjective> bargains."),
            ("Here's how you dance the Monstrosity. Stand with your feet together.\n" +
                    "Now, move your left foot <aDvErB> to the side. Now stamp your\n" +
                    "right foot <NUMBER> times and put your hands on your partner's\n" +
                    "<Plural-Noun> . Next, you both <verb> slowly to the right and bend\n" +
                    "your <body-part> backward. For the next eight counts,\n" +
                    "both of you <verb> <adverb> to the left. Next, you and\n" +
                    "your partner stand back to back and wiggle your <pluRAL-nOUN> and\n" +
                    "slap your <plural-noun> together. Don't forget to keep stamping\n" +
                    "your right foot. Now, face your partner again, put your <plural-noun>\n" +
                    "together and shout, \" <FUNNY-noise> !\" Now, <verb> backward\n" +
                    "and repeat the whole thing <Number> times. If you feel that you can't\n" +
                    "learn this dance, you can always <verB> the next one out.")
        )




        ids = ArrayList()
        stories = ArrayList()

        var getStarted = findViewById<Button>(R.id.button)
        getStarted.setOnClickListener(View.OnClickListener {
            var intent= Intent(this,MainActivity2::class.java)
            var rand = (0..4).random()

            // intent.putExtra("ind",rand)
            intent.putExtra("story", arr[rand])
            intent.putExtra("placeholder", words[rand])
            startActivity(intent)

        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflate = getMenuInflater()
        inflate.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.storyItem){
            var intent = Intent(this,StoryActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

}
