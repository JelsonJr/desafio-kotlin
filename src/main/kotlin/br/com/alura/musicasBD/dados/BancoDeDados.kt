package br.com.alura.musicasBD.dados

import javax.persistence.EntityManager
import javax.persistence.Persistence

object BancoDeDados {

    fun getEntityManager(): EntityManager {
        val factory = Persistence.createEntityManagerFactory("musicas")
        return factory.createEntityManager()
    }
}