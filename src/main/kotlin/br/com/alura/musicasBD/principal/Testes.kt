package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.dados.DAO.AlbumDAO
import br.com.alura.musicasBD.dados.BancoDeDados
import br.com.alura.musicasBD.dados.DAO.BandaDAO
import br.com.alura.musicasBD.modelos.Album

fun main(){
    val manager = BancoDeDados.getEntityManager()

    val albumDAO = AlbumDAO(manager)
    val bandaDAO = BandaDAO(manager)
    val titas = bandaDAO.recuperarPeloId(1)

    val goBack = Album("Go Back", titas)
    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)

    albumDAO.adicionar(cabecaDinossauro)
    albumDAO.adicionar(goBack)

    val listaAlbuns = albumDAO.getLista()
    println(listaAlbuns)

    manager.close()
}