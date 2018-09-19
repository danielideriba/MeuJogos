package br.meujogos.com.meujogos.listajogos

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import br.meujogos.com.meujogos.R
import br.meujogos.com.meujogos.model.Jogo

class JogosAdapter(val context: Context,
                   val jogos: List<Jogo>,
                   val  listener: (Jogo) -> Unit): RecyclerView.Adapter<JogoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.meus_jogos_item, parent, false)
        return JogoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return jogos.size
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        val jogo = jogos[position]
        holder?.let{
            it.bindView(jogo, listener)
        }
    }

}