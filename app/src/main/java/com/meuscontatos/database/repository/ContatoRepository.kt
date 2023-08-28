package com.meuscontatos.database.repository

import android.content.Context
import com.meuscontatos.database.dao.ContatoDb
import com.meuscontatos.model.Contato

class ContatoRepository(context: Context) {

    private val db = ContatoDb.getDatabase(context).contatoDao()

    fun salvar(contato: Contato): Long {
        return db.save(contato)
    }

    fun atualizar(contato: Contato): Int {
        return db.update(contato)
    }

    fun excluir(contato: Contato): Int {
        return db.delete(contato)
    }

    fun listarContatos(): List<Contato> {
        return db.getAll()
    }

    fun buscarContatoPeloId(id: Int): Contato {
        return db.findById(id)
    }

}