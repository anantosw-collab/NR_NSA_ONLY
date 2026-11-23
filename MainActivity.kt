package com.nr.nsa.only

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val layout = LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; gravity=Gravity.CENTER; setPadding(36,36,36,36) }
    val title = TextView(this).apply { text="NR_NSA ONLY"; textSize=28f; gravity=Gravity.CENTER; setPadding(0,0,0,28) }
    val note = TextView(this).apply { text="Shortcut menu band selection Samsung\n(*#2263#)\n\nKetersediaan menu bergantung pada firmware dan operator."; textSize=16f; gravity=Gravity.CENTER; setPadding(0,0,0,24) }
    val button = Button(this).apply { text="BUKA NR / BAND SELECTION" }
    button.setOnClickListener {
      val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:*#2263#"))
      startActivity(intent)
    }
    layout.addView(title); layout.addView(note); layout.addView(button)
    setContentView(layout)
  }
}
