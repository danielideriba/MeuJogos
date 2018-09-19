package br.meujogos.com.meujogos.listajogos

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.View
import br.meujogos.com.meujogos.model.Jogo
import kotlinx.android.synthetic.main.meus_jogos_item.view.*

class JogoViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

    fun bindView(jogo: Jogo,
                 listener: (Jogo) -> Unit) = with(itemView){

        tvTitulo.text = jogo.titulo
        tvAno.text = jogo.ano.toString()
        tvDescricao.text = jogo.descricao
        ivJogo.setImageDrawable(ContextCompat.getDrawable(itemView.context, jogo.resourceId))

        setOnClickListener{
            listener(jogo)
        }
    }
}