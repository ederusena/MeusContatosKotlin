package com.meuscontatos.database.dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.meuscontatos.model.Contato

@Dao
interface ContatoDao {

    @Insert
    fun save(contato: Contato): Long

    @Update
    fun update(contato: Contato): Int

    @Delete
    fun delete(contato: Contato): Int

    @Query("SELECT * FROM TBL_CONTATO WHERE id = :id")
    fun findById(id: Int): Contato

    @Query("SELECT * FROM TBL_CONTATO ORDER BY nome ASC")
    fun getAll(): List<Contato>

}