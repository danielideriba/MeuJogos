package br.meujogos.com.meujogos.listajogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.RelativeLayout
import android.widget.Toast
import br.meujogos.com.meujogos.R
import br.meujogos.com.meujogos.detalheJogo.DetalheActivity
import br.meujogos.com.meujogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)

        rvJogos.adapter = JogosAdapter(this, getJogos(), {
           val detalheIntent = Intent(this, DetalheActivity::class.java)
            detalheIntent.putExtra("JOGO", it)
           startActivity(detalheIntent)
        })

        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun getJogos(): List<Jogo> {
        return listOf(
                Jogo(R.drawable.image1, "MegaMen", 2010, "Não informada"),
                Jogo(R.drawable.image2, "NIOH", 2011, "Não informada"),
                Jogo(R.drawable.image3, "SpiderMan", 2012, "Não informada"),
                Jogo(R.drawable.image4, "Ratchet Clack", 2014, "Não informada"),
                Jogo(R.drawable.image5, "Horizon ZERO DOWN", 2018, "Não informada")

        )
    }
}
