package br.com.alura.musicasBD.dados.DAO

import br.com.alura.musicasBD.dados.entity.AlbumEntity
import br.com.alura.musicasBD.extensions.toEntity
import br.com.alura.musicasBD.extensions.toModel
import br.com.alura.musicasBD.modelos.Album
import javax.persistence.EntityManager

class AlbumDAO(manager: EntityManager)
    : DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java) {
    override fun toEntity(model: Album): AlbumEntity {
        return model.toEntity()
    }

    override fun toModel(entity: AlbumEntity): Album {
        return entity.toModel()
    }
}