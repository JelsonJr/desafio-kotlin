package br.com.alura.musicasBD.extensions

import br.com.alura.musicasBD.dados.entity.AlbumEntity
import br.com.alura.musicasBD.modelos.Album

fun Album.toEntity() = AlbumEntity(this.titulo, this.banda.toEntity(), this.id)
fun AlbumEntity.toModel() = Album(this.titulo, this.banda.toModel(), this.id)
